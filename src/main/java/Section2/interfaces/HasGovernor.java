/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2.interfaces;

import Section2.classes.Governor;

/**
 *
 * @author ejgo
 */
public interface HasGovernor<T extends Governor> {
    public T getGovernor();
    public String getGovernorName();
}
