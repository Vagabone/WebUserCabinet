package ua.skarb.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LicenceUsersRepository extends JpaRepository<LicenceUsers, Integer> {

    List<LicenceUsers> findByLicenceId(Integer id);
}
