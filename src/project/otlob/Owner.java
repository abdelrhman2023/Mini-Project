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
    
    public void Register(){
        project_main.owner.add(this);
        out.println("Your Registeration Is Successfully");
    }
    
    public int Login(){
        for(int i=0 ; i<project_main.owner.size() ; i++){
            if(project_main.owner.get(i).getUserName().equals(this.getUserName()) && project_main.owner.get(i).getPassword().equals(this.getPassword())){
                out.println("you are already registered");
                return i;
            }
        }
        out.println("There is an error, Please try again");
        return -1;
    }
    
    public void Edit_Add(Meal e){
        this.resturant.meals.add(e);
        
    }
    
    public void Edit_Set(Meal e,int i){
        this.resturant.meals.set(i,e);
    }
    
    public void Edit_remove(int i){
        this.resturant.meals.remove(i);
    }
    
    public void ListOfMeal(){
        for(int i=0 ; i<this.resturant.meals.size() ; i++){
         out.println("*-------------------------("+(i+1)+")---------------------------*");
         out.println("Name: "+this.resturant.meals.get(i).getName());
         out.println("price: "+this.resturant.meals.get(i).getPrice());
         out.println("Describtion: "+this.resturant.meals.get(i).getDescribtion());
         out.println("*---------------------------------------------------------*");
        }
    }
}
