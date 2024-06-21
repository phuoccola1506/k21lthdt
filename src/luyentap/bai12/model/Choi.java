/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai12.model;

/**
 *
 * @author TGDD
 */
public class Choi extends VuKhi {

    private int AP;
    private double tocDoBay;

    public Choi(int AP, double tocDoBay) {
        this.AP = AP;
        this.tocDoBay = tocDoBay;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public double getTocDoBay() {
        return tocDoBay;
    }

    public void setTocDoBay(double tocDoBay) {
        this.tocDoBay = tocDoBay;
    }

    @Override
    public String toString() {
        return "Choi{" + "AP=" + AP + ", tocDoBay=" + tocDoBay + '}';
    }

    @Override
    public double sucTanCong() {
        return AP * 2.5;
    }

}
