/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10.model2;

/**
 *
 * @author TGDD
 */
public class SinhVien {

    private String hoten;
    private double DTB;
    private int tuoi;

    public SinhVien(String hoten, double DTB, int tuoi) {
        this.hoten = hoten;
        this.DTB = DTB;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoten=" + hoten + ", DTB=" + DTB + ", tuoi=" + tuoi + '}';
    }

}
