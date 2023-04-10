/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimulator;

/**
 * party factory
 * @author ahmad
 */
public class partyFactory implements abstractGarmentFactory {

    @Override
    public Tops getTop() {
        return new partyTops();
    }

    @Override
    public Pants getPants() {
        return new partyPants();
    }

    @Override
    public Shoes getShoes() {
        return new partyShoes();
    }
    
}

