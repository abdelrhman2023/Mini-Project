/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.otlob;
/**
 *
 * @author A.S.A
 */
public class Customer extends Person {
    private String MobileNumber;
    private String Address;

    public Customer(String MobileNumber, String Address, String UserName, String Password) {
        super(UserName, Password);
        this.MobileNumber = MobileNumber;
        this.Address = Address;
    }
    
    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public String getAddress() {
        return Address;
    }
    
    
}
