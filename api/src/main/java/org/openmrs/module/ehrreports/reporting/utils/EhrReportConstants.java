/*
 * The contents of this file are subject to the OpenMRS Public License Version
 * 1.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * Copyright (C) OpenMRS, LLC. All Rights Reserved.
 */

package org.openmrs.module.ehrreports.reporting.utils;

import java.util.ArrayList;
import java.util.List;
import org.openmrs.Program;
import org.openmrs.ProgramWorkflowState;

public final class EhrReportConstants {

  public static final String ADULTINITIAL_OUTPATIENT = "8d5b27bc-c2cc-11de-8d13-0010c6dffd0f"; // 1

  public static final String ADULTRETURN_OUTPATIENT = "8d5b2be0-c2cc-11de-8d13-0010c6dffd0f"; // 2

  public static final String PEDSINITIAL_OUTPATIENT = "8d5b2dde-c2cc-11de-8d13-0010c6dffd0f"; // 3

  public static final String PEDSRETURN_OUTPATIENT = "8d5b3108-c2cc-11de-8d13-0010c6dffd0f"; // 4

  public static final String REGINITIAL_OUTPATIENT = "e9ab67ae-9210-4147-96ae-fb61f4d917ff"; // 5

  public static final String REGREVISIT_OUTPATIENT = "5f5f2540-2de0-478d-abf6-842281aae102"; // 6

  public static final String OPDENCOUNTER_OUTPATIENT = "0498d578-d228-4864-9178-14f367f42160"; // 9

  public static final String CHECKIN_ENCOUNTER = "ca3aed11-1aa4-42a1-b85c-8332fc8001fc"; // 12

  public static final String ANC_ENCOUNTER = "40629059-f621-42bd-a7c4-bd22e2636e47"; // 19

  // Concepts
  public static final String SPECIAL_CLINIC = "8548ca32-ac74-4aa8-b97b-138bd745df0a"; // 5082

  public static final String ENT_CLINIC = "47f855a5-0957-4cbc-8098-b577021150f8"; // 5119

  public static final String EYE_CLINIC = "dcd6db77-47a3-4b45-aa5e-fdb169055feb"; // 5118

  public static final String TB_LEPROSY_CLINIC = "d3c75c8d-f57c-48d1-974c-a9eb5961d553"; // 5698

  public static final String STI_CLINIC = "4c9b4d7d-7cb0-4d49-a833-2a13490b4632"; // 1073

  public static final String PSYCHIATRIC_CLINIC = "f3c0474d-1308-4160-a862-94939a97330e"; // 5700

  public static final String ORTHOPAEDIC_CLINIC = "89282a1f-fc28-4adc-80dd-0e64d947ec55"; // 5121

  public static final String MOPC_MEDICAL_CLINIC = "f857450b-133d-4d6b-bf09-e9297ccd1848"; // 5120

  public static final String POPC_PAEDIATRICS_CLINIC =
      "da4903d2-7ae3-4c52-929a-ae7273b9e68e"; // 5122

  public static final String CCC_CLINIC = "e0620e9e-be40-43b1-b18d-b4ed2498b13c"; // 5699

  public static final String MOPC_DM_DIABETIC_CLINIC =
      "b1801fa9-7a27-450f-ae06-04333287ffb1"; // 5701

  public static final String FNA_CLINIC = "f3fa2644-76f0-4bd5-b2d6-ec84bd396562"; // 5702

  public static final String GOPC_CLINIC = "b758a5ec-e601-4f12-996f-314153c74ab9"; // 5703

  public static final String MCH_CLINIC = "11303942-75cd-442a-aead-ae1d2ea9b3eb"; // 5704

  public static final String MOPC_MEDICAL_CLINIC_2 = "75e2f59c-b7fa-4778-964a-4f7f541e864d"; // 5705

  public static final String PALLIATIVE_CARE_CLINIC =
      "8c4f488d-0d85-4782-b82c-59f454299f01"; // 5706

  public static final String SURGICAL_CLINIC = "0aa9c676-f10d-4c22-b113-100acfbd165f"; // 5707

  public static final String CHEST_AND_SKIN_CLINIC = "9b235c9c-d098-4e9c-9e9a-a49a2916c0b5"; // 5708

  public static final String DENTAL_CLINIC = "0b58e72e-c34d-437d-9563-939a066efe58"; // 5696

  public static final String FAMILY_PLANNING_CLINIC =
      "68f095fb-1701-42b1-bd30-46d5f0473ae6"; // 100126248

