/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import lesson11.model.SinhVien;

/**
 *
 * @author TGDD
 */
public class TimKiemLTHDT {

    public static void main(String[] args) {
//        Buoc 1: Tao lap danh sach du lieu
        List<SinhVien> dssv = new ArrayList<SinhVien>();
        dssv.add(new SinhVien("Thong", 10, 18));
        dssv.add(new SinhVien("Quy", 9, 19));
        dssv.add(new SinhVien("Nhi", 9, 20));
        dssv.add(new SinhVien("Quang", 7, 18));

        System.out.println("Danh sach sinh vien");
        for (SinhVien item : dssv) {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------");

        SinhVien sv_dtb_min = Collections.min(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDtb(), o2.getDtb());
            }
        });

        System.out.println("Sinh vien co diem dtb thap nhat la");
        System.out.println(sv_dtb_min);
        System.out.println("-------------------------------------------");

        SinhVien sv_tuoi_max = Collections.max(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Integer.compare(o1.getTuoi(), o2.getTuoi());
            }
        });

        System.out.println("Sinh vien co tuoi lon nhat la");
        System.out.println(sv_tuoi_max);
        System.out.println("-------------------------------------------");

        int sv_search = Collections.binarySearch(dssv, new SinhVien("Quy", 0, 0),
                new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoten().compareTo(o2.getHoten());
            }
        });

        System.out.println("Vi tri cua sinh vien dau tien co ten Quy");
        if (sv_search < 0) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay, sinh vien co vi tri la " + (sv_search + 1));
            System.out.println(dssv.get(sv_search));
        }
        System.out.println("-------------------------------------------");

        List<SinhVien> kqloc = dssv.stream()
                .filter(sv -> sv.getDtb() >= 8)
                .filter(sv -> sv.getDtb() <= 10)
                .filter(sv -> sv.getTuoi() >= 18)
                .filter(sv -> sv.getTuoi() <= 20)
                .toList();
        System.out.println("Ket qua loc du lieu: ");
        for (SinhVien item : kqloc) {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------");

//        Buoc 6: Xay dung menh de logic - Predicate
//        Loc tat ca sinh vien co 8 <= dtb <= 10 OR 18 <= tuoi <= 20
//        Xay dung menh de logic 8 <= dtb <= 10
        Predicate<SinhVien> dk_dtb = new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien t) {
                return t.getDtb() >= 8 && t.getDtb() <= 10;
            }
        };
//        Xay dung menh de logic 8 <= dtb <= 10
        Predicate<SinhVien> dk_tuoi = new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien t) {
                return t.getTuoi() >= 18 && t.getTuoi() <= 20;
            }
        };
//        Tien hanh loc du lieu bang Stream va filter
        List<SinhVien> dskq = dssv.stream()
                .filter(dk_dtb.or(dk_tuoi))
                .toList();
        System.out.println("In ket qua");
        for (SinhVien item: dskq) {
            System.out.println(item);
        }
//        Tinh gia tri trung binh cua cac sinh vien co 8 <= dtb <= 10 va tbc do duoi cua cac sinh vien do
    }

}
