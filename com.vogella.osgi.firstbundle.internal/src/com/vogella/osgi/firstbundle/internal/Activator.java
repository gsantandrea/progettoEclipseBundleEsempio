package com.vogella.osgi.firstbundle.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.vogella.osgi.firstbundle.internal.MyThread;

public class Activator implements BundleActivator {
    private MyThread myThread;

    public void start(BundleContext context) throws Exception {
        System.out.println("Starting com.vogella.osgi.firstbundle");
        myThread = new MyThread();
        myThread.start();
    }


    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping com.vogella.osgi.firstbundle");
        myThread.stopThread();
        myThread.join();
    }

}