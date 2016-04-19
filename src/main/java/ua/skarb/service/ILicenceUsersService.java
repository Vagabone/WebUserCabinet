package ua.skarb.service;

import ua.skarb.domain.LicenceUsers;

import java.util.List;

public interface ILicenceUsersService {

    List<LicenceUsers> findRegistratorsByLicenceId(Integer id);
}
