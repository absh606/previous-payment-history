package com.tsys.billings.previouspaymenthistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PreviousPaymentHistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreviousPaymentHistoryApplication.class, args);
	}

}
