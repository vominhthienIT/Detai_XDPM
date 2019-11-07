/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import entities.Customer;

/**
 *
 * @author AnCiuuToe
 */
public class CustomerDAO extends GeneralDAO<Customer>{
     public Customer findByID (String id){
      return em.find(Customer.class, id);
    }
     
    
}
