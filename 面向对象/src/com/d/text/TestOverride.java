package com.d.text;

public class TestOverride {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.speak();
    }
}

class annimal{
    public void speak(){
        System.out.println("叫");
    }
}

class dog extends annimal{
    public void speak(){
        System.out.println("汪汪");
    }
}
