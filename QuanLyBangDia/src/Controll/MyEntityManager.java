/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Nguyen Hoang Hai
 */
public class MyEntityManager {
    private static MyEntityManager instance;
    private EntityManager entityManager ;
	

    private MyEntityManager() {
       entityManager=Persistence.createEntityManagerFactory("CD").createEntityManager();
       
        
        
    }

    public synchronized static MyEntityManager getInstance() {
        if(instance==null){
            instance=new MyEntityManager();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

	
        
        
}