/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson9;

import lesson9.vidu1.LopHoc;
import lesson9.vidu1.SinhVien;

/**
 *
 * @author TGDD
 */
public class QuanHeAssociation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv = new SinhVien("Phuoc", new LopHoc("CNTT K21"));
        System.out.println(sv);
        
        LopHoc lop = new LopHoc("CNTT K21");
        lop.addSinhVien(sv);
//        sv.setLop(lop);
        System.out.println(lop);
    }
    
}
