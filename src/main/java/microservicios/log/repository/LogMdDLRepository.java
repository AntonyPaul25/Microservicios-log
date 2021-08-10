package microservicios.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cr.microservicios.commons.entity.LogMDL;

@Repository
public interface LogMdDLRepository extends JpaRepository<LogMDL, Long> {

}
