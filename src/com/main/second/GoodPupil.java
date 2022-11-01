package com.main.second;

public class GoodPupil extends Pupil {

    @Override
    public void read() {
        System.out.println("Just love to read");
    }

    @Override
    public void write() {
        System.out.println("Just love to write");
    }

    @Override
    public String toString() {
        return "GoodPupil{}";
    }
}