  public static final String TRIAGE = "af17c916-449e-4721-a555-81d8032c8f41"; // 3999

  public static final String OPD_WARD = "482f0492-aeef-404e-a820-c34cf61db616"; // 3

  public static final String CASUALTY_OPD = "ec1aae69-52e8-49db-87f2-ec71d98ee601"; // 5114

  public static final String CASUALTY_TRIAGE = "68ff7941-a57c-42f5-aa56-75913ce8b34d"; // 4000

  public static final String DENTAL_OPD = "18bfc9f3-22ba-4673-907c-9651895465e3"; // 5709

  public static final String PROVISIONAL_DIAGNOSIS = "b8bc4c9f-7ccb-4435-bc4e-646d4cf83f0a"; // 2304
  public static final String FINAL_DIAGNOSIS = "7033ef37-461c-4953-a757-34722b6d9e38"; // 5109
  public static final String REGISTRATION_FEE = "999a80f4-d93d-4e35-9c91-0a52d6d8bfbf"; // 3950
  public static final String NEW_PATIENT = "1ecd0a60-498c-41b1-a836-6e154322be5a"; // 009
  public static final String REVISIT = "51d88fa3-b475-4713-8db8-58b63b0f3739"; // 945

  // Diarrhoea
  public static final String ACUTE_DIARRHEA = "48ec899e-8f8f-4816-8d76-b98026b7d04f";
  public static final String DIARRHEA_UNSPECIFIED = "91e4a7f4-f3d1-455e-991e-eb64a4df415b";

  // tuberulosis
  public static final String TUBERCULOSIS = "51ac5587-6f78-4246-8329-fbc47a86fbda"; //
  public static final String TUBERCULOSIS_OF_OTHER_ORGANS =
      "d7224d92-0127-4d3c-a12b-93109a25ceaf"; //	1752
  public static final String TUBERCULOSIS_IN_PREGNANCY =
      "75278919-cd62-49d1-bb76-48243d206eb3"; // 4592
  public static final String TUBERCULOSIS_AFFECTING_CENTRAL_NERVOUS_SYSTEM =
      "6033961c-e8a2-4311-a89e-7b69b8a87a63"; // 1707
  public static final String TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM =
      "bfcc9a7d-e8ff-48a1-8426-e3a216bfc7f8"; // 3860
  public static final String MILIARY_TUBERCULOSIS = "7e0ec01c-57b5-45da-bd69-29a206b1f5f4"; // 1708
  public static final String PULMONARY_TUBERCULOSIS =
      "9ef76020-1a6e-4cfe-9f62-677ad7fac39a"; // 1010
  public static final String SEQUELAE_OF_TUBERCULOSIS =
      "e933d281-3c45-46b9-8578-7cee326f37cc"; // 4542
  public static final String RESPIRATORY_TUBERCULOSIS =
      "c2e4d884-479c-47dd-9c4e-4bd19f9d3710"; // 4298
  public static final String RESPIRATORY_TUBERCULOSIS_UNSPECIFIED =
      "d21e4073-6108-466d-b8b4-c7d1159cfdd5"; // 4061
  public static final String TUBERCULOSIS_HISTOLOGICALLY_CONFIRMED =
      "90436397-d5cf-436a-88f7-d085f345a932"; // 4059
  public static final String
      RESPIRATORY_TUBERCULOSIS_NOT_CONFIRMED_BACTERIOLOGICALLY_AND_HISTOLOGICALLY =
          "8bc742a3-79c6-45ba-b08f-63e5bb3435a6"; // 4060
  public static final String EXTRAPULMONARY_TUBERCULOSIS =
      "d4abcfe0-220b-4705-919e-e56da47ed457"; // 1470
  public static final String ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED =
      "11357e6d-b1e0-4baf-a3f3-9d834e898e13"; // 4148
  public static final String OTHER_RESPIRATORY_TUBERCULOSIS =
      "790d94a5-125a-4876-8982-12d38745bfb6"; // 4316
  public static final String MULTI_DRUG_RESISTANT_TUBERCULOSIS =
      "790d94a5-125a-4876-8982-12d38745bfb6"; // 1213
  public static final String SPUTUM_POSITIVE_PULMONARY_TUBERCULOSIS =
      "c2f51eb4-620e-467b-b320-869a03c480b1"; // 1527
  public static final String SPUTUM_NEGATIVE_PULMONARY_TUBERCULOSIS =
      "ee870d08-9086-4f22-93a7-bfcf61dc3f36"; // 1525
  public static final String CONTACT_WITH_AND_SUSPECTED_EXPOSURE_TO_TUBERCULOSIS =
      "ab9510a4-ec6e-412f-b541-3b86e07ea7d8"; // 4047
  public static final String ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS =
      "645188a4-4348-406f-a91d-f90e723359fb"; // 4366

