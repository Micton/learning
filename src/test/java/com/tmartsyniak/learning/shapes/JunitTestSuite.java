package com.tmartsyniak.learning.shapes;

import com.tmartsyniak.learning.shapes.task1.CircleTest;
import com.tmartsyniak.learning.shapes.task1.RingTest;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {

    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite(CircleTest.class, RingTest.class);
        TestResult result = new TestResult();
        testSuite.run(result);
        System.out.println("Number of test cases " + result.runCount());
    }
}


