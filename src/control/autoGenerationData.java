/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import project.otlob.Customer;
import project.otlob.Meal;
import project.otlob.Owner;
import project.otlob.Restaurant;

/**
 *
 * @author A.S.A
 */
public class autoGenerationData {

    Meal m;
    Restaurant r;
    Owner o;
    List<Meal> mList = new ArrayList<Meal>();

    Customer c;

    public void generate() {
        ///////////////
        // Owners

        mList = new ArrayList<Meal>();
        m = new Meal("TT", 22, "TFG");
        mList.add(m);
        m = new Meal("GG", 23, "GGH");
        mList.add(m);
        r = new Restaurant("A", "A", mList);
        o = new Owner(r, "a", "a");
        project_main.owner.add(o);

        mList = new ArrayList<Meal>();
        m = new Meal("SS", 55, "KK");
        mList.add(m);
        m = new Meal("GG", 44, "GGH");
        mList.add(m);
        r = new Restaurant("T", "T", mList);
        o = new Owner(r, "s", "s");
        project_main.owner.add(o);

        //Customers
        c = new Customer("011", "5 H", "A", "123");
        project_main.customer.add(c);

        c = new Customer("012", "5 T", "F", "111");
        project_main.customer.add(c);
    }
}
