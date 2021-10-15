package com.aymen;

import java.util.Objects;

public class First {
    int x;
    First(int x) {
        this.x = x;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        First first = (First) o;
//        return x == first.x;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
