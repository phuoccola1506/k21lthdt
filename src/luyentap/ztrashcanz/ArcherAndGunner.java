/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.ztrashcanz;

import lesson05.task1.Character;

/**
 *
 * @author TGDD
 */
public class ArcherAndGunner extends Character {
    private String vuKhiChinh;
    private String capBac;

    public ArcherAndGunner(String nameOfPlayer, int level, String gender, String vuKhiChinh, String capBac) {
        super(nameOfPlayer, level, gender);
        this.vuKhiChinh = vuKhiChinh;
        this.capBac = capBac;
    }

    public String getVuKhiChinh() {
        return vuKhiChinh;
    }

    public void setVuKhiChinh(String vuKhiChinh) {
        this.vuKhiChinh = vuKhiChinh;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "Archer/Gunner{" + super.toString() + "vuKhiChinh=" + vuKhiChinh + ", capBac=" + capBac + '}';
    }
}
