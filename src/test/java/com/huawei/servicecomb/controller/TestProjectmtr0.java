package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectmtr0 {

        Projectmtr0Delegate projectmtr0Delegate = new Projectmtr0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "aa hello"; // You should put the expect String type value here.

        String returnValue = projectmtr0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
