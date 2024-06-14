/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson03.task1;

/**
 *
 * @author TGDD
 */



public class QLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khai bao doi tuong sv kieu SinhVien
        SinhVien sv;
        // Khoi tao doi tuong sinh vien
        sv = new SinhVien();
        // Gan gia tri cho doi tuong sv
        sv.hoten = "Nguyen Van A";
        sv.namsinh = 2005;
        sv.sdt = "0123456789";
        // Xuat gia tri cua doi tuong sv
        System.out.println("Ho ten: " + sv.hoten + "; Nam sinh: " + sv.namsinh + "; Sdt: " + sv.sdt);
    }
    
}