  // Dysentery (Blood Bloody diarrhoea)
  public static final String DYSENTERY = "9004c4f1-687e-4ec9-8eaf-9bd8192d3427"; // 2450
  public static final String AMOEBIC_DYSENTERY = "435c8290-ad16-47c6-b282-0c3d9d1e6cd1"; // 1003
  public static final String SHIGELLA_DYSENTERY = "91934386-461e-4a0d-856a-ac86543b2894"; // 1668
  public static final String BACILLARY_DYSENTERY = "b9c47e34-7014-4e6e-b113-383b115d9ef6"; // 3667

  // Meningococcal
  public static final String MENINGOCOCCAL_MENINGITIS =
      "ade7a86f-9520-40e7-b89c-1179bca59784"; // 100001518
  public static final String MENINGOCOCCAL_INFECTIONS =
      "ddd803b4-b581-4642-9eaa-053b3a40bb53"; // 1714

  // OTHER MENINGITIS
  public static final String MENINGITIS_NOS = "58cf77f3-6899-434e-aca7-54a73405e88f"; // 1019
  public static final String BACTERIAL_MENINGITIS = "5e6d7420-deb6-4be6-af90-ba565e7d1ed0"; // 1167
  public static final String CRYPTOCOCCAL_MENINGITIS =
      "0eef9672-84c4-40fc-a679-055f3e58ac76"; // 1179
  public static final String VIRAL_MENINGITIS = "6160cb4b-aecb-4402-b108-ae1901237f08"; // 1723

  // Tetanus
  public static final String TETANUS = "8e87b1e0-3d56-4135-be89-6ef6f8e9f368"; // 1521
  public static final String TETANUS_NEONATORUM = "5e87fc96-95e2-48c7-bdff-7d9202715f1d"; // 1519
  public static final String OBSTETRICAL_TETANUS = "ea889e1d-ba0a-473f-90cc-bf6eae356638"; // 1712

  // POLIOMYELITIS(AFP)
  public static final String ACUTE_POLIOMYELITIS = "ea7f3d9c-30a1-400c-8633-9dce20bbfd9b"; // 1195

  // CHICKEN POX
  public static final String CHICKEN_POX = "f7ee3e9a-95bb-4517-a4f1-0203e62af399"; // 1146
  // MEASLES
  public static final String MEASLES = "3e5cb737-f043-44f0-ae78-9ac76696b4fc"; // 1020
  public static final String MEASLES_WITHOUT_COMPLICATION =
      "54f63bbc-bc55-4078-9fc9-8096fcde9a09"; // 4458
  public static final String GERMAN_MEASLES = "14995aa4-aff8-4180-9548-bac33783b4a6"; // 1744

  // HEPATITIS
  public static final String HEPATITIS_NOS = "8c59b3c2-c5c3-4c25-83c6-a9c38274c6a8"; // 1008
  public static final String HEPATITIS_A = "5f4c22a7-574b-4266-9bb2-f69bc7d21687"; // 2524
  public static final String HEPATITIS_B = "140b5477-2221-4f1f-a73f-6e8c1715fde8"; // 1006
  public static final String HEPATITIS_C = "1929b19a-9218-4008-a2e2-f2f00b4e0a4a"; // 1007
  public static final String HEPATITIS_E = "99773186-0111-427f-a975-8d6705b0968b"; // 1506
  public static final String VIRAL_HEPATITIS_A = "5f4c22a7-574b-4266-9bb2-f69bc7d21687"; // 2524
  public static final String VIRAL_HEPATITIS_B = "28c3ddae-fe7d-4382-9d6e-419f84e5b53c"; // 2525
  public static final String VIRAL_HEPATITIS_D = "54dc84be-472c-4f58-95c2-e173c9cfb56d"; // 2527
  public static final String VIRAL_HEPATITIS_E = "f7b7c9e5-6fee-45b7-820f-b49c07e930f6"; // 2528
  public static final String LIVER_INFECTION_WITH_HEPATITIS_A =
      "e6dfba35-671f-4b67-a575-9fff1161e926"; // 1005
  // MUMPS
  public static final String MUMPS = "c196599b-4a7e-47a7-8e6c-53219350029e"; // 1021

