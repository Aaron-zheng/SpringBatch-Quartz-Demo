package com.sightcorner.springbatchquartz;

/**
 * Created by zhengfucheng on 28/2/2017.
 */
public class SimpleCounter {

    private static int counter = 0;

    public void execute() {
        counter++;
        System.out.println("第 " + counter + " 次");
    }
}
