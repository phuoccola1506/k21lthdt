/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12.model;

/**
 *
 * @author TGDD
 */
public class HinhVuong extends HinhHoc {

    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh + ", chuvi=" + tinhChuVi() + ", dientich=" + tinhDienTich() + '}';
    }

}
