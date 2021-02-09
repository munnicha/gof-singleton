package com.munnicha.patterns.gof.creational.singleton.test;

import com.munnicha.patterns.gof.creational.singleton.SingletonClassic;
import com.munnicha.patterns.gof.creational.singleton.SingletonThreadSafe;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class SingletonTest {
    
    @Test
    public void singletonClassicTest(){
        SingletonClassic sc01=SingletonClassic.getInstance();
        sc01.setMessage("Hello Singleton!");
        SingletonClassic sc02=SingletonClassic.getInstance();
        sc02.setMessage("Same message?");
        
        assertEquals(sc01.getMessage(),sc02.getMessage());
        assertTrue(sc01==sc02);
        assertEquals(sc01.hashCode(),sc02.hashCode());
    }
    
    @Test
    public void singletonThreadSafeTest(){
        SingletonThreadSafe sts01=SingletonThreadSafe.getInstance();
        sts01.setMessage("Hello Thread Safe Singleton!");
        SingletonThreadSafe sts02=SingletonThreadSafe.getInstance();
        sts02.setMessage("Same Thread Safe message?");
        
        assertEquals(sts01.getMessage(),sts02.getMessage());
        assertTrue(sts01==sts02);
        assertEquals(sts01.hashCode(),sts02.hashCode());
    }
    
}
