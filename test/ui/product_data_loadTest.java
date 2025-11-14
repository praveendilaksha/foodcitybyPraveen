package ui;

import code.product;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class product_data_loadTest {
    
    public product_data_loadTest() {
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

 
    @Test
    public void testProductList() {
        System.out.println("ProductList");
        product_data_load instance = new product_data_load();
        ArrayList<product> result = instance.ProductList();
        assertNotNull("ProductList should not return null", result);
        assertTrue("ProductList should return a list (possibly empty)", result.size() >= 0);
    }
    @Test
    public void testShow_product_data() {
        System.out.println("show_product_data");
        product_data_load instance = new product_data_load();
        instance.show_product_data();
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = new String[0];
        product_data_load.main(args);
    }
    
}
