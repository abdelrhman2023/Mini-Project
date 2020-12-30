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
    public static String name , password , type , restaurant , phone , address ;
    public static int id_w , id_c ;
    public static Scanner input = new Scanner(System.in);
    public static Owner w ;
    public static Customer c ;
    public static Restaurant r ;
    public static List<Owner> owner = new ArrayList<>();
    public static List<Customer> customer = new ArrayList<>();
    
    /*-----------------------------------------------------------------------*/
    
    public static void MainRegister(){
            out.println("Please Enter Your Type( owner / customer ): ");
            type     = input.next();
            out.println("Please Enter Your Name: ");
            name     = input.next();
            out.println("Please Enter Your Password: ");
            password = input.next();
            if(null == type){
                out.println("Please enter the type correctly.");
            }
            else switch (type) {
            case "owner":
                out.println("Please Enter Name Of Restaurant: ");
                restaurant = input.next();
                out.println("Please Enter Location Of Restaurant: ");
                address    = input.next();
                r.setRestaurantName(restaurant);
                r.setLocation(address);
                w = new Owner(r, name, password);
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
    }
    
    /*----------------------------------------------------------------------*/
    
    public static void MainLogin(){
            out.println("Please Enter Your Type( owner / customer ): ");
            type     = input.next();
            out.println("Please Enter Your Name: ");
            name     = input.next();
            out.println("Please Enter Your Password: ");
            password = input.next();
            if(null == type){
                out.println("Please enter the type correctly.");
            }
            else switch (type) {
            case "owner":
                w = new Owner(name,password); 
                id_w = w.Login(owner);
                break;
            case "customer":
                c = new Customer(name,password);
                id_c = c.Login(customer);
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
