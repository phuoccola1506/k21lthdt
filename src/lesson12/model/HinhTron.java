/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12.model;

/**
 *
 * @author TGDD
 */
public class HinhTron extends HinhHoc {
    
    private double bankinh;

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public double tinhChuVi() {
        return 2*Math.PI*bankinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*bankinh*bankinh;
    }
    
    

    @Override
    public String toString() {
        return "HinhTron{" + "bankinh=" + bankinh + ", chuvi=" + tinhChuVi() + ", dientich=" + tinhDienTich() + '}';
    }
    
}
