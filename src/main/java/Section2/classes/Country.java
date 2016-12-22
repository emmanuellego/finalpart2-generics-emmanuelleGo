/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2.classes;

import Section2.interfaces.HasName;
import Section2.interfaces.HasCapital;

/**
 *
 * @author ejgo
 */
public class Country<C extends Capital> implements HasCapital, HasName {
    private String name;
    private C capital;
    
    public Country(String name, C capital){
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public Capital getCapital() {
        return capital;
    }

    public String getCapitalName() {
        return capital.getName();
    }
}
