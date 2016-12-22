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
public class MyGenericContainerClass<T> implements MyGenericContainerInterface<T> {
    private T contained;
    
    public MyGenericContainerClass(T contained){
        this.contained = contained;
    }
    
    public T getContained(){
        return contained;
    }
    
}
