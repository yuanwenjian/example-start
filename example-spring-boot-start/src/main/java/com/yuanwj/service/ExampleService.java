package com.yuanwj.service;

/**
 * Created by bmk on 18-3-29.
 */
public class ExampleService {

    private int number;

    public ExampleService(){

    }

    public ExampleService(int number){
        this.number=number;
    }

    public int add(int value){
        return this.number+value;
    }
}
