package testngAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParameters {

    @Test(invocationCount = 10,invocationTimeOut = 5,expectedExceptions = {ArithmeticException.class})
    public  void A(){
        System.out.println("first test case");
        System.out.println(10/0);
        System.out.println("hi");
        // Assert.assertFalse(true);
    }

    @Test(dependsOnMethods = "A",alwaysRun = true)
    public  void B(){
        System.out.println("second test case");
    }

    @Test(dependsOnMethods = "A",alwaysRun = true)
    public  void C(){
        System.out.println("third test case");
    }

    @Test(enabled = false)
    public  void D(){
        System.out.println("fourth test case");
    }

    @Test(description = "this is test case for validating normal scenarios")
    public  void E(){
        System.out.println("fifth test case");
    }

}
