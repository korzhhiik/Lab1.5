package com.main.second;

public class ExcellentPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("Greatest studier");
    }

    @Override
    public void read() {
        System.out.println("Love to read");
    }

    @Override
    public void write() {
        System.out.println("Will write");
    }

    @Override
    public String toString() {
        return "ExcellentPupil{}";
    }
}
