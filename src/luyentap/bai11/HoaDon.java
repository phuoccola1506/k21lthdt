/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TGDD
 */
public class HoaDon {

    private int soHoaDon;
    private List<SanPham> dssp;

    public HoaDon(int soHoaDon, ArrayList<SanPham> dssp) {
        this.soHoaDon = soHoaDon;
        this.dssp = dssp;
    }

    public HoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
        this.dssp = new ArrayList<>();
    }
    
    public void addSanPham(SanPham sp) throws CloneNotSupportedException {
        SanPham tam = (SanPham)sp.clone();
        this.dssp.add(tam);
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public List<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "soHoaDon=" + soHoaDon + ", dssp=" + dssp + '}';
    }

}
