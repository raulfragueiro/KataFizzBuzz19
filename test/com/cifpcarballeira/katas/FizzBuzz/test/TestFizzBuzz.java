package com.cifpcarballeira.katas.FizzBuzz.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.FizzBuzz.test.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daw108
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }
    
    @Test
    public void test1devuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(1);
        assertEquals("1", resultado);
    }
}
