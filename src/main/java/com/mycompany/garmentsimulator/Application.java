/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimulator;

/**
 *Application to describe a garment 
 * @author ahmad
 */
public class Application {
    // variables for each garment type
    private Tops top;
    private Shoes shoes;
    private Pants pants;
    
    // constructor
    public Application(abstractGarmentFactory factory) {
        top = factory.getTop();
        shoes = factory.getShoes();
        pants = factory.getPants();
        
    }
    
    // method to show garment variant
    public void showGarment(){
        top.typeOfTops();
        pants.typeOfPants();
        shoes.typeOfShoes();
    }
}
