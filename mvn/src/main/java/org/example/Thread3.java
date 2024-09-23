package org.example;

import java.util.concurrent.Callable;

public class Thread3 implements Callable {
    public Object call() throws Exception {
        System.out.println("Thread from callable");
        return null;
    }
}
