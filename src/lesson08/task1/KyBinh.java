/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson08.task1;

import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class KyBinh extends Object implements Cloneable {
    private int maKyBinh;
    private ArrayList<VuKhi> dsvk;
    private Iterable<VuKhi> dssp;

    public KyBinh(int maKyBinh, ArrayList<VuKhi> dsvk) {
        this.maKyBinh = maKyBinh;
        this.dsvk = dsvk;
    }

    public int getMaKyBinh() {
        return maKyBinh;
    }

    public void setMaKyBinh(int maKyBinh) {
        this.maKyBinh = maKyBinh;
    }

    public ArrayList<VuKhi> getDsvk() {
        return dsvk;
    }

    public void setDsvk(ArrayList<VuKhi> dsvk) {
        this.dsvk = dsvk;
    }

    @Override
    public String toString() {
        return "KyBinh{" + "maKyBinh=" + maKyBinh + ", dsvk=" + dsvk + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ArrayList<VuKhi> dsvkmoi = new ArrayList<>();
        for (VuKhi item: this.dssp) {
            VuKhi tam = new VuKhi(item.getTenVuKhi(), item.getSoLuong());
            dsvkmoi.add(tam);
        }
        KyBinh kq = new KyBinh(this.maKyBinh, dsvkmoi);
        return kq;
    }
    
    
}
