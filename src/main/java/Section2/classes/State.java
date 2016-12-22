/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2.classes;

import Section2.interfaces.HasGovernor;
import Section2.interfaces.HasName;
import Section2.interfaces.HasCapital;

/**
 *
 * @author ejgo
 */
public class State<C extends Capital, G extends Governor> implements HasCapital, HasGovernor, HasName {
    private String name;
    private C capital;
    private G governor;
    
    public State(String name, C capital, G governor){
        this.name = name;
        this.capital = capital;
        this.governor = governor;
    }

    public Governor getGovernor() {
        return governor;
    }

    public String getGovernorName() {
        return governor.getName();
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
