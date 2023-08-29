package com.tdd.service;

import com.tdd.controller.PayStubController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class PayStubControllerTest {

    @InjectMocks
    PayStubController payStubController;

    @Test
    public void testGetPayStubs() throws Exception {
        assertNotNull(payStubController.getPayStubs());
    }
}
