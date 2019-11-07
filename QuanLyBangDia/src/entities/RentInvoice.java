/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author AnCiuuToe
 */
@Entity
public class RentInvoice implements Serializable{
    @Id
    private String rentID;
    @ManyToOne
    @JoinColumn (name = "customerID",referencedColumnName = "customerID")
    private Customer customer;
    @OneToMany(mappedBy = "rentInvoice")
    private List<RentInvoice_Detail> listDisksRent;
    private LocalDate rentDate;
    private LocalDate returnDate;

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<RentInvoice_Detail> getListDisksRent() {
        return listDisksRent;
    }

    public void setListDisksRent(List<RentInvoice_Detail> listDisksRent) {
        this.listDisksRent = listDisksRent;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public RentInvoice(String rentID, Customer customer, List<RentInvoice_Detail> listDisksRent, LocalDate rentDate, LocalDate returnDate) {
        this.rentID = rentID;
        this.customer = customer;
        this.listDisksRent = listDisksRent;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

  

    public RentInvoice() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.rentID);
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
        final RentInvoice other = (RentInvoice) obj;
        if (!Objects.equals(this.rentID, other.rentID)) {
            return false;
        }
        return true;
    }
    
    
    
}
