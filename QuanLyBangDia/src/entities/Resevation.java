/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author AnCiuuToe
 */
@Entity
public class Resevation implements  Serializable{
    @Id
    private String reverationID;
    @ManyToOne
    @JoinColumn (name = "customerID",referencedColumnName = "customerID")
    private Customer customer;
    @ManyToOne
    @JoinColumn (name = "titleID",referencedColumnName = "titleID")
    private Title title;
    private LocalDate dayReserve;

    public Resevation(String reverationID, Customer customer, Title title, LocalDate dayReserve) {
        this.reverationID = reverationID;
        this.customer = customer;
        this.title = title;
        this.dayReserve = dayReserve;
    }

    public String getReverationID() {
        return reverationID;
    }

    public void setReverationID(String reverationID) {
        this.reverationID = reverationID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public LocalDate getDayReserve() {
        return dayReserve;
    }

    public void setDayReserve(LocalDate dayReserve) {
        this.dayReserve = dayReserve;
    }

    public Resevation() {
    }

    @Override
    public String toString() {
        return "Resevation{" + "reverationID=" + reverationID + ", customer=" + customer + ", title=" + title + ", dayReserve=" + dayReserve + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.reverationID);
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
        final Resevation other = (Resevation) obj;
        if (!Objects.equals(this.reverationID, other.reverationID)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
