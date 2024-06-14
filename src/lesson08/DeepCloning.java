/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson08;

import java.util.ArrayList;
import lesson08.vidu4.HoaDon;
import lesson08.vidu4.SanPham;
/**
 *
 * @author TGDD
 */
public class DeepCloning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        ArrayList<SanPham> dssp = new ArrayList<>();
        dssp.add(new SanPham(1, "Nokia"));
        dssp.add(new SanPham(2, "SamSung"));
        HoaDon hd1 = new HoaDon(0, dssp);
        System.out.println(hd1);
        HoaDon hd2 = (HoaDon)hd1.clone();
    }
    
}
