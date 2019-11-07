/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author AnCiuuToe
 */
@Entity
public class Disks implements Serializable{
    @Id
    private String diskID;
    @Column (columnDefinition = "nvarchar(50)")
    private String diskName;
    private String status;
    @ManyToOne
    @JoinColumn (name = "speciesID",referencedColumnName = "speciessID")
    private Speciess species;
    @ManyToOne
    @JoinColumn (name = "titleID",referencedColumnName = "titleID")
    private Title title;
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getDiskID() {
        return diskID;
    }

    public void setDiskID(String diskID) {
        this.diskID = diskID;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public Speciess getSpecies() {
        return species;
    }

    public void setSpecies(Speciess species) {
        this.species = species;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Disks(String diskID, String diskName, String status, Speciess species, Title title) {
        this.diskID = diskID;
        this.diskName = diskName;
        this.status = status;
        this.species = species;
        this.title = title;
    }

    

    public Disks() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.diskID);
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
        final Disks other = (Disks) obj;
        if (!Objects.equals(this.diskID, other.diskID)) {
            return false;
        }
        return true;
    }

  
    
}