  // FEVERS
  public static final String RESPIRATORY_DISTRESS_HAEMORRHAGIC_FEVERS =
      "edfbdd2c-fb7a-47ea-81ef-608414cf6164"; // 3671
  public static final String FEVER = "17aa2537-707d-49a9-96bd-d2ae6bbe8a6b"; // 1202
  public static final String FEVER_OF_UNKNOWN_ORIGIN =
      "c6516631-c608-419c-81d6-0d7e95202090"; // 1152

  // MALARIA
  public static final String CLINICAL_MALARIA = "5ac3a7d1-a596-44cd-a051-8c14abd6a62c"; // 1041
  public static final String MALARIA_IN_PREGNANCY = "5ac3a7d1-a596-44cd-a051-8c14abd6a62c"; // 4290
  public static final String UNSPECIFIED_MALARIA = "8b7a94a1-2df7-4bf7-bd21-1ae432a9bec0"; // 4027
  public static final String MALARIA_DUE_TO_SIMIAN_PLASMODIA =
      "c2ab8b00-999d-4079-bbe3-fccbde54fcfb"; // 4041
  public static final String PLASMODIUM_MALARIAE_MALARIA =
      "501bf3e6-f49f-4cdf-b237-240691d2229f"; // 4516
  public static final String OTHER_SPECIFIED_MALARIA =
      "906cb089-9f25-4920-9165-530653995d83"; // 4293
  public static final String OTHER_CONGENITAL_MALARIA =
      "3850f805-9850-4cf0-a5d5-bb7adc009e06"; // 4492

  // Cholera
  public static final String CHOLERA = "f3c41b86-b280-41af-aeaf-80a0fd6033b3";

  // Tonsillitis
  public static final String TONSILLITIS = "e83dc06a-bb71-4838-a7e9-14fbe150b6b2"; // 1216

  // Pneumonia
  public static final String PNEUMONIA = "ae105ae8-1bb8-4c39-8957-11229ac67bd7"; // 1011

  // OTHER DISEASE OF RESPIRATORY SYSTEM
  public static final String OTHER_DISEASE_OF_RESPIRATORY_SYSTEM =
      "081d6ed6-1b3a-4f45-a747-1a15e4e6d3ff"; // 4440

  // MENTAL DISORDERS
  public static final String MENTAL_DISORDERS = "10865c85-0ca8-4e94-ba80-b872817a7f80"; // 2044

  // DENTAL DISORDERS
  public static final String DENTAL_DISORDERS = "1e886bed-ff5a-4610-97a5-45a613db9c9f"; // 4451

  // JIGGERS INFESTATION
  public static final String JIGGERS_INFESTATION =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // Input jigger infestation concept

  // DISEASE OF THE SKIN
  public static final String DISEASE_OF_THE_SKIN = "e9c5bea6-33b1-4af2-99ba-0ff2b2945c29"; // 1825

  // CHROMOSOMAL ABNORMALITIES
  public static final String CHROMOSOMAL_ABNORMALITIES =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // INPUT CONCEPT ID IF/WHEN ADDED

  // CONGENITAL ANOMALIES
  public static final String CONGENITAL_ANOMALIES = "9b8b38ad-e325-4b96-85dc-e559c583505d"; // 1201

  // POISONING
  public static final String POISONING = "5530d558-5dec-47c3-97b0-02c34205924c"; // 1026

  // Patient referred from
  public static final String PATIENT_REFERRED_FROM = "939e7bcc-a038-4776-8445-7ff080a813e6"; // 005
  public static final String EXTERNAL_REFERRAL = "18b2b617-1631-457f-a36b-e593d948707f"; // 3004

  // RTA
  public static final String ROAD_TRAFFIC_INJURIES =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // INPUT CONCEPT ID IF/WHEN ADDED

  // OTHER INJURIES
  public static final String OTHER_INJURIES =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // INPUT CONCEPT ID IF/WHEN ADDED

  // SEXUAL ASSAULT
  public static final String SEXUAL_ASSAULT = "7a22663f-e9ad-11e5-bc3d-6451069f906b"; // 1001066

  // BURNS
  public static final String BURNS = "5edbfc55-2654-48c7-bc19-cd22c7a4756f"; // 4325

  // SNAKE BITES
  public static final String SNAKE_BITES = "9cf6dc64-3629-43ea-961b-425cd8704158"; // 1393

  // DOG BITES
  public static final String DOG_BITES =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // INPUT CONCEPT ID IF/WHEN ADDED

