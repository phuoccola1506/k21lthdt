/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai11;

/**
 *
 * @author TGDD
 */
public class SanPham implements Cloneable {

    private int maSP;
    private String tenSP;
    private int sl;
    private double giaca;

    public SanPham(int maSP, String tenSP, int sl, double giaca) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.sl = sl;
        this.giaca = giaca;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getGiaca() {
        return giaca;
    }

    public void setGiaca(double giaca) {
        this.giaca = giaca;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", sl=" + sl + ", giaca=" + giaca + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
