package com.itrex.args;

public class ArgsRunner {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

/*
Edit Configuration
VM PAram:  -Dtest1 -Dfirst=project -Xms512m -Xmx1024m
Program args: arg1 arg2=help test=dev

System.getProperties() - get Program arg
System.getenv() - get Vm

 */
