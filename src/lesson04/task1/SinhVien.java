/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04.task1;

/**
 *
 * @author TGDD
 */
public class SinhVien extends Nguoi {
    private String maSV;
    private String nganhHoc;

    public SinhVien(String hoTen, int namSinh, String maSV, String nganhHoc) {
        super(hoTen, namSinh);
        this.maSV = maSV;
        this.nganhHoc = nganhHoc;
    }

    @Override
    public void setNamsinh(int namSinh) {
        super.setNamsinh(namSinh); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setHoten(String hoTen) {
        super.setHoten(hoTen); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getNamsinh() {
        return super.getNamsinh(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getHoten() {
        return super.getHoten(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + super.getHoten() + ", namSinh=" + super.getNamsinh() + ", maSV=" + maSV + ", nganhHoc=" + nganhHoc + '}';
    }

    

    
    
}
