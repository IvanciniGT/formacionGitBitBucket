package com.curso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LibreriaTest {
    
    @Test
    public void suma5y8() {
        assertEquals( 13 , Libreria.suma(5,8) );
    }
    @Test
    public void suma5y0() {
        assertTrue( 5 == Libreria.suma(5,0) );
    }
    @Test
    public void suma5yMenos3() {
        assertTrue( 2 == Libreria.suma(5,-3) );
    }
    @Test
    public void resta3y5() {
        assertTrue( -2 == Libreria.resta(3,5) );
    }
    @Test
    public void rest0y6() {
        assertTrue( -6 == Libreria.resta(0,6) );
    }
    @Test
    public void restaMenos2yMenos8() {
        assertTrue( 6 == Libreria.resta(-2,-8) );
    }
}
