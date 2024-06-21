/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luyentap.bai12;

import java.util.ArrayList;
import java.util.List;
import luyentap.bai12.model.BinhDoan;
import luyentap.bai12.model.Choi;
import luyentap.bai12.model.CungTen;
import luyentap.bai12.model.KyBinh;
import luyentap.bai12.model.NhanVat;
import luyentap.bai12.model.PhuThuy;

/**
 *
 * @author TGDD
 */
public class QuanLyNhanVat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        List<NhanVat> dsnv1 = new ArrayList<>();
//        NhanVat1
        KyBinh nv1 = new KyBinh("Phuoc", 70, new CungTen(70, 300), true, true);
        dsnv1.add(nv1);
//        NhanVat2
        KyBinh nv2 = new KyBinh("Vinh", 55, new CungTen(20, 200), false, true);
        dsnv1.add(nv2);
//        NhanVat3
        KyBinh nv3 = new KyBinh("Phuoc", 92, new CungTen(100, 500), true, true);
        dsnv1.add(nv3);
//        NhanVat4
        PhuThuy nv4 = new PhuThuy("Tuan", 63, new Choi(50, 40), true);
        dsnv1.add(nv4);
//        In danh sach NhanVat
        BinhDoan bd1 = new BinhDoan(1509, "Binh doan tien cong", dsnv1);
        System.out.println("Danh sach binh doan " + bd1.getTenBD());
        System.out.println(bd1);
        
    }

}
