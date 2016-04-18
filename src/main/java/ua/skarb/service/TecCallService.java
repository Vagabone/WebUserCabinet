package ua.skarb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.skarb.domain.TecCallView;
import ua.skarb.domain.TecCallViewRepository;

import java.util.Date;
import java.util.List;

@Service
public class TecCallService implements ITecCallService {

    @Autowired
    private TecCallViewRepository tecCallViewRepository;

    @Override
    public List<TecCallView> getCallsByLicenceAndDatePeriod(Integer licenceId, Date startDate, Date endDate) {
        return tecCallViewRepository.findByLicenceIdAndCallCreateDateBetween(licenceId, startDate, endDate);
    }
}
