package ua.skarb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.skarb.domain.LicenceView;
import ua.skarb.domain.LicenceViewRepository;

@Service
public class LicenceViewService implements ILicenceViewService {

    @Autowired
    private LicenceViewRepository licenceViewRepository;

    @Override
    public LicenceView getLicenceViewById(Integer id) {
        return licenceViewRepository.findOne(id);
    }
}
