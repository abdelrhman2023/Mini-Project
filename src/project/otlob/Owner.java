/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.otlob;

import static java.lang.System.out;
import java.util.*;

/**
 *
 * @author A.S.A
 */
public class Owner extends Person {
    private Restaurant resturant ;

    public Owner(String UserName, String Password) {
        super(UserName, Password);
    }

    public Owner(Restaurant resturant, String UserName, String Password) {
        super(UserName, Password);
        this.resturant = resturant;
    }

    public Restaurant getResturant() {
        return resturant;
    }

    public void setResturant(Restaurant resturant) {
        this.resturant = resturant;
    }
    
    public void Register(List<Owner> owner){
        owner.add(this);
        out.println("Your Registeration Is Successfully");
    }
    
    public int Login(List<Owner> owner){
        for(int i=0 ; i<owner.size() ; i++){
            if(owner.get(i).getUserName().equals(this.getUserName()) && owner.get(i).getPassword().equals(this.getPassword())){
                out.println("you are already registered");
                return i;
            }
        }
        out.println("There is an error, Please try again");
        return -1;
    }
}
