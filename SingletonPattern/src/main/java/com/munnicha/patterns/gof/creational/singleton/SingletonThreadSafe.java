package com.munnicha.patterns.gof.creational.singleton;

/**
 *
 * @author munnicha
 */
public class SingletonThreadSafe {
    
    private String message;
    
    private SingletonThreadSafe(){
        
    }
    
    private static class LazyHolder{
        static final SingletonThreadSafe INSTANCE=new SingletonThreadSafe();
    }
    
    public static SingletonThreadSafe getInstance(){
        return LazyHolder.INSTANCE;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