  // OTHER BITES
  public static final String OTHER_BITES =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // INPUT CONCEPT ID IF/WHEN ADDED

  // DIABETES
  public static final String DIABETES = "119481AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 119481

  // EPILEPSY
  public static final String EPILEPSY = "4e896673-d822-458e-bbfe-604747e0afe8"; // 4579

  // OTHER CONVULSIVE  DISORDERS
  public static final String OTHER_CONVULSIVE_DISORDERS =
      "ba8b8fac-f593-4b71-81bb-c6b33aa67814"; // 4102

  // NEWLY DIAGNOSED HIV
  public static final String NEWLY_DIAGNOSED_HIV =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // Concept NULL

  // BRUCELLOSIS
  public static final String BRUCELLOSIS = "e4d255d0-a744-483d-b9d1-d0ffeadf42ef"; // 4576

  // RICKETS
  public static final String RICKETS = "db57e5a5-3c74-4dff-8ef3-2e779a034e15"; // 1194

  // CARDIOVASCULAR CONDITIONS
  public static final String CARDIVASCULAR_CONDITIONS =
      "64cf24cc-f7c0-464b-9e8d-07f3a9cf9504"; // 1755

  // VIOLENCE RELATED INJURIES
  public static final String VIOLENCE_RELATED_INJURIES =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // INPUT CONCEPT ID IF/WHEN ADDED

  // CEREBRAL PALSY
  public static final String CEREBRAL_PALSY = "ee492d82-7e64-4244-9e3b-0120a2df4eab"; // 1157

  // AUTISM
  public static final String AUTISM = "f6e72dc4-e858-4c04-99e8-62bfdffe37da"; // 4574

  // OTHER CENTRAL NERVOUS SYSTEM CONDITIONS
  public static final String OTHER_CENTRAL_NERVOUS_SYSTEM_CONDITIONS =
      "41297379-6733-4df0-b6bb-4123f25becc6"; // 4558

  // TRYPONOSOMIASIS
  public static final String TRYPONOSOMIASIS = "aadca18b-d875-41dc-b44b-6aef62fcf3d8"; // 4553

  // KALAZAR
  public static final String KALAZAR = "56c7799a-39c2-4778-9e3b-0b0b5baa6475"; // 4548

  // DRACUNCULOSIS (GUINEA WORM)
  public static final String DRACUNCULOSIS = "037865b5-4282-4a60-8095-0e525ee2b792"; // 4578

  // YELLOW FEVER
  public static final String YELLOW_FEVER = "cfc66a03-c2fb-44a3-bab0-c1611a979b3e"; // 1018

  // VIRAL HAEMORRHAGIC FEVER
  public static final String VIRAL_HAEMORRHAGIC_FEVER =
      "4cd84add-83cd-4c09-8825-1aea071afa57e"; // 4289

  // PLAGUE
  public static final String PLAGUE = "d86f7c87-7023-4dab-9334-b217fa09d857"; // 1709

  // DEATHS_DUE_TO_ROAD_TRAFFIC_INJURIES
  public static final String DEATHS_DUE_TO_ROAD_TRAFFIC_INJURIES =
      "72d91e67-0f6e-41dd-87ce-0c510c99aa2a"; // TO BE POPULATED

  // program
  public static final String ANC_Program = "d83b74b7-f5ea-46fc-acc5-71e892ee1e68";
  public static final String PNC_Program = "a15f2617-9f5d-4022-8de3-181b2e286a28";
  public static final String CWC_Program = "34680469-1b6b-4ca3-b3f7-347463013dbd";

  // classes
  public static final String DIAGNOSIS_CLASS = "8d4918b0-c2cc-11de-8d13-0010c6dffd0f"; // 4
  public static final String FINDING_CLASS = "8d491a9a-c2cc-11de-8d13-0010c6dffd0f"; // 5
  public static final String SYMPTOMS_CLASS = "8d492954-c2cc-11de-8d13-0010c6dffd0f"; // 12
  public static final String SYMPTOMS_FINDING_CLASS = "8d492b2a-c2cc-11de-8d13-0010c6dffd0f"; // 13

  public enum OccurenceStates {
    NEW,
    REVISIT
  }

  public static List<Integer> getProgramWorkflowStateIds(Program program) {
    List<Integer> defaultStateIds = new ArrayList<>();
    for (ProgramWorkflowState p : program.getAllWorkflows().iterator().next().getStates()) {
      defaultStateIds.add(p.getProgramWorkflowStateId());
    }
    return defaultStateIds;
  }
}
