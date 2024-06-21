/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai12.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TGDD
 */
public class BinhDoan implements Cloneable {

    private int maBD;
    private String tenBD;
    List<NhanVat> dsnv;

    public BinhDoan(int maBD, String tenBD, List<NhanVat> dsnv) {
        this.maBD = maBD;
        this.tenBD = tenBD;
        this.dsnv = dsnv;
    }

    public BinhDoan(int maBD) {
        this.maBD = maBD;
        this.dsnv = new ArrayList();
    }

    public void addNhanVat(NhanVat nv) throws CloneNotSupportedException {
        NhanVat tam = (NhanVat) nv.clone();
        this.dsnv.add(tam);
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public String getTenBD() {
        return tenBD;
    }

    public void setTenBD(String tenBD) {
        this.tenBD = tenBD;
    }

    public List<NhanVat> getDsnv() {
        return dsnv;
    }

    public void setDsnv(List<NhanVat> dsnv) {
        this.dsnv = dsnv;
    }

    @Override
    public String toString() {
        return "BinhDoan{" + "maBD=" + maBD + ", tenBD=" + tenBD + ", dsnv=" + dsnv + '}';
    }

}
