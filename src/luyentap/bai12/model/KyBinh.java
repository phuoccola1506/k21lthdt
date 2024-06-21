/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai12.model;

/**
 *
 * @author TGDD
 */
public class KyBinh extends NhanVat implements HanhDong {

    VuKhi vk;
    private boolean giap;
    private boolean ngua;

    public KyBinh(String tenNhanVat, int level, VuKhi vk, boolean giap, boolean ngua) {
        super(tenNhanVat, level);
        this.vk = vk;
        this.giap = giap;
        this.ngua = ngua;
    }

    public VuKhi getVk() {
        return vk;
    }

    public void setVk(VuKhi vk) {
        this.vk = vk;
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

    @Override
    public String toString() {
        return "KyBinh{" + super.toString() + "vk=" + vk + ", giap=" + giap + ", ngua=" + ngua + '}';
    }

    @Override
    public void DiChuyen() {
        System.out.println("Phi ngua");
    }

    @Override
    public void TanCong() {
        System.out.println("Ban cung");
    }

    public double lucChien() {
        return (super.getLevel() * 5) + (vk.sucTanCong() + 2);
    }

}
