package com.munnicha.patterns.gof.creational.singleton;

/**
 *
 * @author munnicha
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton pattern classic");
        SingletonClassic sc01=SingletonClassic.getInstance();
        sc01.setMessage("Hello Singleton!");
        System.out.println("sc01.getMessage(): "+sc01.getMessage());
        SingletonClassic sc02=SingletonClassic.getInstance();
        sc02.setMessage("Same message?");
        System.out.println("sc02.getMessage()"+sc02.getMessage());
        System.out.println("sc01.getMessage(): "+sc01.getMessage());
        
        System.out.println("");
        
        System.out.println("Singleton pattern thread safe");
        SingletonThreadSafe sts01=SingletonThreadSafe.getInstance();
        sts01.setMessage("Hello Thread Safe Singleton!");
        System.out.println("sts01.getMessage(): "+sts01.getMessage());
        SingletonThreadSafe sts02=SingletonThreadSafe.getInstance();
        sts02.setMessage("Same Thread Safe message?");
        System.out.println("sts02.getMessage()"+sts02.getMessage());
        System.out.println("sts01.getMessage(): "+sts01.getMessage());
    }
}
