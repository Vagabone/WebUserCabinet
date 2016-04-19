package ua.skarb.service;

import ua.skarb.domain.TecCallView;

import java.util.Date;
import java.util.List;

public interface ITecCallViewService {
    List<TecCallView> getCallsByLicenceAndDatePeriod(Integer licenceId, Date startDate, Date endDate);
}
