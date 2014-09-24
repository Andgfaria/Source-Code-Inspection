/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
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
public class TicketMachineTest {
    
    public TicketMachineTest() {
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
     * Test of inserir method, of class TicketMachine.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("inserir");
        int valor = 5;
        TicketMachine ticketMachine = new TicketMachine(valor);
        try {
            ticketMachine.inserir(5);
        }
        catch (Exception e){
            e.printStackTrace();
            fail("insercao falhou");
        }
    }

    /**
     * Test of getSaldo method, of class TicketMachine.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
         int valor = 5;
        TicketMachine ticketMachine = new TicketMachine(valor);
        try {
            ticketMachine.inserir(5);
            assertEquals(5,ticketMachine.getSaldo());
        }
        catch (Exception e){
            e.printStackTrace();
            fail("insercao falhou");
        }
    }

    /**
     * Test of getTroco method, of class TicketMachine.
     */
    @Test
    public void testGetTroco() {
        System.out.println("getTroco");
         int valor = 5;
        TicketMachine ticketMachine = new TicketMachine(valor);
        try {
            ticketMachine.inserir(10);
            assertEquals(5,ticketMachine.getTroco());
        }
        catch (Exception e){
            e.printStackTrace();
            fail("insercao falhou");
        }
    }

    /**
     * Test of imprimir method, of class TicketMachine.
     */
    @Test
    public void testImprimir() throws Exception {
        System.out.println("inserir");
        int valor = 5;
        TicketMachine ticketMachine = new TicketMachine(valor);
        try {
            ticketMachine.inserir(5);
            ticketMachine.imprimir();
        }
        catch (Exception e){
            e.printStackTrace();
            fail("imprimir falhou");
        }
    }
}