/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author AnCiuuToe
 */
@Entity
@IdClass(RentInvoice_Detail_PK.class)
public class RentInvoice_Detail implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn (name="rentID" , referencedColumnName = "rentID")
    private RentInvoice rentInvoice;
    @Id
    @ManyToOne
    @JoinColumn (name="diskID" , referencedColumnName = "diskID")
    private Disks disk;
    @OneToOne
    @JoinColumn(name="lateChargeID")
    private LateCharge lateCharge;

    public RentInvoice_Detail(RentInvoice rentInvoice, Disks disk, LateCharge lateCharge) {
        this.rentInvoice = rentInvoice;
        this.disk = disk;
        this.lateCharge = lateCharge;
    }

    public RentInvoice getRentInvoice() {
        return rentInvoice;
    }

    public void setRentInvoice(RentInvoice rentInvoice) {
        this.rentInvoice = rentInvoice;
    }

    public Disks getDisk() {
        return disk;
    }

    public void setDisk(Disks disk) {
        this.disk = disk;
    }

    public LateCharge getLateCharge() {
        return lateCharge;
    }

    public void setLateCharge(LateCharge lateCharge) {
        this.lateCharge = lateCharge;
    }
    
    
    
}
