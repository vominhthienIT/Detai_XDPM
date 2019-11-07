/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author AnCiuuToe
 */
@Entity
public class LateCharge implements Serializable{
    @Id
    private String lateChargeID;
    private double lateChargePrice;
    private boolean statusLateCharge;
   
    public boolean isStatusLateCharge() {
        return statusLateCharge;
    }

    public void setStatusLateCharge(boolean statusLateCharge) {
        this.statusLateCharge = statusLateCharge;
    }

    public String getLateChargeID() {
        return lateChargeID;
    }

    public void setLateChargeID(String lateChargeID) {
        this.lateChargeID = lateChargeID;
    }

    public double getLateChargePrice() {
        return lateChargePrice;
    }

    public void setLateChargePrice(double lateChargePrice) {
        this.lateChargePrice = lateChargePrice;
    }

    public LateCharge(String lateChargeID, double lateChargePrice, boolean statusLateCharge) {
        this.lateChargeID = lateChargeID;
        this.lateChargePrice = lateChargePrice;
        this.statusLateCharge = statusLateCharge;
    }

    
    public LateCharge() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.lateChargeID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LateCharge other = (LateCharge) obj;
        if (!Objects.equals(this.lateChargeID, other.lateChargeID)) {
            return false;
        }
        return true;
    }
    
    
}
