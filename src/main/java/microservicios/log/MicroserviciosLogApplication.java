package microservicios.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "cr.microservicios.commons.entity" })
public class MicroserviciosLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosLogApplication.class, args);
	}

}
