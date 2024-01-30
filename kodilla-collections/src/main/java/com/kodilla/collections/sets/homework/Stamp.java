package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

        private String stampName;
        private int stampWidth;
        private int stampLength;

        private boolean isItStamped;

    public Stamp(String stampName, int stampWidth, int stampLength, boolean isItStamped) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
        this.isItStamped = isItStamped;
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

    public boolean isItStamped() {
        return isItStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWidth == stamp.stampWidth && stampLength == stamp.stampLength && isItStamped == stamp.isItStamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampLength, isItStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                ", isItStamped=" + isItStamped +
                '}';
    }
}
