/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author AnCiuuToe
 */
@Embeddable
public class RentInvoice_Detail_PK implements Serializable{
    private static final long serialVersionUID = 1L;
    private String rentInvoice;
    private String disk;

    public String getRentInvoice() {
        return rentInvoice;
    }

    public void setRentInvoice(String rentInvoice) {
        this.rentInvoice = rentInvoice;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public RentInvoice_Detail_PK(String rentInvoice, String disk) {
        this.rentInvoice = rentInvoice;
        this.disk = disk;
    }

    public RentInvoice_Detail_PK() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.rentInvoice);
        hash = 97 * hash + Objects.hashCode(this.disk);
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
        final RentInvoice_Detail_PK other = (RentInvoice_Detail_PK) obj;
        if (!Objects.equals(this.rentInvoice, other.rentInvoice)) {
            return false;
        }
        if (!Objects.equals(this.disk, other.disk)) {
            return false;
        }
        return true;
    }
    
    
    
}
