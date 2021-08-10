package microservicios.log.services;

import org.springframework.stereotype.Service;

import cr.microservicios.common.services.CommonServiceImpl;
import cr.microservicios.commons.entity.LogMDL;
import microservicios.log.repository.LogMdDLRepository;

@Service
public class LogMDLServiceImpl extends CommonServiceImpl<LogMDL, LogMdDLRepository> implements LogMDLService {

}
