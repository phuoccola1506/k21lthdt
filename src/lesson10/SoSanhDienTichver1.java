/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lesson10.model3.HinhHoc;
import lesson10.model3.HinhTron;
import lesson10.model3.HinhVuong;

/**
 *
 * @author TGDD
 */
public class SoSanhDienTichver1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<HinhHoc> dshh = new ArrayList<HinhHoc>();
        dshh.add(new HinhVuong(5));
        dshh.add(new HinhTron(6));
        dshh.add(new HinhVuong(10));
        dshh.add(new HinhTron(3));
        
        Collections.sort(dshh, new Comparator<HinhHoc>() {
            
            @Override
            public int compare(HinhHoc o1, HinhHoc o2) {
                return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
            }
        });
        
        for (HinhHoc item: dshh) {
            System.out.println(item);
        }
    }
    
}
