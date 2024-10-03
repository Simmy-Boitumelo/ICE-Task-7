
package com.mycompany.reservationsystem;

/**
 *
 * @author RC_Student_lab
 */
public class Reservation {
    private String bookingCode;
    private String password;
    
    public Reservation(String bookingcode, String password){
        this.bookingCode = bookingcode;
        this.password = password;
    }
    
    public String getBookingCode(){
        return bookingCode;
    }
    
    public void setBookingCode(String bookingcode){
        this.bookingCode = bookingcode;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
     public boolean checkBookingCode(String code){

        return code.contains("_") && code.length()<=12;
       // return username.contains("_") && username.length()<=5;
    }

    public boolean checkPasswordComplexity(String password){
        int length = password.length();
        int digit = 0;
        int upperCaseLetter = 0;
        int specialCharacter = 0;
        char ch;
        int count = 0;

        if(length < 8){

            return false;
        }
        else {
            while (count < length) {
                ch = password.charAt(count);
                if (Character.isUpperCase(ch)) {
                    upperCaseLetter = 1;
                } else if (Character.isDigit(ch)) {
                    digit = 1;
                } else if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
                    specialCharacter = 1;
                }
                count++;

            }
        }

        return upperCaseLetter == 1 && specialCharacter == 1 && digit == 1;
    }
    
    public String makeReservation(String bookingCode,String password){
        
        if(!checkBookingCode(bookingCode)){
            System.out.println("Booking code is incorrectly formatted.");
        }
        
        if(!checkPasswordComplexity(password)){
                return "Password does not meet the complexity requirements.";
        }
        
        return "Reservation successfully made!";
    }
}


