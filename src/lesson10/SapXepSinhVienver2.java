/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lesson10.model2.SinhVien;

/**
 *
 * @author TGDD
 */
public class SapXepSinhVienver2 {

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
        
        // Sap xep theo ho ten
        Collections.sort(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoten().compareTo(o2.getHoten());
            }
        });

        for (SinhVien item : dssv) {
            System.out.println(item);
        }
        
        // Sap xep theo DTB
        Collections.sort(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDTB(), o2.getDTB());
            }
        });
        
        for (SinhVien item : dssv) {
            System.out.println(item);
        }
        
        // Sap xep theo tuoi
        Collections.sort(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Integer.compare(o1.getTuoi(), o2.getTuoi());
            }
        });
        
        for (SinhVien item : dssv) {
            System.out.println(item);
        }
    }

}
