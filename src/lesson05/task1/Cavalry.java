/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05.task1;

/**
 *
 * @author TGDD
 */
public class Cavalry extends Character implements TanCong {

    private String vuKhiChinh;
    private boolean giap;
    private boolean ngua;
    private String capBac;

    public Cavalry(String nameOfPlayer, int level, String gender, String vuKhiChinh, boolean giap, boolean ngua, String capBac) {
        super(nameOfPlayer, level, gender);
        this.vuKhiChinh = vuKhiChinh;
        this.giap = giap;
        this.ngua = ngua;
        this.capBac = capBac;
    }

    public String getVuKhiChinh() {
        return vuKhiChinh;
    }

    public void setVuKhiChinh(String vuKhiChinh) {
        this.vuKhiChinh = vuKhiChinh;
    }

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    public boolean isNgua() {
        return ngua;
    }

    public void setNgua(boolean ngua) {
        this.ngua = ngua;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "Cavalry{" + super.toString() + ", vuKhiChinh=" + vuKhiChinh + ", giap=" + giap + ", ngua=" + ngua + ", capBac=" + capBac + '}';
    }

    @Override
    public void tanCong() {
        System.out.println("Dam giao");
    }

    @Override
    public void hanhDong() {
        System.out.println("Phi ngua");
    }

    @Override
    public void sucManh() {
        System.out.println("Suc manh phap su = " + getLevel() * 2.0);
    }

    @Override
    public void tanCongCoVuKhi() {
        System.out.println("Dam giao vao ke dich");
    }
    
    @Override
    public void tanCongKhongVuKhi() {
        System.out.println("Dam ke dich bang tay khong");
    }

}
