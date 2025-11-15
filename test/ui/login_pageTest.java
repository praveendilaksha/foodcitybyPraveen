/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Praveen
 */
public class login_pageTest {
    
    public login_pageTest() {
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
     * Test of main method, of class login_page.
     */
    @Test
    public void testMain() {
        System.out.println("Login Test");
        String[] args = null;
        login_page.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
public void testValidLogin() {
    System.out.println("Credentials Matching");
    try {
        //Connect to database
        Connection con = database.db.getConnection();
        assertNotNull("DB connection should not be null", con);
        //Perform same check as login_page
        String sql = "SELECT * FROM user WHERE user_name='admin' AND password='admin'  AND role = 'admin'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        // Result should be TRUE
        boolean loginSuccess = rs.next();
        assertTrue("Login should succeed for valid credentials", loginSuccess);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}

    
}
