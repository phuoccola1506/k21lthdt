/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson12;

import lesson12.model.BoSuuTap;
import lesson12.model.HinhHoc;
import lesson12.model.HinhTron;
import lesson12.model.HinhVuong;

/**
 *
 * @author TGDD
 */
public class QuanLyHinhHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoSuuTap dshh = new BoSuuTap();
        dshh.addHinhHoc(new HinhVuong(5));
        dshh.addHinhHoc(new HinhTron(10.5));
        
        System.out.println(dshh);
        
        for (HinhHoc item: dshh) {
            System.out.println(item);
        }
    }
    
}
