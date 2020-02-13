package com.ascentis.hcm.tdd.controller;

import com.ascentis.hcm.tdd.model.PayStub;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/payroll")
public class PayStubController {

	@GetMapping("paystub")
	public List<PayStub> getPayStubs() throws Exception {
	    List<PayStub> payStubs = new ArrayList<>();

		return payStubs;
	}
}
