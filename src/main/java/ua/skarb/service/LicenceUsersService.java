package ua.skarb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.skarb.domain.LicenceUsers;
import ua.skarb.domain.LicenceUsersRepository;

import java.util.List;

@Service
public class LicenceUsersService implements ILicenceUsersService {

    @Autowired
    LicenceUsersRepository licenceUsersRepository;

    @Override
    public List<LicenceUsers> findRegistratorsByLicenceId(Integer id) {
        return licenceUsersRepository.findByLicenceId(id);
    }
}
