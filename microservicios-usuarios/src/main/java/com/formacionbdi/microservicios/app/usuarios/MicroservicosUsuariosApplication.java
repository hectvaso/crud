package com.formacionbdi.microservicios.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
@EntityScan({"com.formacionbdi.microservicios.commons.alumnos.models.entity"})
public class MicroservicosUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicosUsuariosApplication.class, args);
	}

}
