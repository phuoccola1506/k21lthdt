/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4.vidu2;

/**
 *
 * @author TGDD
 */
public class LopCha {

    private String thuocTinh1;
    protected int thuocTinh2;
    public double thuocTinh3;

    public LopCha(String thuocTinh1, int thuocTinh2, double thuocTinh3) {
        this.thuocTinh1 = thuocTinh1;
        this.thuocTinh2 = thuocTinh2;
        this.thuocTinh3 = thuocTinh3;
    }

    public String getThuocTinh1() {
        return thuocTinh1;
    }

    public void setThuocTinh1(String thuocTinh1) {
        this.thuocTinh1 = thuocTinh1;
    }

    public int getThuocTinh2() {
        return thuocTinh2;
    }

    public void setThuocTinh2(int thuocTinh2) {
        this.thuocTinh2 = thuocTinh2;
    }

    public double getThuocTinh3() {
        return thuocTinh3;
    }

    public void setThuocTinh3(double thuocTinh3) {
        this.thuocTinh3 = thuocTinh3;
    }

    @Override
    public String toString() {
        return "LopCha{" + "thuocTinh1=" + thuocTinh1 + ", thuocTinh2=" + thuocTinh2 + ", thuocTinh3=" + thuocTinh3 + '}';
    }
    
    private void phuongThuc1() {
        System.out.println("Day la phuong thuc 1 private");
    }
    
    protected void phuongThuc2() {
        System.out.println("Day la phuong thuc 2 protected");
    }
    
    public void phuongThuc3() {
        System.out.println("Day la phuong thuc 3 public");
    }

    public void viduGoiPrivate() {
        System.out.println("Truy cap den thuoc tinh private");
        this.thuocTinh1 = "Thay doi gia tri";
        this.phuongThuc1();
    }
}
