/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimulator;

/**
 *
 * @author ahmad
 */
public class DriverClass {
    
        // Abstract factory design pattern demo 
    public static void main(String[] args) {
        Application app = configureApplication();
        app.showGarment();
    }
        //application configuration
    private static Application configureApplication() {
        
        Application app = null;
        abstractGarmentFactory factory;

        String type = "Casual";
        
        if (type.contains("Professional")) {
            factory = new profFactory();
            app = new Application(factory);
        }
        else if (type.contains("Casual")) {
            factory = new casualFactory();
            app = new Application(factory);
        }
        else if (type.contains("Party")) {
            factory = new partyFactory();
            app = new Application(factory);
        }
        else {
            System.out.println("No Factory in the system");
        }
        return app; 
    }

    
}
