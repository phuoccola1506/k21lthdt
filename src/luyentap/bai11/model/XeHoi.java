/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai11.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TGDD
 */
public class XeHoi extends SanPham {

    private DongCo dongco;
    private List<BanhXe> dsbx;

    public XeHoi(DongCo dongco, List<BanhXe> dsbx, int maSP, String tenSP, int sl, double giaca) {
        super(maSP, tenSP, sl, giaca);
        this.dongco = dongco;
        this.dsbx = dsbx;
    }

    public XeHoi(DongCo dongco, int maSP, String tenSP, int sl, double giaca) {
        super(maSP, tenSP, sl, giaca);
        this.dongco = dongco;
        this.dsbx = new ArrayList<>();
    }
    
    public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
        BanhXe tam = (BanhXe)bx.clone();
        this.dsbx.add(tam);
    }

    public DongCo getDongco() {
        return dongco;
    }

    public void setDongco(DongCo dongco) {
        this.dongco = dongco;
    }

    public List<BanhXe> getDsbx() {
        return dsbx;
    }

    public void setDsbx(ArrayList<BanhXe> dsbx) {
        this.dsbx = dsbx;
    }

    @Override
    public String toString() {
        return "XeHoi{" + super.toString() + "dongco=" + dongco + ", dsbx=" + dsbx + '}';
    }

}
