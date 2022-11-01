package com.main.second;

import java.util.Arrays;

public class ClassRoom {
    private final Pupil[] pupils = new Pupil[4];

    public ClassRoom(Pupil firstPupil, Pupil second) {
        this.pupils[0] = firstPupil;
        this.pupils[1] = second;
    }

    public ClassRoom(Pupil firstPupil, Pupil second, Pupil third) {
        this(firstPupil, second);
        this.pupils[2] = third;
    }

    public ClassRoom(Pupil firstPupil, Pupil second, Pupil third, Pupil fourth) {
        this(firstPupil, second, third);
        this.pupils[3] = fourth;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "pupils=" + Arrays.toString(pupils) +
                '}';
    }
}
