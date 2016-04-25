package ua.skarb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.skarb.domain.Firm;
import ua.skarb.domain.FirmRepository;
import ua.skarb.domain.LicenceView;

@Service
public class FirmService implements IFirmService {

    @Autowired
    FirmRepository firmRepository;

    @Override
    public Firm getFirmByLicence(LicenceView licenceView) {
        return firmRepository.findOne(licenceView.getFirmsId());
    }

    @Override
    public Firm getFirmById(Integer id) {
        return firmRepository.findOne(id);
    }
}
