package com.yyqdemao.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasDemo {
    public static void main(String[] args) {
        //cas  比较并交换
        AtomicInteger atomicInteger = new AtomicInteger(5);
        boolean b = atomicInteger.compareAndSet(atomicInteger.intValue(), 300);
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);
    }
}
