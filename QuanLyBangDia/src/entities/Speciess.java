/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author AnCiuuToe
 */
@Entity
public class Speciess implements Serializable{
    @Id
    private String speciessID;
     @Column (columnDefinition = "nvarchar(50)")
    private String speciessName;
    private double priceRent;
    private int numberDateRented;
    @OneToMany(mappedBy = "species")
    private List<Disks> listDisk;

    public Speciess(String speciessID, String speciessName, double priceRent, int numberDateRented) {
        this.speciessID = speciessID;
        this.speciessName = speciessName;
        this.priceRent = priceRent;
        this.numberDateRented = numberDateRented;
    }

    public String getSpeciessID() {
        return speciessID;
    }

    public void setSpeciessID(String speciessID) {
        this.speciessID = speciessID;
    }

    public String getSpeciessName() {
        return speciessName;
    }

    public void setSpeciessName(String speciessName) {
        this.speciessName = speciessName;
    }

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }

    public int getNumberDateRented() {
        return numberDateRented;
    }

    public void setNumberDateRented(int numberDateRented) {
        this.numberDateRented = numberDateRented;
    }

    public Speciess() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.speciessID);
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
        final Speciess other = (Speciess) obj;
        if (!Objects.equals(this.speciessID, other.speciessID)) {
            return false;
        }
        return true;
    }
    
    
    
}
