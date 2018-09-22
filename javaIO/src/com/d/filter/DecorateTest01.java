package com.d.filter;

public class DecorateTest01 {
    public static void main(String[] args){
        Person p = new Person();
        p.say();
        //装饰
        Amp amp = new Amp(p);
        amp.say();
    }
}
interface Say{
    void say();
}
class Person implements Say{
    private int voice = 10;
    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
    @Override
    public void say() {
        System.out.println(voice);
    }
}
class Amp implements Say{
    private Person p;
    Amp(Person p){
        this.p = p;
    }
    @Override
    public void say() {
        System.out.println(p.getVoice()*10);
    }
}