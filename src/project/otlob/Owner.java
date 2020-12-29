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
    
    public void Register(ArrayList<Owner> owner){
        owner.add(this);
    }
    
    public void Login(ArrayList<Owner> owner){
        for(int i=0 ; i<owner.size() ; i++){
            if(owner.get(i).equals(this)){
                out.println("you are already registered");
                return;
            }
        }
        out.println("There is an error, Please try again");
    }
}
