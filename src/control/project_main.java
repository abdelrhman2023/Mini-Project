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

    public static String name, password, type, restaurant, phone, address;
    public static int id_w = -1, id_c = -1;
    public static Scanner input = new Scanner(System.in);
    public static Owner w;
    public static Customer c;
    public static Restaurant r;
    public static Meal m;
    public static List<Owner> owner = new ArrayList<>();
    public static List<Customer> customer = new ArrayList<>();
    public static List<Order> order = new ArrayList<>();

    /*-----------------------------------------------------------------------*/
    public static void MainRegister() {
        out.println("Please Enter Your Type( owner / customer ): ");
        type = input.next();
        out.println("Please Enter Your Name: ");
        name = input.next();
        out.println("Please Enter Your Password: ");
        password = input.next();
        if (null == type) {
            out.println("Please enter the type correctly.");
        } else {
            switch (type) {
                case "owner":
                    out.println("Please Enter Name Of Restaurant: ");
                    restaurant = input.next();
                    out.println("Please Enter Location Of Restaurant: ");
                    address = input.next();
                    Restaurant r = new Restaurant(restaurant, address);
                    w = new Owner(r, name, password);
                    w.Register();
                    break;

                case "customer":
                    out.println("Please Enter Your Mobile Number: ");
                    phone = input.next();
                    out.println("Please Enter Your Address: ");
                    address = input.next();
                    c = new Customer(phone, address, name, password);
                    c.Register();
                    break;
                default:
                    out.println("Please enter the type correctly.");
                    break;
            }
        }
    }

    /*----------------------------------------------------------------------*/
    public static boolean MainLogin() {
        out.println("Please Enter Your Type( owner / customer ): ");
        type = input.next();
        out.println("Please Enter Your Name: ");
        name = input.next();
        out.println("Please Enter Your Password: ");
        password = input.next();
        if (null == type) {
            out.println("Please enter the type correctly.");
            return false;
        } else {
            switch (type) {
                case "owner":
                    w = new Owner(name, password);
                    id_w = w.Login();
                    out.println("ID = " + id_w);
                    if (id_w == -1) {
                        return false;
                    }
                    return true;
                case "customer":
                    c = new Customer(name, password);
                    id_c = c.Login();
                    if (id_c == -1) {
                        return false;
                    }
                    return true;
                default:
                    out.println("Please enter the type correctly.");
                    return false;
            }
        }
    }

    /*----------------------------------------------------------------------*/
    //owner
    public static void AddMeal() {
        String Name, Describtion;
        int Price;
        out.println("Please Enter The Name Of Meal: ");
        Name = input.next();
        out.println("Please Enter The Price Of Meal: ");
        Price = input.nextInt();
        out.println("Please Enter The Describtion Of Meal: ");
        Describtion = input.next();
        m = new Meal(Name, Price, Describtion);
        owner.get(id_w).Edit_Add(m);
        /*Owner o = owner.get(id_w);
        List<Meal> mealList = o.getResturant().getMeals();
        mealList.add(m);
        owner.get(id_w).getResturant().setMeals(mealList);*/
    }

    /*----------------------------------------------------------------------*/
    //owner
    public static void EditMeal() {
        String Name, Describtion;
        int Price, num;
        out.println("Please Enter The Number Of Meal Of The Following: ");

        int i = 0;
        for (Meal meal : owner.get(id_w).getResturant().getMeals()) {
            out.println("     - " + i + ") " + meal.getName());
            i++;
        }
        num = input.nextInt();

        out.println("Please Enter The Name Of Meal: ");
        Name = input.next();
        out.println("Please Enter The Price Of Meal: ");
        Price = input.nextInt();
        out.println("Please Enter The Describtion Of Meal: ");
        Describtion = input.next();

        m = new Meal(Name, Price, Describtion);
        owner.get(id_w).Edit_Set(m, num);
    }

    /*----------------------------------------------------------------------*/
    //owner
    public static void RemoveMeal() {
        int num;
        out.println("Please Enter The Number Of Meal: ");
        num = input.nextInt();
        owner.get(id_w).Edit_remove(num);
    }

    /*----------------------------------------------------------------------*/
    //owner
    public static void ViewMeals() {
        owner.get(id_w).ListOfMeal();
    }

    /*----------------------------------------------------------------------*/
    public static void main(String[] args) {
        int choice;
        String ans;
        while (true) {
            out.println("....Welcome To Otlob Online....");
            out.println("Please choice ( Register / Login / FillData):\n1-Register\t\t2-Login\t\t3-FillData");
            choice = input.nextInt();
            switch (choice) {
                case 3:
                    new control.autoGenerationData().generate();
                    break;
                case 1:
                    MainRegister();
                    break;
                case 2:
                    if (MainLogin()) {
                        switch (type) {
                            case "owner":
                                while (true) {
                                    out.println("1- Press(1) to add a meal.");
                                    out.println("2- Press(2) to edit a meal.");
                                    out.println("3- Press(3) to remove a meal.");
                                    out.println("4- Press(4) to view the list of meals.");
                                    out.println("5- Press(5) to view restaurant's orders.");
                                    choice = input.nextInt();
                                    switch (choice) {
                                        case 1:
                                            AddMeal();
                                            break;
                                        case 2:
                                            EditMeal();
                                            break;
                                        case 3:
                                            RemoveMeal();
                                            break;
                                        case 4:
                                            ViewMeals();
                                            break;
                                        case 5:
                                            break;
                                    }
                                    out.println("Do you want to do any thing else ?");
                                    ans = input.next();
                                    if ("Y".equals(ans) || "y".equals(ans)) {
                                        break;
                                    }
                                }
                        }
                    } else {
                        break;
                    }
            }
            out.println("Do you want to exit the application ?");
            ans = input.next();
            if ("Y".equals(ans) || "y".equals(ans)) {
                break;
            }
        }

    }

}
