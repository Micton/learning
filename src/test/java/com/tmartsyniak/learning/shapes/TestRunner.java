package com.tmartsyniak.learning.shapes;

import com.tmartsyniak.learning.shapes.task1.CircleTest;
import com.tmartsyniak.learning.shapes.task1.RingTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CircleTest.class, RingTest.class);
        int failureCount = 0;
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            failureCount++;
        }
        System.out.println(result.getRunCount() + " tests overall, failed " + failureCount + " tests");
        System.out.println(result.wasSuccessful());
    }
}


