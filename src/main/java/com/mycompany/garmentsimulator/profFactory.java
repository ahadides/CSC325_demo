/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimulator;

/**
 *
 * @author ahmad
 */
public class profFactory implements abstractGarmentFactory {

    @Override
    public Tops getTop() {
        return new profTops();
    }

    @Override
    public Pants getPants() {
        return new profPants();
    }

    @Override
    public Shoes getShoes() {
        return new profShoes();
    }
}
