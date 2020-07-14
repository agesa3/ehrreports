package org.openmrs.module.ehrreports.reporting.library.cohorts;

import java.util.Date;
import java.util.List;
import org.openmrs.module.ehrreports.metadata.OutpatientMetadata;
import org.openmrs.module.ehrreports.reporting.library.queries.moh705.Moh705Queries;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportUtils;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CompositionCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh705bCohortQueries {

  @Autowired private OutpatientMetadata outpatientMetadata;

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
}
