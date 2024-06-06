/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5.task1;

/**
 *
 * @author TGDD
 */
public class Wizard extends Character {

    private String vuKhiChinh;
    private boolean choiBay;
    private String capBac;

    public Wizard(String nameOfPlayer, int level, String gender, String vuKhiChinh, boolean choiBay, String capBac) {
        super(nameOfPlayer, level, gender);
        this.vuKhiChinh = vuKhiChinh;
        this.choiBay = choiBay;
        this.capBac = capBac;
    }

    public String getVuKhiChinh() {
        return vuKhiChinh;
    }

    public void setVuKhiChinh(String vuKhiChinh) {
        this.vuKhiChinh = vuKhiChinh;
    }

    public boolean isChoiBay() {
        return choiBay;
    }

    public void setChoiBay(boolean choiBay) {
        this.choiBay = choiBay;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "Wizard{" + super.toString() + ", vuKhiChinh=" + vuKhiChinh + ", choiBay=" + choiBay + ", capBac=" + capBac + '}';
    }

    @Override
    public void tanCong() {
        System.out.println("Ban cau lua");
    }

    @Override
    public void hanhDong() {
        System.out.println("Bay bang choi bay");
    }

    @Override
    public void sucManh() {
        System.out.println("Suc manh phap su = " + getLevel() * 1.7);
    }
}
