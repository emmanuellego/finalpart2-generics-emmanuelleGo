package Section1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class MyGenericContainerTester {
    public static void main(String[] args) {
        MyGenericContainerInterface<String> c4String = new MyGenericContainerClass("ilker");
        MyGenericContainerInterface<Integer> c4Integer = new MyGenericContainerClass(1234);
        System.out.println("String Container contains: " + c4String.getContained());
        System.out.println("Integer Container contains: " + c4Integer.getContained());
    }
}
