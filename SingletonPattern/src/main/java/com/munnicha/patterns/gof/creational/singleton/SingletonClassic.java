package com.munnicha.patterns.gof.creational.singleton;

/**
 *
 * @author munnicha
 */
public class SingletonClassic {
    
    private static SingletonClassic singleton;
    private String message;
    
    private SingletonClassic(){
        
    }
    
    public static SingletonClassic getInstance(){
        if(singleton==null){
            singleton=new SingletonClassic();
        }
        return singleton;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
