/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimulator;

/**
 *
 * @author ahmad
 */
public class casualFactory implements abstractGarmentFactory {

    @Override
    public Tops getTop() {
        return new casualTops();
    }

    @Override
    public Pants getPants() {
        return new casualPants();
    }

    @Override
    public Shoes getShoes() {
        return new casualShoes();
    }
    
}
