/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8.vidu4;

import java.util.ArrayList;
import lesson8.vidu4.SanPham;
/**
 *
 * @author TGDD
 */
public class HoaDon implements Cloneable {

    private int maHD;
    private ArrayList<SanPham> dssp;

    public HoaDon(int maHD, ArrayList<SanPham> dssp) {
        this.maHD = maHD;
        this.dssp = dssp;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        ArrayList<SanPham> dsspmoi = new ArrayList<>();
        for (SanPham item: this.dssp) {
            SanPham tam = new SanPham(item.getMaSP(), item.getTenSP());
            dsspmoi.add(tam);
        }
        HoaDon kq = new HoaDon(this.maHD, dsspmoi);
        return kq;
    }

}
