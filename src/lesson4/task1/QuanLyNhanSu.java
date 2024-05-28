/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson4.task1;

/**
 *
 * @author TGDD
 */
public class QuanLyNhanSu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv = new SinhVien("Nguyen Huu Phuoc", 2005, "2301ITA022", "CNTT");
        GiangVien gv = new GiangVien("Nguyen Dinh Hoa Cuong", 1970, "CNTT01", "Tien si", "CNTT");
        
        System.out.println(sv);
        System.out.println(gv);
    }
    
}
