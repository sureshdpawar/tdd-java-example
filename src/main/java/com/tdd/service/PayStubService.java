package com.tdd.service;

import com.tdd.command.PayStubCommand;
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
