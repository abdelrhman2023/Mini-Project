/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.otlob;

import static java.lang.System.out;
import java.util.ArrayList;

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
    
    public void Register(ArrayList<Customer> customer){
        customer.add(this);
    }
    
    public void Login(ArrayList<Customer> customer){
        for(int i=0 ; i<customer.size() ; i++){
            if(customer.get(i).equals(this)){
               out.println("you are already registered");
               return;
            }
        }
        out.println("There is an error, Please try again");
    }
    
}
