package br.com.brewfantasy.notafiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NotaFiscalApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotaFiscalApplication.class, args);
	}

}
