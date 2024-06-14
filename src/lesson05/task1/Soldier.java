/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05.task1;

import lesson05.task1.Character;

/**
 *
 * @author TGDD
 */
public class Soldier extends Character {

    private String vuKhiChinh;
    private boolean khien;
    private boolean giap;
    private String capBac;

    public Soldier(String nameOfPlayer, int level, String gender, String vuKhiChinh, boolean khien, boolean giap, String capBac) {
        super(nameOfPlayer, level, gender);
        this.vuKhiChinh = vuKhiChinh;
        this.capBac = capBac;
    }

    public String getVuKhiChinh() {
        return vuKhiChinh;
    }

    public void setVuKhiChinh(String vuKhiChinh) {
        this.vuKhiChinh = vuKhiChinh;
    }

    public boolean isKhien() {
        return khien;
    }

    public void setKhien(boolean khien) {
        this.khien = khien;
    }

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "Soldier{" + super.toString() + ", vuKhiChinh=" + vuKhiChinh + ", khien=" + khien + ", giap=" + giap + ", capBac=" + capBac + '}';
    }

    @Override
    public void tanCong() {
        System.out.println("Vung kiem chem");
    }

    @Override
    public void hanhDong() {
        System.out.println("Do don bang khien");
    }

    @Override
    public void sucManh() {
        System.out.println("Suc manh chien binh = " + getLevel() * 1.2);
    }

}
