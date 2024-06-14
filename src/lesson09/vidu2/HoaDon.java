/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.vidu2;

import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class HoaDon {

    private int maHD;
    private ArrayList<SanPham> dssp;

    public HoaDon(int maHD, ArrayList<SanPham> dssp) {
        this.maHD = maHD;
        this.dssp = dssp;
    }

    public HoaDon(int maHD) {
        this.maHD = maHD;
        this.dssp = new ArrayList<>();
    }
    
    public void addSanPham(SanPham sp) throws CloneNotSupportedException{
        SanPham tam = (SanPham)sp.clone();
        this.dssp.add(tam);
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public ArrayList<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", dssp=" + dssp + '}';
    }

}
