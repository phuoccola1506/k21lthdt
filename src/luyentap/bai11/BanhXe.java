/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai11;

/**
 *
 * @author TGDD
 */
public class BanhXe implements Cloneable {

    private String loaiBanhXe;
    private double bankinh;

    public BanhXe(String loaiBanhXe, double bankinh) {
        this.loaiBanhXe = loaiBanhXe;
        this.bankinh = bankinh;
    }

    public String getLoaiBanhXe() {
        return loaiBanhXe;
    }

    public void setLoaiBanhXe(String loaiBanhXe) {
        this.loaiBanhXe = loaiBanhXe;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public String toString() {
        return "BanhXe{" + "loaiBanhXe=" + loaiBanhXe + ", bankinh=" + bankinh + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
