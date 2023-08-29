package com.tdd.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class InjectMocksTest {

    @Mock
    Map<String, String> wordMap;

    //@InjectMocks annotation – to inject mock fields into the tested object automatically.
    //In the following example – we use @InjectMocks to inject the mock wordMap into the MyDictionary dic:

    @InjectMocks
    MyDictionary dic = new MyDictionary();

    @Test
    public void whenUseInjectMocksAnnotation_thenCorrect() {
        Mockito.when(wordMap.get("aWord")).thenReturn("aMeaning");

        assertEquals("aMeaning", dic.getMeaning("aWord"));
    }
}
