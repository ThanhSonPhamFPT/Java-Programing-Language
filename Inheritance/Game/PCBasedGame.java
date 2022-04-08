package com.java.inheritance.Game;

public class PCBasedGame extends Game{
    private int minRAM;
    private int minHDD;
    private double minCPU;
    public PCBasedGame(String description) {
        super(description);
    }

    public PCBasedGame(String description, int minRAM, int minHDD, double minCPU) {
        super(description);
        this.minRAM = minRAM;
        this.minHDD = minHDD;
        this.minCPU = minCPU;
    }

    public int getMinRAM() {
        return minRAM;
    }

    public void setMinRAM(int minRAM) {
        this.minRAM = minRAM;
    }

    public int getMinHDD() {
        return minHDD;
    }

    public void setMinHDD(int minHDD) {
        this.minHDD = minHDD;
    }

    public double getMinCPU() {
        return minCPU;
    }

    public void setMinCPU(double minCPU) {
        this.minCPU = minCPU;
    }

    @Override
    public String toString() {
        return super.toString()+
                " minRAM=" + minRAM +
                ", minHDD=" + minHDD +
                ", minCPU=" + minCPU;

    }
}
