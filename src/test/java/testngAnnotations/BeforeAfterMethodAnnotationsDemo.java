package testngAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotationsDemo {

    @BeforeMethod
     public void beforeMethodExample(){
        System.out.println("Before Method Example");
    }

    @Test
    public void run1(){
        System.out.println("hello hi");
    }

    @Test
    public void run2(){
        System.out.println("hello hii");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("After Method Example");
    }



}
