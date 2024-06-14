/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04.task2;

/**
 *
 * @author TGDD
 */
public class Meo extends DongVat {

    private String giongMeo;
    private String mauLong;
    private String thucAn;

    public Meo(String tenLoaiVat, int chieuDai, double canNang, String giongMeo, String mauLong, String thucAn) {
        super(tenLoaiVat, chieuDai, canNang);
        this.giongMeo = giongMeo;
        this.mauLong = mauLong;
        this.thucAn = thucAn;
    }

    public String getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(String giongMeo) {
        this.giongMeo = giongMeo;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    @Override
    public String toString() {
        return "Meo{" + super.toString() + ", giongMeo=" + giongMeo + ", mauLong=" + mauLong + ", thucAn=" + thucAn + '}';
    }

}
