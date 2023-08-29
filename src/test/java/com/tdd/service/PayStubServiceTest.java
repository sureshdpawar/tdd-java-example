package com.tdd.service;

import com.tdd.command.PayStubCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PayStubServiceTest {

    @Mock
    PayStubCommand paystubCommand;

    @InjectMocks
    PayStubService payStubService;

    @Test
    public void testGetPayStubs(){
        String result = payStubService.getPayStubs();
        assertEquals("test", result);
    }
}
