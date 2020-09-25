package org.openmrs.module.ehrreports.reporting.library.indicators;

import org.openmrs.module.ehrreports.reporting.library.cohorts.special_clinic.SpecialClinicCohortQueries;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportUtils;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpecialClinicIndicators {
  @Autowired private SpecialClinicCohortQueries queries;
  @Autowired private EhrGeneralIndicator ehrGeneralIndicator;

  public CohortIndicator getSpecialClinic() {
    return ehrGeneralIndicator.getIndicator(
        "Special clinic indicator",
        EhrReportUtils.map(
            queries.getAllSpecialClinicPatients(), "startDate=${startDate},endDate=${endDate}"));
  }
}
