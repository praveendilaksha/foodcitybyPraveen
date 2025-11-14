/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ui;

import code.product;
import java.util.ArrayList;
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
public class Best_Selling_ProductsIT {
    
    public Best_Selling_ProductsIT() {
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
     * Test of ProductList method, of class Best_Selling_Products.
     */
    @Test
    public void testProductList() {
        System.out.println("ProductList");
        Best_Selling_Products instance = new Best_Selling_Products();
        ArrayList<product> expResult = null;
        ArrayList<product> result = instance.ProductList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of show_product_data method, of class Best_Selling_Products.
     */
    @Test
    public void testShow_product_data() {
        System.out.println("show_product_data");
        Best_Selling_Products instance = new Best_Selling_Products();
        instance.show_product_data();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Best_Selling_Products.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Best_Selling_Products.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
