/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2.classes;

/**
 *
 * @author ejgo
 */
public class CountryTester {
    public static void main(String[] args) {
        Country us = new Country("United States", new Capital("Washington, D.C."));
        Country turkey = new Country("Turkey", new Capital("Ankara"));
        System.out.println("U.S. Name: " + us.getName() + "\nCapital of U.S.: " + us.getCapitalName());
        System.out.println("Turkey Name: " + turkey.getName() + "\nCapital of Turkey: " + turkey.getCapitalName());
    }
}
