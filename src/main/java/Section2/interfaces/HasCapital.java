/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2.interfaces;

import Section2.classes.Capital;

/**
 *
 * @author ejgo
 */
public interface HasCapital<T extends Capital> {
    public T getCapital();
    public String getCapitalName();
}
