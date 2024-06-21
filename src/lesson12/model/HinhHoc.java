/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12.model;

/**
 *
 * @author TGDD
 */
public abstract class HinhHoc implements Cloneable{

    private double chuvi;
    private double dientich;

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
