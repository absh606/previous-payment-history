package com.tsys.billings.previouspaymenthistory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tsys.billings.previouspaymenthistory.model.Response;
import com.tsys.billings.previouspaymenthistory.services.PaymentHistoryService;

@RestController
public class PreviousPaymentHistoryController {
	
	@Autowired
	PaymentHistoryService paymentHistoryService;
	
	@GetMapping("/paymentHistories")
	public Response getCurrentHistory(@RequestParam String customerId,@RequestParam String fromDate,@RequestParam String toDate , @RequestParam String limit, @RequestParam String offset) {
		return paymentHistoryService.getCurrentHistory(customerId, fromDate, toDate, limit, offset);
	}
	
}
