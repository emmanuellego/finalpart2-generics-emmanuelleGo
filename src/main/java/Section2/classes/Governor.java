/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2.classes;

import Section2.interfaces.HasName;

/**
 *
 * @author ejgo
 */
public class Governor implements HasName {
    public String name;
    
    public Governor(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
