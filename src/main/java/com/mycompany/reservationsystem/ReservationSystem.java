/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservationsystem;
import java.util.*;

public class ReservationSystem {

    public static void main(String[] args) {
        System.out.println("======================Reservation=====================");
        
        //variables
        String bookingCode;
        String password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the booking Code: ");
        bookingCode = input.next();
        
        System.out.print("Enter the password: ");
        password = input.next();
        
        Reservation customer = new Reservation(bookingCode,password);
        
        System.out.println(customer.makeReservation(bookingCode, password));
    }
}
