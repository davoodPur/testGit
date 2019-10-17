package com.company;

public class Cirlce extends Shape{
    private float r;

    public Cirlce(String name, float r) {
        super(name);
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        if (r>0)
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cirlce)) return false;
        Cirlce cirlce = (Cirlce) o;
        return Float.compare(cirlce.r, r) == 0;
    }

    @Override
    public String toString() {
        return "Cirlce{" +
                "r=" + r +
                '}';
    }
}
