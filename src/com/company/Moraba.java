package com.company;

public class Moraba {
    private int tols,arzs,ertefa;


    public Moraba(int tol, int arz, int ertefa) {
        this.tols = tol;
        this.arzs = arz;
        this.ertefa = ertefa;
    }

    public int getTol() {
        return tols;
    }

    public void setTol(int tol) {
        this.tols = tol;
    }

    public int getArz() {
        return arzs;
    }

    public void setArz(int arz) {
        this.arzs = arz;
    }

    public int getErtefa() { return ertefa; }

    public void setErtefa(int ertefa) { this.ertefa = ertefa; }
}
