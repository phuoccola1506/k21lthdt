/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai11;

/**
 *
 * @author TGDD
 */
public class SinhVien {

    private String hoten;
    private LopHoc lop;
    private HoaDon hd;

    public SinhVien(String hoten, LopHoc lop, HoaDon hd) {
        this.hoten = hoten;
        this.lop = lop;
        this.hd = hd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoten=" + hoten + ", lop=" + lop + ", hoadon=" + hd + '}';
    }

}
