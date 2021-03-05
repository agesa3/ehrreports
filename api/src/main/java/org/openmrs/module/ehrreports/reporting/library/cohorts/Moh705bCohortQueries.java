package org.openmrs.module.ehrreports.reporting.library.cohorts;

import java.util.Date;
import java.util.List;
import org.openmrs.Concept;
import org.openmrs.module.ehrreports.metadata.EhrDiagnosisMetadata;
import org.openmrs.module.ehrreports.metadata.EhrOutpatientMetadata;
import org.openmrs.module.ehrreports.reporting.library.queries.moh705.Moh705Queries;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportConstants;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportUtils;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CompositionCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh705bCohortQueries {

  @Autowired private EhrOutpatientMetadata outpatientMetadata;

  @Autowired private EhrDiagnosisMetadata diagnosisMetadata;

  @Autowired private Moh705aCohortQueries moh705aCohortQueries;

  @Autowired private AgeCohortQueries ageCohortQueries;

  @Autowired private CommonLibrary commonLibrary;

  /**
   * Get children patients who have given diagnosis - MOH705B
   *
   * @return @{@link org.openmrs.module.reporting.cohort.definition.CohortDefinition}
   */
  public CohortDefinition getAdultsPatientsWhoHaveDiagnosis(List<Integer> list) {
    SqlCohortDefinition cd = new SqlCohortDefinition();
    cd.setName("Get adults patients who have diagnosis");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.setQuery(
        Moh705Queries.getAdultPatientsWhoMatchDiagnosisBasedOnConcepts(
            outpatientMetadata.getDiagnosisConceptClass().getConceptClassId(), list));
    return cd;
  }

  /**
   * Get adults patients having any diagnosis specified in the observation collected
   *
   * @return @{@link CohortDefinition} of patient ids of adult patients
   */
  public CohortDefinition getAdultsPatientsWithAllDiagnosisRecorded() {
    SqlCohortDefinition cd = new SqlCohortDefinition();
    cd.setName("Get Adults patients who have diagnosis - all");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.setQuery(
        Moh705Queries.getAdultsPatientsWhoMatchDiagnosisAll(
            outpatientMetadata.getDiagnosisConceptClass().getConceptClassId()));
    return cd;
  }

  /**
   * Get first 10 diseases to exclude form the main query of other diseases
   *
   * @return @{@link CohortDefinition}
   */
  private CohortDefinition get1st10DiseasesToExcludeFromMainQuery705b() {
    CompositionCohortDefinition cd = new CompositionCohortDefinition();
    cd.setName("Get other Adults diagnosis other than the ones classified first 10");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.addSearch(
        "1",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getDiarrhoeaConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "2",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getTuberculosisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "3",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getDysenteryList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "4",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getCholeraList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "5",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getMenongococcalInfectionsList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "6",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getOtherMeningitisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "7",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getTetanusConceptList()),
            "startDate=${startDate},endDate=${endDate}"));

    cd.addSearch(
        "8",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getAcutePoliomyelitisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "9",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getChickenPoxConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "10",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getMeaslesConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.setCompositionString("1 OR 2 OR 3 OR 4 OR 5 OR 6 OR 7 OR 8 OR 9 OR 10");
    return cd;
  }

  /**
   * Get all other diseases recorded within the month that are NOT classfied
   *
   * @return @{@link CohortDefinition}
   */
  public CohortDefinition getAdultsOtherIllinessThatAreNotClassified() {
    CompositionCohortDefinition cd = new CompositionCohortDefinition();
    cd.setName("Get other adults diagnosis other than the ones classified");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.addSearch(
        "ALL",
        EhrReportUtils.map(
            getAdultsPatientsWithAllDiagnosisRecorded(),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "first10",
        EhrReportUtils.map(
            get1st10DiseasesToExcludeFromMainQuery705b(),
            "startDate=${startDate},endDate=${endDate}"));
    cd.setCompositionString("ALL AND NOT (first10)");
    return cd;
  }

  /**
   * Get number of first/revisit attendancies column 66 and 67
   *
   * @return @CohortDefinition
   */
  public CohortDefinition getNewAndRevisitPatients(EhrReportConstants.OccurenceStates state) {
    return moh705aCohortQueries.getNewAndRevisitPatients(state);
  }

  /**
   * Get new and reattendancies of Adults
   *
   * @return @{@link CohortDefinition}
   */
  public CohortDefinition getNewAndRevisitsOfAdults(EhrReportConstants.OccurenceStates state) {
    CompositionCohortDefinition cd = new CompositionCohortDefinition();
    cd.setName("Get patients with new and reattendances for children");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.addSearch(
        "age",
        EhrReportUtils.map(
            ageCohortQueries.createXtoYAgeCohort("age", 5, null), "effectiveDate=${endDate}"));
    cd.addSearch(
        "state", EhrReportUtils.map(getNewAndRevisitPatients(state), "onOrBefore=${endDate}"));
    cd.setCompositionString("state AND age");
    return cd;
  }

  /**
   * Get patients with referals based on age
   *
   * @return @{@link CohortDefinition}
   */
  public CohortDefinition getAdultsPatientsReferredToFacility() {
    CompositionCohortDefinition cd = new CompositionCohortDefinition();
    cd.setName("Adult referred to other health facilities");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.addSearch(
        "age",
        EhrReportUtils.map(
            ageCohortQueries.createXtoYAgeCohort("age", 5, null), "effectiveDate=${endDate}"));
    cd.addSearch(
        "obs",
        EhrReportUtils.map(
            commonLibrary.hasObs(outpatientMetadata.getPatientReferredFrom()),
            "onOrAfter=${startDate},onOrBefore=${endDate}"));
    cd.setCompositionString("obs AND age");
    return cd;
  }

  /**
   * Get patients with referals based on age adults
   *
   * @return @{@link CohortDefinition}
   */
  public CohortDefinition getAdultsPatientsReferredFromFacility() {
    CompositionCohortDefinition cd = new CompositionCohortDefinition();
    cd.setName("Adult referred to other health facilities");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.addSearch(
        "age",
        EhrReportUtils.map(
            ageCohortQueries.createXtoYAgeCohort("age", 5, null), "effectiveDate=${endDate}"));
    cd.addSearch(
        "obs",
        EhrReportUtils.map(
            commonLibrary.hasObs(outpatientMetadata.getPatientReferredExternally()),
            "onOrAfter=${startDate},onOrBefore=${endDate}"));
    cd.setCompositionString("obs AND age");
    return cd;
  }

  /**
   * Get patient shaving provisional malaria
   *
   * @return @CohortDefinition
   */
  public CohortDefinition getMalariaCases(Concept concept) {
    CompositionCohortDefinition cd = new CompositionCohortDefinition();
    cd.setName("Get adult patients with provisional/final malaria cases");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.addSearch(
        "malaria",
        EhrReportUtils.map(
            getAdultsPatientsWhoHaveDiagnosis(diagnosisMetadata.getMalariaConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
    cd.addSearch(
        "status",
        EhrReportUtils.map(
            commonLibrary.hasObs(concept), "onOrAfter=${startDate},onOrBefore=${endDate}"));
    cd.setCompositionString("malaria AND status");
    return cd;
  }

  private CohortDefinition getPatientsWith25BmiAndAbove() {
    SqlCohortDefinition cd = new SqlCohortDefinition();
    cd.setName("Get patients with BMI of over 25 query evalution");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.setQuery(Moh705Queries.getAdultsPatientsWithGreaterThan25BMI());
    return cd;
  }

  /**
   * Get new and reattendancies of Adults
   *
   * @return @{@link CohortDefinition}
   */
  public CohortDefinition getBmiOfAdults() {
    CompositionCohortDefinition cd = new CompositionCohortDefinition();
    cd.setName("Get patients with BMI of over 25");
    cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
    cd.addParameter(new Parameter("endDate", "End Date", Date.class));
    cd.addSearch(
        "age",
        EhrReportUtils.map(
            ageCohortQueries.createXtoYAgeCohort("age", 5, null), "effectiveDate=${endDate}"));
    cd.addSearch(
        "bmi",
        EhrReportUtils.map(
            getPatientsWith25BmiAndAbove(), "startDate=${startDate},endDate=${endDate}"));
    cd.setCompositionString("bmi AND age");
    return cd;
  }
}
