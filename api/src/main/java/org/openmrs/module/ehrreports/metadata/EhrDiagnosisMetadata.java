package org.openmrs.module.ehrreports.metadata;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EhrDiagnosisMetadata extends EhreportsMetadata {
  @Autowired private EhrOutpatientMetadata outpatientMetadata;

  /**
   * Get all diarrohea concepts as a list
   *
   * @return List<Interger></Interger>
   */
  public List<Integer> getDiarrhoeaConceptList() {
    return Arrays.asList(
        outpatientMetadata.getAcuteDiarrhoea().getConceptId(),
        outpatientMetadata.getDiarrheaUnspecified().getConceptId(),
        outpatientMetadata.getFunctionalDiarrhoea().getConceptId(),
        outpatientMetadata.getChronicDiarrhoea().getConceptId(),
        outpatientMetadata.getDiarrhoeaAndGastroenteritisOfPresumesInfectionOrigin().getConceptId(),
        outpatientMetadata.getHemorrhagicDiarrhea().getConceptId(),
        outpatientMetadata.getBacterialGastroenteritis().getConceptId());
  }

  public List<Integer> getTuberculosisConceptList() {
    return Arrays.asList(
        outpatientMetadata.getTuberculosisConcept().getConceptId(),
        outpatientMetadata.getTBOtherOrgansConcept().getConceptId(),
        outpatientMetadata.getTBInPregnancyConcept().getConceptId(),
        outpatientMetadata.getTBAffectingCentralNervousSystemConcept().getConceptId(),
        outpatientMetadata.getTBOfTheGenitourinarySystemConcept().getConceptId(),
        outpatientMetadata.getMiliaryTBConcept().getConceptId(),
        outpatientMetadata.getPulmonaryTBConcept().getConceptId(),
        outpatientMetadata.getSequelaeOfTBConcept().getConceptId(),
        outpatientMetadata.getRespiratoryTBConcept().getConceptId(),
        outpatientMetadata.getRespiratoryTBUnsuspectedConcept().getConceptId(),
        outpatientMetadata.getTBHistologicallyConfirmedConcept().getConceptId(),
        outpatientMetadata
            .getRespiratoryTBNotConfirmedBacteriologicallyAndHistologicallyConcept()
            .getConceptId(),
        outpatientMetadata.getExtrapulmonaryTBConcept().getConceptId(),
        outpatientMetadata.getAcuteMiliaryTBUspecifiedConcept().getConceptId(),
        outpatientMetadata.getOtherRespiratoryTBConcept().getConceptId(),
        outpatientMetadata.getMultiDrugResistantTBConcept().getConceptId(),
        outpatientMetadata.getSputumPositivePulmonaryTB().getConceptId(),
        outpatientMetadata.getSputumNegativeTBConcept().getConceptId(),
        outpatientMetadata.getContactWithAndExposureToTB().getConceptId(),
        outpatientMetadata.getEncounterForScreeningForRespiratoryTB().getConceptId());
  }

  public List<Integer> getDysenteryList() {
    return Arrays.asList(
        outpatientMetadata.getDysentery().getConceptId(),
        outpatientMetadata.getAmoebicDysentery().getConceptId(),
        outpatientMetadata.getBacillaryDysentery().getConceptId(),
        outpatientMetadata.getShigellaDysentery().getConceptId());
  }

  public List<Integer> getMenongococcalInfectionsList() {
    return Arrays.asList(
        outpatientMetadata.getMeningococcalInfections().getConceptId(),
        outpatientMetadata.getMeningococcalMenengaitis().getConceptId(),
        outpatientMetadata.getMeningococcalNos().getConceptId());
  }

  public List<Integer> getOtherMeningitisConceptList() {
    return Arrays.asList(
        outpatientMetadata.getBacterialMeningitisConcept().getConceptId(),
        outpatientMetadata.getCryptococcalMeningitisConcept().getConceptId(),
        outpatientMetadata.getViralMeningitisConcept().getConceptId());
  }

  //
  public List<Integer> getNeonatorumTetanusConceptList() {
    return Arrays.asList(outpatientMetadata.getTetanusNeonatorumTetanus().getConceptId());
  }

  public List<Integer> getTetanusConceptList() {
    return Arrays.asList(
        outpatientMetadata.getTetanus().getConceptId(),
        outpatientMetadata.getObstericalTetanus().getConceptId());
  }

  public List<Integer> getAcutePoliomyelitisConceptList() {
    return Arrays.asList(outpatientMetadata.getAcutePoliomyelitisConcept().getConceptId());
  }

  public List<Integer> getChickenPoxConceptList() {
    return Arrays.asList(outpatientMetadata.getChickenPoxConcept().getConceptId());
  }

  public List<Integer> getMeaslesConceptList() {
    return Arrays.asList(
        outpatientMetadata.getMeaslesConcept().getConceptId(),
        outpatientMetadata.getMeaslesWithoutComplicationConcept().getConceptId(),
        outpatientMetadata.getGermanMeaslesConcept().getConceptId());
  }

  public List<Integer> getHepatitisConceptList() {
    return Arrays.asList(
        outpatientMetadata.getHepatitisAConcept().getConceptId(),
        outpatientMetadata.getHepatitisNosConcept().getConceptId(),
        outpatientMetadata.getHepatitisBConcept().getConceptId(),
        outpatientMetadata.getHepatitisCConcept().getConceptId(),
        outpatientMetadata.getHepatitisEConcept().getConceptId(),
        outpatientMetadata.getViralHepatitisAConcept().getConceptId(),
        outpatientMetadata.getViralHepatitisBConcept().getConceptId(),
        outpatientMetadata.getViralMeningitisConcept().getConceptId(),
        outpatientMetadata.getViralHepatitisDConcept().getConceptId(),
        outpatientMetadata.getViralHepatitisEConcept().getConceptId(),
        outpatientMetadata.getLiverInfectionWithHepatitisAConcept().getConceptId());
  }

  public List<Integer> getMumpsConceptList() {
    return Arrays.asList(outpatientMetadata.getMumpsConcept().getConceptId());
  }

  public List<Integer> getFeversConceptList() {
    return Arrays.asList(
        outpatientMetadata.getFeverConcept().getConceptId(),
        outpatientMetadata.getFeverOfUnknownOriginConcept().getConceptId(),
        outpatientMetadata.getRespiratoryDistressHaemorrhagicFeversConcept().getConceptId());
  }

  public List<Integer> getMalariaConceptList() {
    return Arrays.asList(
        outpatientMetadata.getClinicalMalariaConcept().getConceptId(),
        outpatientMetadata.getMalariaDueToSimianPlasmodiaConcept().getConceptId(),
        outpatientMetadata.getPlasmodiumMalariaeMalariaConcept().getConceptId(),
        outpatientMetadata.getUnspecifiedMalariaConcept().getConceptId(),
        outpatientMetadata.getOtherCongenitalMalariaConcept().getConceptId(),
        outpatientMetadata.getOtherSpecifiedMalariaConcept().getConceptId(),
        outpatientMetadata.getConfirmedMalariaConcept().getConceptId(),
        outpatientMetadata.getPFCMUMalariaConcept().getConceptId(),
        outpatientMetadata.getOMNEMalaria_ClassifiedConcept().getConceptId(),
        outpatientMetadata.getCongenitalFalcrumMalariaConcept().getConceptId(),
        outpatientMetadata.getPlasmodiumFalcrumMalariaConcept().getConceptId(),
        outpatientMetadata.getPlasmodiumVivaxMalariaConcept().getConceptId(),
        outpatientMetadata.getMalariaInPregnancyConcept().getConceptId(),
        outpatientMetadata.getPresumptiveMalariaWithPregnancyConcept().getConceptId(),
        outpatientMetadata.getConfirmedMalariaWithPregnancyConcept().getConceptId(),
        outpatientMetadata
            .getPresumptive_malaria_with_minor_digestive_symptoms_pregnantConcept()
            .getConceptId(),
        outpatientMetadata
            .getConfirmed_malaria_with_minor_digestive_symptoms_pregnantConcept()
            .getConceptId(),
        outpatientMetadata.getSevereMalariaConcept().getConceptId(),
        outpatientMetadata
            .getMalaria_confirmed_with_minor_digestive_symptomsConcept()
            .getConceptId());
  }

  public List<Integer> getMalariaInPregnancyList() {
    return Arrays.asList(outpatientMetadata.getMalariaInPregnancyConcept().getConceptId());
  }

  public List<Integer> getUrinaryTractInfectionConceptList() {
    return Arrays.asList(
        outpatientMetadata.getUrinaryTractInfecionConcept().getConceptId(),
        outpatientMetadata.getUrinaryTractInfecionInPregnancyConcept().getConceptId(),
        outpatientMetadata.getUrinaryTractInfecionInPregnancyNotSpecifiedConcept().getConceptId(),
        outpatientMetadata
            .getInfectionOfOtherPartsOfUrinayTractConceptInPregnancyConcept()
            .getConceptId(),
        outpatientMetadata.getInfectionOfOtherStomaOfUrinayTractConcept().getConceptId());
  }

  public List<Integer> getTyphoidFeverConceptList() {
    return Arrays.asList(outpatientMetadata.getTyphoidFeverConcept().getConceptId());
  }

  public List<Integer> getBilharziaConceptList() {
    return Arrays.asList(
        outpatientMetadata.getBilhaziaConcept().getConceptId(),
        outpatientMetadata.getOtherSchitosomiasisConcept().getConceptId());
  }

  public List<Integer> getIntestinalWormsConceptist() {
    return Arrays.asList(outpatientMetadata.getIntestnalWormsConcept().getConceptId());
  }

  public List<Integer> getMalnutritionConceptist() {
    return Arrays.asList(
        outpatientMetadata.getMalnutritionConcept().getConceptId(),
        outpatientMetadata.getProteinEnergyMalnutritionConcept().getConceptId());
  }

  public List<Integer> getAnaemiaConceptList() {
    return Arrays.asList(
        outpatientMetadata.getAnaemiaUnspecifiedConcept().getConceptId(),
        outpatientMetadata.getHaemolyticAnaemiaConcept().getConceptId(),
        outpatientMetadata.getBloodLossAnaemiaConcept().getConceptId(),
        outpatientMetadata.getSickleCellAnaemiaConcept().getConceptId());
  }

  public List<Integer> getEyeInfectionsConceptList() {
    return Arrays.asList(
        outpatientMetadata.getAsthenopiaConcept().getConceptId(),
        outpatientMetadata.getPinkEyeConcept().getConceptId(),
        outpatientMetadata.getDryEyeSyndromeConcept().getConceptId(),
        outpatientMetadata.getInjuryOfEyeConcept().getConceptId(),
        outpatientMetadata.getLowVisionBothEyeConcept().getConceptId(),
        outpatientMetadata.getOpenWoundEyelidAndPerocularAreaConcept().getConceptId(),
        outpatientMetadata.getHydrocortisoneConcept().getConceptId(),
        outpatientMetadata.getRetrobulbarNeuritisLeftEyeConcept().getConceptId(),
        outpatientMetadata.getAcuteAtopicConjuctivitisRightEyeConcept().getConceptId());
  }

  // To do -> when does an eye indicator qualify to be  put under other eye conditions
  public List<Integer> getOtherEyeConditionsConceptList() {
    return Arrays.asList(
        outpatientMetadata.getInjuryOfEyeConcept().getConceptId(),
        outpatientMetadata.getOpenWoundEyelidAndPerocularAreaConcept().getConceptId());
  }

  public List<Integer> getEarInfectionsConceptList() {
    return Arrays.asList(
        outpatientMetadata.getEarInfectionsConcept().getConceptId(),
        outpatientMetadata.getDischargeOfEarConcept().getConceptId());
  }

  public List<Integer> getUpperRespiratoryTractInfectionsConceptList() {
    return Arrays.asList(
        outpatientMetadata.getUpperRespiratoryTractInfectionConcept().getConceptId(),
        outpatientMetadata
            .getUpperRespiratoryTractInfectionHyperSensitivityReactionSiteUnspecifiedConcept()
            .getConceptId(),
        outpatientMetadata.getDiseasesOfUpperRespiratoryTractUnspecifiedConcept().getConceptId(),
        outpatientMetadata.getOtherDiseasesOfUpperRespiratoryTractConcept().getConceptId(),
        outpatientMetadata
            .getOtherSpecifiedDiseasesOfUpperRespiratoryTractConcept()
            .getConceptId());
  }

  public List<Integer> getAsthmaConceptList() {
    return Arrays.asList(
        outpatientMetadata.getAsthmaNosConcept().getConceptId(),
        outpatientMetadata.getAstheNopiaConcept().getConceptId(),
        outpatientMetadata.getAsthmaUnspecifiedConcept().getConceptId());
  }

  public List<Integer> getCholeraList() {
    return Arrays.asList(outpatientMetadata.getCholeraConcept().getConceptId());
  }

  public List<Integer> getTonsillitisConceptList() {
    return Arrays.asList(outpatientMetadata.getTonsillitisConcept().getConceptId());
  }

  public List<Integer> getPneumoniaConceptList() {
    return Arrays.asList(outpatientMetadata.getPneumoniaConcept().getConceptId());
  }

  public List<Integer> getOtherDiseaseOfRespiratorySystemConceptList() {
    return Arrays.asList(
        outpatientMetadata.getOtherDiseaseOfRespiratorySystemConcept().getConceptId());
  }

  public List<Integer> getMentalDisordersConceptList() {
    return Arrays.asList(outpatientMetadata.getMentalDisorderSConcept().getConceptId());
  }

  public List<Integer> getDentalDisordersConceptList() {
    return Arrays.asList(outpatientMetadata.getDentalDisorderSConcept().getConceptId());
  }

  public List<Integer> getJiggersInfestationConceptList() {
    return Arrays.asList(outpatientMetadata.getJiggersInfestationConcept().getConceptId());
  }

  public List<Integer> getDiseaseOfTheSkinConceptList() {
    return Arrays.asList(outpatientMetadata.getDiseaseOfTheSkinConcept().getConceptId());
  }

  public List<Integer> getChromosomalAbnormalitiesConceptList() {
    return Arrays.asList(outpatientMetadata.getChromosomalAbnormalitiesConcept().getConceptId());
  }

  public List<Integer> getCongenitalAnomaliesConceptList() {
    return Arrays.asList(outpatientMetadata.getCongenitalAnomaliesConcept().getConceptId());
  }

  public List<Integer> getPoisoningConceptList() {
    return Arrays.asList(outpatientMetadata.getPoisoningConcept().getConceptId());
  }

  public List<Integer> getRoadTrafficInjuriesConceptList() {
    return Arrays.asList(outpatientMetadata.getRoadTrafficInjuriesConcept().getConceptId());
  }

  public List<Integer> getOtherInjuriesConceptList() {
    return Arrays.asList(outpatientMetadata.getOtherInjuriesConcept().getConceptId());
  }

  public List<Integer> getSexualAssaultConceptList() {
    return Arrays.asList(outpatientMetadata.getSexualAssaultConcept().getConceptId());
  }

  public List<Integer> getBurnsConceptList() {
    return Arrays.asList(outpatientMetadata.getBurnsConcept().getConceptId());
  }

  public List<Integer> getSnakeBitesConceptList() {
    return Arrays.asList(outpatientMetadata.getSnakeBitesConcept().getConceptId());
  }

  public List<Integer> getDogBitesConceptList() {
    return Arrays.asList(outpatientMetadata.getDogBitesConcept().getConceptId());
  }

  public List<Integer> getOtherBitesConceptList() {
    return Arrays.asList(outpatientMetadata.getOtherBitesConcept().getConceptId());
  }

  public List<Integer> getDiabetesConceptList() {
    return Arrays.asList(outpatientMetadata.getOtherDiabetesConcept().getConceptId());
  }

  public List<Integer> getEpilepsyConceptList() {
    return Arrays.asList(outpatientMetadata.getEpilepsyConcept().getConceptId());
  }

  public List<Integer> getOtherConvulsiveDisordersConceptList() {
    return Arrays.asList(outpatientMetadata.getOtherConvulsiveDisordersConcept().getConceptId());
  }

  public List<Integer> getNewlyDiagnoseHivConceptList() {
    return Arrays.asList(outpatientMetadata.getNewlyDiagnosedHivConcept().getConceptId());
  }

  public List<Integer> getBrucellosisConceptList() {
    return Arrays.asList(outpatientMetadata.getBrucellosisConcept().getConceptId());
  }

  public List<Integer> getRicketsConceptList() {
    return Arrays.asList(outpatientMetadata.getRicketsConcept().getConceptId());
  }

  public List<Integer> getCardiovascularConditionConceptList() {
    return Arrays.asList(outpatientMetadata.getCardiovascularConditionConcept().getConceptId());
  }

  public List<Integer> getViolenceRelatedInjuriesConceptList() {
    return Arrays.asList(outpatientMetadata.getViolenceRelatedInjuriesConcept().getConceptId());
  }

  public List<Integer> getCerebralPalsyConceptList() {
    return Arrays.asList(outpatientMetadata.getCerebralPalsyConcept().getConceptId());
  }

  public List<Integer> getAutismConceptList() {
    return Arrays.asList(outpatientMetadata.getAutismConcept().getConceptId());
  }

  public List<Integer> getOtherCentralNarvousSytemConditionConceptList() {
    return Arrays.asList(
        outpatientMetadata.getOtherCentralNarvousSytemConditionConcept().getConceptId());
  }

  public List<Integer> getTryponosomiasisConceptList() {
    return Arrays.asList(outpatientMetadata.getTryponosomiasisConcept().getConceptId());
  }

  public List<Integer> getKalazarConceptList() {
    return Arrays.asList(outpatientMetadata.getKalazarConcept().getConceptId());
  }

  public List<Integer> getDracunculosisConceptList() {
    return Arrays.asList(outpatientMetadata.getDracunculosisConcept().getConceptId());
  }

  public List<Integer> getYellowFeverConceptList() {
    return Arrays.asList(outpatientMetadata.getYellowFeverConcept().getConceptId());
  }

  public List<Integer> getViralHaemorrhagicFeverConceptList() {
    return Arrays.asList(outpatientMetadata.getViralHaemorrhagicFeverConcept().getConceptId());
  }

  public List<Integer> getPlagueConceptList() {
    return Arrays.asList(outpatientMetadata.getPlagueConcept().getConceptId());
  }

  public List<Integer> getDeathtsDueToRoadTrafficInjuriesConceptList() {
    return Arrays.asList(
        outpatientMetadata.getDeathtsDueToRoadTrafficInjuriesConcept().getConceptId());
  }

  public List<Integer> getSexuallyTransmittedInfectionsConceptList() {
    return Arrays.asList(
        outpatientMetadata.getSexuallyTransmittedInfectionsConcept().getConceptId(),
        outpatientMetadata.getGonorrhoeaConcept().getConceptId(),
        outpatientMetadata.getHpvConcept().getConceptId(),
        outpatientMetadata.getGenitalHerpesConcept().getConceptId(),
        outpatientMetadata.getChlamydiaConcept().getConceptId(),
        outpatientMetadata.getTrichomoniasisInfectionConcept().getConceptId(),
        outpatientMetadata.getHivConcept().getConceptId(),
        outpatientMetadata.getHerpesSimplexConcept().getConceptId(),
        outpatientMetadata.getHerpesZosterConcept().getConceptId(),
        outpatientMetadata.getHerpesZosterOphthalmicusConcept().getConceptId(),
        outpatientMetadata.getAnogenitalHerpesSimplexVirusInfectionConcept().getConceptId(),
        outpatientMetadata.getHerpesviralInfectionUnspecifiedConcept().getConceptId(),
        outpatientMetadata.getChacroidConcept().getConceptId());
  }

  public List<Integer> getHypertensionConceptList() {
    return Arrays.asList(
        outpatientMetadata.getHypertensionConcept().getConceptId(),
        outpatientMetadata.getPrimaryHypertensionConcept().getConceptId(),
        outpatientMetadata.getRenovascularHypertensionConcept().getConceptId(),
        outpatientMetadata.getMalignantHypertensionConcept().getConceptId(),
        outpatientMetadata.getIdiopathicHypertensionConcept().getConceptId(),
        outpatientMetadata.getPregnancyInducedHypertensionConcept().getConceptId(),
        outpatientMetadata.getBenignIntracranialHypertensionConcept().getConceptId(),
        outpatientMetadata.getElevateBPWithoutDiagnosisOfHypertensionConcept().getConceptId());
  }

  public List<Integer> getAbortionConceptList() {
    return Arrays.asList(
        outpatientMetadata.getCompleteAbortionConcept().getConceptId(),
        outpatientMetadata.getIncompleteAbortionConcept().getConceptId(),
        outpatientMetadata.getInevitableAbortionConcept().getConceptId(),
        outpatientMetadata.getMedicalAbortionConcept().getConceptId(),
        outpatientMetadata.getMissedAbortionConcept().getConceptId(),
        outpatientMetadata.getRecurentAbortionConcept().getConceptId(),
        outpatientMetadata.getThreatenedAbortionConcept().getConceptId(),
        outpatientMetadata.getSepticAbortionConcept().getConceptId(),
        outpatientMetadata.getIncompleteSpontaneousAbortionConcept().getConceptId(),
        outpatientMetadata
            .getUnspecifiedSpontaneousAbortionWithOtherComplicationsConcept()
            .getConceptId());
  }

  public List<Integer> getDiseaseOfPuerperiumAndChildBirthConceptList() {
    return Arrays.asList(
        outpatientMetadata.getDiseaseOfPuerperiumAndChildBirthConcept().getConceptId());
  }

  public List<Integer> getArthritisConceptList() {
    return Arrays.asList(outpatientMetadata.getArthritisConcept().getConceptId());
  }

  public List<Integer> getOverWeightConceptList() {
    return Arrays.asList(outpatientMetadata.getOverweightConcept().getConceptId());
  }

  public List<Integer> getMuscularSkeletalConditionsConceptList() {
    return Arrays.asList(outpatientMetadata.getMuscularDystrophyConcept().getConceptId());
  }

  public List<Integer> getFistulaBirthRelatedConceptList() {
    return Arrays.asList(
        outpatientMetadata.getVesicovaginalFistulaConcept().getConceptId(),
        outpatientMetadata.getUterovesicalFistula().getConceptId());
  }

  public List<Integer> getNeoplamsConceptList() {
    return Arrays.asList(outpatientMetadata.getNeoplamsConcept().getConceptId());
  }

  public List<Integer> getPhysicalDisabilityConceptList() {
    return Arrays.asList(outpatientMetadata.getPhysicalDisabilityConcept().getConceptId());
  }
}
