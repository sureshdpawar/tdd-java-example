package com.ascentis.hcm.tdd.command;

import org.springframework.stereotype.Component;

@Component
public class PayStubCommand {
    public void executeCommand(){
        System.out.println("execute command called");
    }
}
