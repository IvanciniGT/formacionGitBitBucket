package com.curso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LibreriaMultiplicarTest {
    
    @Test
    public void multiplicar5y8() {
        assertEquals( 40 , Libreria.multiplicar(5,8) );
    }
    @Test
    public void multiplicar5y0() {
        assertTrue( 0 == Libreria.multiplicar(5,0) );
    }
    @Test
    public void multiplicar0y6() {
        assertTrue( 0 == Libreria.multiplicar(0,6) );
    }
    @Test
    public void multiplicarMenos2yMenos8() {
        assertTrue( 16 == Libreria.multiplicar(-2,-8) );
    }
}
