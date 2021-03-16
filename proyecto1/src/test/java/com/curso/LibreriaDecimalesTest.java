package com.curso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LibreriaDecimalesTest {
    
    @Test
    public void suma5y8() {
        assertEquals( 13.2 , Libreria.suma(5.1,8.1), 0.001 );
    }
    @Test
    public void suma5y0() {
        assertTrue( 5.1 == Libreria.suma(5.1,0) );
    }
    @Test
    public void rest0y6() {
        assertTrue( -6. == Libreria.resta(0.,6) );
    }
    @Test
    public void restaMenos2yMenos8() {
        assertTrue( 6.0 == Libreria.resta(-2.5,-8.5) );
    }
}
