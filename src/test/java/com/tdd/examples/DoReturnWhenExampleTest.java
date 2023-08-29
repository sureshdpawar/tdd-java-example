package com.tdd.examples;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DoReturnWhenExampleTest {

    /*
     The parameter of doReturn is Object unlike thenReturn. So, there is no type checking in the compile time.
     When the type is mismatched in the runtime, there would be an WrongTypeOfReturnValue execption.

     when-thenReturn is more readable than doReturn(), also doReturn() is not type safe. thenReturn checks method return types and raises compilation error if an unsafe type is passed.
     */

    @Ignore
    @Test
    public void test1(){
        User user = Mockito.mock(User.class);
        when(user.getName()).thenReturn("John");
        doReturn(true).when(user).getName();
    }
}
