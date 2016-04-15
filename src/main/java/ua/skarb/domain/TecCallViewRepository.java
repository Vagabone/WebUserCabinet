package ua.skarb.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface TecCallViewRepository extends JpaRepository<TecCallView, Integer> {

    @Query(nativeQuery = true)
    List<TecCallView> findByLicenceIdAndCallCreateDateBetween(@Param("licenceId") Integer licenceId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
