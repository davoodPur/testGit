package com.company;

public class Cirlce extends Shape{
    private float r;
    private int x;
    private int y;

    public Cirlce(String name, float r, int x, int y) {
        super(name);
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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
