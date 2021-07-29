/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author HP
 */
public class FunActivos {

    int ID;
    String NOM_USU;
    String APE_USU;
    int CAN_ACT;
    String ID_USU;

    public FunActivos() {
    }

    public FunActivos(int ID, String NOM_USU, String APE_USU, int CAN_ACT, String ID_USU) {
        this.ID = ID;
        this.NOM_USU = NOM_USU;
        this.APE_USU = APE_USU;
        this.CAN_ACT = CAN_ACT;
        this.ID_USU = ID_USU;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOM_USU() {
        return NOM_USU;
    }

    public void setNOM_USU(String NOM_USU) {
        this.NOM_USU = NOM_USU;
    }

    public String getAPE_USU() {
        return APE_USU;
    }

    public void setAPE_USU(String APE_USU) {
        this.APE_USU = APE_USU;
    }

    public int getCAN_ACT() {
        return CAN_ACT;
    }

    public void setCAN_ACT(int CAN_ACT) {
        this.CAN_ACT = CAN_ACT;
    }

    public String getID_USU() {
        return ID_USU;
    }

    public void setID_USU(String ID_USU) {
        this.ID_USU = ID_USU;
    }

}
