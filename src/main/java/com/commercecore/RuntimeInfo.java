package com.commercecore;

import java.lang.management.ManagementFactory;

public class RuntimeInfo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.printf("Java version : %s%n", Runtime.version());
        System.out.printf("Vendor       : %s%n", System.getProperty("java.vendor"));
        System.out.printf("VM           : %s%n", System.getProperty("java.vm.name"));
        System.out.printf("CPUs         : %d%n", rt.availableProcessors());
        System.out.printf("Max heap     : %d MB%n", rt.maxMemory() / (1024 * 1024));
        System.out.printf("GC           : %s%n",
                ManagementFactory.getGarbageCollectorMXBeans().stream()
                        .map(gc -> gc.getName())
                        .toList());
    }
}