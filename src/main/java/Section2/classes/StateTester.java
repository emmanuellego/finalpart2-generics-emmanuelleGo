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
public class StateTester {
    public static void main(String[] args) {
        State nj = new State("New Jersey", new Capital("Trenton"), new Governor("Chris Christie"));
        System.out.println("N.J. Name: " + nj.getName() + "\nCapital of N.J.: " + nj.getCapitalName() + "\nGovernor of N.J.: " + nj.getGovernorName());
    }
}
