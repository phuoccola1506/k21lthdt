/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luyentap.bai11;

/**
 *
 * @author TGDD
 */
public class QuanLiSanPham {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // Tao SanPham
        DongCo dc = new DongCo("Dong co xang", 300);
        BanhXe bx = new BanhXe("Banh tron", 1.5);
        XeHoi car = new XeHoi(dc, 1, "Xe Mec", 1, 50.3);
        for (int i = 0; i < 4; i++) {
            car.addBanhXe(bx);
        }
        
//        In du lieu SanPham
        SanPham sp1 = (XeHoi)car.clone();
        System.out.println(sp1);
//        Tao va in HoaDon
        HoaDon hd = new HoaDon(1509);
        hd.addSanPham(sp1);
        System.out.println(hd);
//        Tao va in SinhVien co HoaDon
        SinhVien sv = new SinhVien("Phuoc", new LopHoc("CNTT"), hd);
        System.out.println(sv);
    }
    
}
