/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.*;
import project.otlob.*;

/**
 *
 * @author A.S.A
 */
public class project_main {
    
    static Scanner input = new Scanner(System.in);
    static Owner w ;
    static Customer c ;
    static ArrayList<Owner> owner = new ArrayList<Owner>();
    static ArrayList<Customer> customer = new ArrayList<Customer>();
    
    /*-----------------------------------------------------------------------*/
    
    public static void MainRegister(){
        String name , password , type , restaurant , phone , address ;
            out.println("Please Enter Your Name: ");
            name     = input.next();
            out.println("Please Enter Your Password: ");
            password = input.next();
            out.println("Please Enter Your Type( owner / customer ): ");
            type     = input.next();
            if(null == type){
                out.println("Please enter the type correctly.");
            }
            else switch (type) {
            case "owner":
                out.println("Please Enter Name Of Restaurant: ");
                restaurant = input.next();
                w = new Owner(restaurant, name, password);
                w.Register(owner);
                break;
            case "customer":
                out.println("Please Enter Your Mobile Number: ");
                phone    = input.next();
                out.println("Please Enter Your Address: ");
                address  = input.next();
                c = new Customer(phone,address,name,password);
                c.Register(customer);   
                break;
            default:
                out.println("Please enter the type correctly.");
                break;
        }
            out.println("Your Registeration Is Successfully");
    }
    
    /*----------------------------------------------------------------------*/
    
    public static void MainLogin(){
        String name , password , type , restaurant , phone , address ;
            out.println("Please Enter Your Name: ");
            name     = input.next();
            out.println("Please Enter Your Password: ");
            password = input.next();
            out.println("Please Enter Your Type( owner / customer ): ");
            type     = input.next();
            if(null == type){
                out.println("Please enter the type correctly.");
            }
            else switch (type) {
            case "owner":
                out.println("Please Enter Name Of Restaurant: ");
                restaurant = input.next();
                w = new Owner(restaurant, name, password); 
                w.Login(owner);
                break;
            case "customer":
                out.println("Please Enter Your Mobile Number: ");
                phone    = input.next();
                out.println("Please Enter Your Address: ");
                address  = input.next();
                c = new Customer(phone,address,name,password);
                c.Login(customer);
                break;
            default:
                out.println("Please enter the type correctly.");
                break;
        }
    }
    
    /*----------------------------------------------------------------------*/
    
    public static void main(String[] args) {
    int choice;
    String ans;
    while(true){
        out.println("....Welcome To Otlob Online....");
        out.println("Please choice ( Register / Login ):\n1-Register\t\t2-Login");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                MainRegister();
                break;
            case 2:
                MainLogin();
                break;
        }
        out.println("Do you want to exit the application ?");
        ans = input.next();
        if("Y".equals(ans) || "y".equals(ans)){
            break;
        }
}
    
    }
    
}
