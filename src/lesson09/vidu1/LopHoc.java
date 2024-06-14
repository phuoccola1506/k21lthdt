/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.vidu1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TGDD
 */
public class LopHoc {

    private String tenLop;
    private List<SinhVien> dssv;

    public LopHoc(String tenLop, List<SinhVien> dssv) {
        this.tenLop = tenLop;
        this.dssv = dssv;
    }

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.dssv = new ArrayList<>();
    }
    
    public void addSinhVien(SinhVien sv) {
        this.dssv.add(sv);
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public List<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(List<SinhVien> dssv) {
        this.dssv = dssv;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "tenLop=" + tenLop + ", dssv=" + dssv + '}';
    }

}
