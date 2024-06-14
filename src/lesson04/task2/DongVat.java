/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04.task2;

/**
 *
 * @author TGDD
 */
public class DongVat {

    private String tenLoaiVat;
    private int chieuDai;
    private double canNang;

    public DongVat(String tenLoaiVat, int chieuDai, double canNang) {
        this.tenLoaiVat = tenLoaiVat;
        this.chieuDai = chieuDai;
        this.canNang = canNang;
    }

    public String getTenLoaiVat() {
        return tenLoaiVat;
    }

    public void setTenLoaiVat(String tenLoaiVat) {
        this.tenLoaiVat = tenLoaiVat;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        if (chieuDai <= 0) {
            System.out.println("Chieu dai khong hop le");
        } else {
            this.chieuDai = chieuDai;
        }
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        if (canNang <= 0) {
            System.out.println("Can nang khong hop le");
        } else {
            this.canNang = canNang;
        }
    }

    @Override
    public String toString() {
        return "tenLoaiVat=" + tenLoaiVat + ", chieuDai=" + chieuDai + ", canNang=" + canNang;
    }

}
