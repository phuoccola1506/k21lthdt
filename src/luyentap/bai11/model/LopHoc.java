/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai11.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TGDD
 */
public class LopHoc {

    private String tenlop;
    private List<SinhVien> dssv;

    public LopHoc(String tenlop, ArrayList<SinhVien> dssv) {
        this.tenlop = tenlop;
        this.dssv = dssv;
    }

    public LopHoc(String tenlop) {
        this.tenlop = tenlop;
        this.dssv = new ArrayList<>();
    }
    
    public void addSinhVien(SinhVien sv) {
        this.dssv.add(sv);
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public List<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "tenlop=" + tenlop + ", dssv=" + dssv + '}';
    }

}
