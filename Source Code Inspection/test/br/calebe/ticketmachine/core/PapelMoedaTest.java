/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31211631
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValor method, of class PapelMoeda.
     */
    @Test
    public void testGetValor() {
    System.out.println("getValor");
        int quantidade = 5;
        int valor = 2;
        PapelMoeda moeda = new PapelMoeda(valor,quantidade);
        assertEquals(moeda.getValor(),valor);
    }

    /**
     * Test of getQuantidade method, of class PapelMoeda.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        int quantidade = 5;
        int valor = 2;
        PapelMoeda moeda = new PapelMoeda(valor,quantidade);
        assertEquals(moeda.getQuantidade(),quantidade);
        // TODO review the generated test code and remove the default call to fail.
    }
}