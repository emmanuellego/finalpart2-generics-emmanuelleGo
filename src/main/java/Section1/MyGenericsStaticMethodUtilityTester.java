package Section1;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class MyGenericsStaticMethodUtilityTester {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        String s1 = "element_1";
        MyGenericStaticMethodUtility.add2Collection(s1, strings);
    }
}
