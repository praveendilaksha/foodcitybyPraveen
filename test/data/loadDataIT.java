/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package data;

import code.readcsv;
import java.io.File;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JINOOSHAN
 */
public class loadDataIT {

    public loadDataIT() {
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
     * Test of loadcsv method, of class loadData.
     */
    @Test
    public void testLoadcsv() {
        System.out.println("loadcsv");
        File file = new File("C:\\Users\\JINOOSHAN\\Documents\\4th sem\\apdp\\supermarket_sales.csv");
        List<readcsv> expResult = null;
        List<readcsv> result = loadData.loadcsv(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

}
