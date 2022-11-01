package com.main.second;

public class Main {
    public static void main(String[] args) {
        var firstPupil = new ExcellentPupil();
        firstPupil.write();
        firstPupil.read();
        firstPupil.study();
        firstPupil.relax();

        var secondPupil = new GoodPupil();
        secondPupil.write();
        secondPupil.read();
        secondPupil.study();
        secondPupil.relax();

        var thirdPupil = new BadPupil();
        thirdPupil.write();
        thirdPupil.read();
        thirdPupil.study();
        thirdPupil.relax();

        var classRoom = new ClassRoom(firstPupil, secondPupil, thirdPupil);
        System.out.println(classRoom);
    }
}
