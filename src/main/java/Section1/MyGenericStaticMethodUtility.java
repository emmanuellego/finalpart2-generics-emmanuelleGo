package Section1;


import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class MyGenericStaticMethodUtility {
    public static<T> T add2Collection(T e, Collection<T> f){
        f.add(e);
        return e;
    }
}
