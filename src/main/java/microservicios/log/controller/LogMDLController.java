package microservicios.log.controller;

import org.springframework.web.bind.annotation.RestController;

import cr.microservicios.common.controller.CommonController;
import cr.microservicios.commons.entity.LogMDL;
import microservicios.log.services.LogMDLService;

@RestController
public class LogMDLController extends CommonController<LogMDL, LogMDLService> {

}
