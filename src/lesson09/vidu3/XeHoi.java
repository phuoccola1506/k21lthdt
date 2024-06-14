/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.vidu3;

import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class XeHoi {

    private DongCo dongco;
    private ArrayList<BanhXe> dsbx;

    public XeHoi(DongCo dongco, ArrayList<BanhXe> dsbx) {
        this.dongco = dongco;
        this.dsbx = dsbx;
    }

    public XeHoi(DongCo dongco) throws CloneNotSupportedException {
        this.dongco = (DongCo)dongco.clone();
        this.dsbx = new ArrayList<>();
    }
    
    public void addBanhXe(BanhXe bx) {
        this.dsbx.add(bx);
    }

    public DongCo getDongco() {
        return dongco;
    }

    public void setDongco(DongCo dongco) {
        this.dongco = dongco;
    }

    public ArrayList<BanhXe> getDsbx() {
        return dsbx;
    }

    public void setDsbx(ArrayList<BanhXe> dsbx) {
        this.dsbx = dsbx;
    }

    @Override
    public String toString() {
        return "XeHoi{" + "dongco=" + dongco + ", dsbx=" + dsbx + '}';
    }
    
}
