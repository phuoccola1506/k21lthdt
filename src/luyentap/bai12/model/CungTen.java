/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai12.model;

/**
 *
 * @author TGDD
 */
public class CungTen extends VuKhi {

    private int AD;
    private double tanBan;

    public CungTen(int AD, double tanBan) {
        this.AD = AD;
        this.tanBan = tanBan;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public double getTanBan() {
        return tanBan;
    }

    public void setTanBan(double tanBan) {
        this.tanBan = tanBan;
    }

    @Override
    public String toString() {
        return "CungTen{" + "AD=" + AD + ", tanBan=" + tanBan + '}';
    }

    @Override
    public double sucTanCong() {
        return AD * 3;
    }
}
