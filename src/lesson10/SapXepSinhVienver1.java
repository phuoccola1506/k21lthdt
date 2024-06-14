/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lesson10.model.SinhVien;

/**
 *
 * @author TGDD
 */
public class SapXepSinhVienver1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<SinhVien> dssv = new ArrayList<SinhVien>();
        dssv.add(new SinhVien("Loc", 10, 20));
        dssv.add(new SinhVien("Nhat", 9, 19));
        dssv.add(new SinhVien("Binh", 8, 18));
        System.out.println(dssv);
        
        Collections.sort(dssv);
        for (SinhVien item: dssv) {
            System.out.println(item);
        }
    }
    
}
