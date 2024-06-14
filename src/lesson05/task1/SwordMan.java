/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05.task1;

/**
 *
 * @author TGDD
 */
public class SwordMan extends Character {

    private String vuKhiChinh;
    private int soKiem;
    private String capBac;

    public SwordMan(String nameOfPlayer, int level, String gender, String vuKhiChinh, int soKiem, String capBac) {
        super(nameOfPlayer, level, gender);
        this.vuKhiChinh = vuKhiChinh;
        this.soKiem = soKiem;
        this.capBac = capBac;

    }

    public String getVuKhiChinh() {
        return vuKhiChinh;
    }

    public void setVuKhiChinh(String vuKhiChinh) {
        this.vuKhiChinh = vuKhiChinh;
    }

    public int getSoKiem() {
        return soKiem;
    }

    public void setSoKiem(int soKiem) {
        this.soKiem = soKiem;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "SwordMan{" + super.toString() + ", vuKhiChinh=" + vuKhiChinh + ", soKiem=" + soKiem + ", capBac=" + capBac + '}';
    }

    @Override
    public void tanCong() {
        System.out.println("Chem");
    }

    @Override
    public void hanhDong() {
        System.out.println("Chay tren mai nha");
    }

    @Override
    public void sucManh() {
        System.out.println("Suc manh kiem khach = " + getLevel() * 1.5);
    }

}
