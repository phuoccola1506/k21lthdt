/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luyentap.bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import luyentap.bai11.model.XeHoi;
import luyentap.bai11.model.DongCo;
import luyentap.bai11.model.BanhXe;
import luyentap.bai11.model.SinhVien;
import luyentap.bai11.model.HoaDon;
import luyentap.bai11.model.Laptop;
import luyentap.bai11.model.SanPham;
import luyentap.bai11.model.LopHoc;

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
//        Tao danh sach List kieu XeHoi chua 5 doi tuong
        List<XeHoi> cars = new ArrayList<>();
//        XeHoi1
        DongCo dc1 = new DongCo("Dong co xang", 300);
        XeHoi car1 = new XeHoi(dc1, 1, "Mercedes", 5, 300000000);
        BanhXe bx1 = new BanhXe("Tron", 1.5);
        for (int i = 0; i < 4; i++) {
            car1.addBanhXe(bx1);
        }
        cars.add(car1);
//        XeHoi2
        DongCo dc2 = new DongCo("Dong co xang", 300);
        XeHoi car2 = new XeHoi(dc1, 1, "Lamborghini", 2, 700000000);
        BanhXe bx2 = new BanhXe("Tron", 1.5);
        for (int i = 0; i < 4; i++) {
            car2.addBanhXe(bx2);
        }
        cars.add(car2);
//        XeHoi3
        DongCo dc3 = new DongCo("Dong co xang", 300);
        XeHoi car3 = new XeHoi(dc1, 1, "Toyota", 15, 200000000);
        BanhXe bx3 = new BanhXe("Tron", 1.5);
        for (int i = 0; i < 4; i++) {
            car3.addBanhXe(bx3);
        }
        cars.add(car3);
//        XeHoi4
        DongCo dc4 = new DongCo("Dong co xang", 300);
        XeHoi car4 = new XeHoi(dc1, 1, "Kia", 12, 150000000);
        BanhXe bx4 = new BanhXe("Tron", 1.5);
        for (int i = 0; i < 4; i++) {
            car4.addBanhXe(bx4);
        }
        cars.add(car4);
//        XeHoi5
        DongCo dc5 = new DongCo("Dong co xang", 300);
        XeHoi car5 = new XeHoi(dc1, 1, "Ranger", 5, 500000000);
        BanhXe bx5 = new BanhXe("Tron", 1.5);
        for (int i = 0; i < 4; i++) {
            car5.addBanhXe(bx5);
        }
        cars.add(car5);
//        In ra danh sach XeHoi
        for (XeHoi item : cars) {
            System.out.println(item);
        }

//        Tao danh sach List kieu Laptop chua 7 doi tuong
        List<Laptop> lts = new ArrayList<>();
//        add Laptop
        lts.add(new Laptop(1, "Dell", 20, 15000000, 16, "i7"));
        lts.add(new Laptop(2, "MSI", 10, 2000000, 32, "i7"));
        lts.add(new Laptop(3, "Mac", 15, 23000000, 16, "i7"));
        lts.add(new Laptop(4, "Lenovo", 20, 18000000, 8, "i7"));
        lts.add(new Laptop(5, "Asus", 15, 32000000, 32, "i7"));
        lts.add(new Laptop(6, "HP", 30, 15000000, 8, "i7"));
        lts.add(new Laptop(7, "ROG", 12,50000000, 32, "i7"));
//        In ra danh sach Laptop
        for (Laptop item : lts) {
            System.out.println(item);
        }

//        Tao 2 SinhVien co HoaDon co 5 SanPham
        List<SinhVien> dssv = new ArrayList<>();
//        add SanPham
        LopHoc lop1 = new LopHoc("CNTT");
        HoaDon hd1 = new HoaDon(1509);
        hd1.addSanPham(car1);
        hd1.addSanPham(car3);
        hd1.addSanPham(car4);
        hd1.addSanPham(lts.get(0));
        hd1.addSanPham(lts.get(6));
        SinhVien sv1 = new SinhVien("Phuoc", lop1, hd1);

        HoaDon hd2 = new HoaDon(1503);
        hd2.addSanPham(car2);
        hd2.addSanPham(car4);
        hd2.addSanPham(lts.get(1));
        hd2.addSanPham(lts.get(2));
        hd2.addSanPham(lts.get(3));
        SinhVien sv2 = new SinhVien("Zin", lop1, hd2);
//        In ra danh sach SinhVien
        System.out.println(sv1);
        System.out.println(sv2);

//        Sap xep List<XeHoi> theo giaca
        Collections.sort(cars, new Comparator<XeHoi>() {
            @Override
            public int compare(XeHoi o1, XeHoi o2) {
                return Double.compare(o1.getGiaca(), o2.getGiaca());
            }
        } );
        for (XeHoi item: cars) {
            System.out.println(item);
        }
        
//        Sap xep List<Laptop> theo ram
        Collections.sort(lts, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }
        });
        for (Laptop item: lts) {
            System.out.println(item);
        }
        
//        Tim kiem SanPham co giaca cao nhat trong hoa don tung SinhVien
        List<SanPham> dssp = sv1.getHd().getDssp();
        SanPham tam = Collections.max(dssp, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGiaca(), o2.getGiaca());
            }
        });
        System.out.println("SanPham co gia cao nhat cua HoaDon SinhVien" + sv1.getHoten() + " la");
        System.out.println(tam);
        
        Predicate<SanPham> dk_tk = new Predicate<SanPham>() {

            @Override
            public boolean test(SanPham t) {
                return t.getGiaca() >= 20000000 && t.getSl() >= 5;
            }
            
        };
        List<SanPham> dskq = dssp.stream()
                .filter(dk_tk)
                .toList();
        System.out.println("Danh sach tim kiem: ");
        for (SanPham item: dskq) {
            System.out.println(item);
        }
    }

}
