package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

        private String stampName;
        private int stampWidth;
        private int stampLength;

    public Stamp(String stampName, int stampWidth, int stampLength) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
    }

    public String getStampName() {
        return stampName;
    }

    public int getStampWidth() {
        return stampWidth;
    }

    public int getStampLength() {
        return stampLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWidth == stamp.stampWidth && stampLength == stamp.stampLength && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampLength);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                '}';
    }

}
