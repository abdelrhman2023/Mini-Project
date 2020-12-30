/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.otlob;

import control.project_main;
import static java.lang.System.out;
import java.util.*;
/**
 *
 * @author A.S.A
 */
public class Customer extends Person {
    private String MobileNumber;
    private String Address;

    public Customer( String UserName, String Password) {
        super(UserName, Password);
    }
    
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
    
    public void Register(){
        project_main.customer.add(this);
        out.println("Your Registeration Is Successfully");
    }
    
    public int Login(){
        
        for(int i=0 ; i<project_main.customer.size() ; i++){
            if(project_main.customer.get(i).getUserName().equals(this.getUserName()) && project_main.customer.get(i).getPassword().equals(this.getPassword())){
               out.println("you are already registered");
               return i;
            }
        }
        out.println("There is an error, Please try again");
        return -1;
    }
    
}
