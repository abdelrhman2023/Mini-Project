/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.otlob;
import java.util.*;
/**
 *
 * @author A.S.A
 */
public class Owner extends Person {
    private String resturant ;

    public Owner(String resturant, String UserName, String Password) {
        super(UserName, Password);
        this.resturant = resturant;
    }
    
    public String getResturant() {
        return resturant;
    }

    public void setResturant(String resturant) {
        this.resturant = resturant;
    }
   
}
