package com.kodilla.spotbugs;

public class BadCodeExample {
    public static double getPi() {
        return Math.PI;
    }

    // Usunięcie nieużywanego gettera getType()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

