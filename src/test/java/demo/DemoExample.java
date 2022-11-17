package demo;

import org.testng.annotations.Test;

public class DemoExample {

    @Test
    public void run1(){
        System.out.println("hello hi");
    }

    @Test
    public void run2(){
        System.out.println("hello hii");
    }

    @Test(groups = "smoke")
    public void run3(){
        System.out.println("hello hiii");
    }

    @Test(groups = "smoke")
    public void run4(){
        System.out.println("hello hiiii");
    }




}
