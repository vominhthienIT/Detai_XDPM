/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;
import entities.Resevation;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MINH THIEN
 */
public class ReservationDAO extends GeneralDAO<Resevation>{
     public Resevation findReservationByID (String id){
      return em.find(Resevation.class, id);
    }
    public List<Resevation> findReservationByIDTitle (String id){
      List<Resevation> listAll = getAll(Resevation.class);
      List<Resevation> listReserveById = new ArrayList<>();
      for(Resevation reserve:listAll){
          if(reserve.getTitle().getTitleID().equalsIgnoreCase(id)){
              listReserveById.add(reserve);
          }
      }
      return listReserveById;
    }
    public Resevation findReservationByIDCustomer (String id){
      List<Resevation> listReserve = getAll(Resevation.class);
      Resevation reservee = new Resevation();
      for(Resevation reserve : listReserve){
          if(reserve.getCustomer().getCustomerID().equalsIgnoreCase(id)){
              reservee = reserve;
          }
      }
      return reservee;
    }
    
}
