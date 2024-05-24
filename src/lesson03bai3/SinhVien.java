/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson03bai3;

/**
 *
 * @author TGDD
 */
public class SinhVien {
    private String hoten;
    private int namsinh;
    private String sdt;

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getSdt(String string) {
        return sdt;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        if (namsinh < 1990) {
            System.out.println("Nam sinh: " + namsinh + " khong hop le.");
        } else {
            this.namsinh = namsinh;
        }
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoten=" + hoten + ", namsinh=" + namsinh + ", sdt=" + sdt + '}';
    }
    
    
}
