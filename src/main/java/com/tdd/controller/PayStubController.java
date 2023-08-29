package com.tdd.controller;

import com.tdd.model.PayStub;
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
