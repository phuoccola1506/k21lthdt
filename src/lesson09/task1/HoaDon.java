/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.task1;

import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class HoaDon {
    private int soHD;
    private ArrayList<SanPham> dssp;

    public HoaDon(int soHD, ArrayList<SanPham> dssp) {
        this.soHD = soHD;
        this.dssp = dssp;
    }
    
    public HoaDon(int soHD) {
        this.soHD = soHD;
        this.dssp = new ArrayList<>();
    }
    
    public void addSanPham(lesson09.task1.SanPham sp) throws CloneNotSupportedException{
        lesson09.task1.SanPham tam = (lesson09.task1.SanPham)sp.clone();
        this.dssp.add(tam);
    }

    public int getSoHD() {
        return soHD;
    }

    public void setSoHD(int soHD) {
        this.soHD = soHD;
    }

    public ArrayList<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "soHD=" + soHD + ", dssp=" + dssp + '}';
    }
    
    
}
