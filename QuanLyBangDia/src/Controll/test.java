/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entities.Customer;
import entities.Title;
import entities.Disks;
import entities.Speciess;
import java.util.ArrayList;
/**
 *
 * @author AnCiuuToe
 */
public class test {
     public static void main(String[] args){
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("CD");
        EntityManager em = fac.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
//            //CustomerDAO cusdao = new CustomerDAO();
//            Customer customer = new Customer("001", "vosiluan", "adada ", "Go Vap");
//            em.persist(customer);
         Title title = new Title("1111", "Thám Tử Conan");
         
         em.persist(title);
         t.commit();
         System.out.println(title);

     }
         
}
