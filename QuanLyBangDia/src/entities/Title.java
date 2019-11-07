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
public class Title implements Serializable{
    @Id
    private String titleID;
    @Column (columnDefinition = "nvarchar(50)")
    private String titleName;
    //@OneToMany (mappedBy = "title")
    //private List<Disks> listDisks;

    public Title(String titleID, String titleName) {
        this.titleID = titleID;
        this.titleName = titleName;
    }

    public String getTitleID() {
        return titleID;
    }

    public void setTitleID(String titleID) {
        this.titleID = titleID;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

//    public List<Disks> getListDisks() {
//        return listDisks;
//    }
//
//    public void setListDisks(List<Disks> listDisks) {
//        this.listDisks = listDisks;
//    }
    
    @Override
    public String toString() {
        return "Title{" + "titleID=" + titleID + ", titleName=" + titleName + '}';
    }

    public Title() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.titleID);
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
        final Title other = (Title) obj;
        if (!Objects.equals(this.titleID, other.titleID)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
