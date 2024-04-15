package com.immutable_mutable.objects;

public final class ImmutablePerson {
    private final String name;
    private final int age;

    
//    steps to create immutable class
//  1 if we make any variable final then we cannot create its setter
//  2 to create immutable class, we need to make class as final and variable as private and final
//  3 we need to initiate the variables in constructor
    
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
