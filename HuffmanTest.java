/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class HuffmanTest {
    
    public HuffmanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CalcularFrecuencias method, of class Huffman.
     */
    @Test
    public void testCalcularFrecuencias() {
        System.out.println("CalcularFrecuencias");
        String ingreso = "";
        Huffman instance = new Huffman();
        //instance.CalcularFrecuencias(ingreso);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of HacerArbol method, of class Huffman.
     */
    @Test
    public void testHacerArbol() {
        System.out.println("HacerArbol");
       // Huffman instance = new Huffman();
        ArbolH expResult = null;
       // ArbolH result = instance.HacerArbol();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Codificar method, of class Huffman.
     */
    @Test
    public void testCodificar() {
        System.out.println("Codificar");
        ArbolH arbol = null;
        StringBuffer buffer = null;
       // Huffman instance = new Huffman();
       // instance.Codificar(arbol, buffer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class Huffman.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        ArbolH arbol = null;
        String[] mensaje = null;
        int num = 0;
       // Huffman instance = new Huffman();
        char expResult = ' ';
       // char result = instance.buscar(arbol, mensaje, num);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of traducir method, of class Huffman.
     */
    @Test
    public void testTraducir() {
        System.out.println("traducir");
        ArbolH arbol = null;
        String mensaje = "";
       // Huffman instance = new Huffman();
        String expResult = "";
       // String result = instance.traducir(arbol, mensaje);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
