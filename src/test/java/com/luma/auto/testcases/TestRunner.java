package com.luma.auto.testcases;

import com.luma.auto.extendReport.ExtendReport;
import org.testng.TestNG;

public class TestRunner {

    static TestNG testNG; // I put static here, because I need to use this in my main method

    public static void main(String[] args) {

        ExtendReport ext = new ExtendReport();

        testNG = new TestNG();

        testNG.setTestClasses(new Class[] {}); //here u can give ur test classes eg:- dialogHomeTestPage, purchaseASimTestPage
        testNG.addListener(ext);
        testNG.run();

    }
}
