package com.ascentis.hcm.tdd.service;

import com.ascentis.hcm.tdd.command.PayStubCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class PayStubService {

    @Autowired
    PayStubCommand paystubCommand;

    public String getPayStubs(){
        System.out.println("getPayStubs called");
        paystubCommand.executeCommand();
        return "test";
    }
}
