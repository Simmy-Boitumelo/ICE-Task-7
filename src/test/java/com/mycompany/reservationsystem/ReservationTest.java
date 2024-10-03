/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.reservationsystem;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class ReservationTest {
   

    /**
     * Test of checkBookingCode method, of class Reservation.
     */
    @Test
    public void testCheckBookingCode() {
        System.out.println("checkBookingCode");
        String code = "Event_123";
        Reservation instance = new Reservation(code,"");
        boolean expResult = true;
        boolean result = instance.checkBookingCode(code);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInvalidCheckBookingCode() {
        System.out.println("checkBookingCode");
        String code = "Event123!!";
        Reservation instance = new Reservation(code,"");
        boolean expResult = false;
        boolean result = instance.checkBookingCode(code);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Reservation.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Password1@";
        Reservation instance = new Reservation("",password);
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testInvalidCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Password";
        Reservation instance = new Reservation("",password);
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of makeReservation method, of class Reservation.
     */
    @Test
    public void testMakeReservation() {
        System.out.println("makeReservation");
        String bookingCode = "Event_123";
        String password = "Password1@";
        Reservation instance = new Reservation(bookingCode,password);
        String expResult = "Reservation successfully made!";
        String result = instance.makeReservation(bookingCode, password);
        assertEquals(expResult, result);     
    }
    
     @Test
    public void testInvalidMakeReservation() {
        System.out.println("makeReservation");
        String bookingCode = "Event123!!!";
        String password = "Password1@";
        Reservation instance = new Reservation(bookingCode,password);
        String expResult = "Booking code is incorrectly formatted.";
        String result = instance.makeReservation(bookingCode, password);
        assertEquals(expResult, result);     
    }
    
}
