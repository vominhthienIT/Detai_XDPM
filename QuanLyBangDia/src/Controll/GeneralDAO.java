/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import Controll.MyEntityManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Nguyen Hoang Hai
 */
public abstract class  GeneralDAO<T> {
 protected EntityManager em;
    

    public GeneralDAO() {
    em=MyEntityManager.getInstance().getEntityManager();
    }
    public boolean save(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(t);
			tr.commit();
			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}
	
    public void delete(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(t);
			tr.commit();
		}catch (Exception e) {
			tr.rollback();
		}
	}
	
    public boolean update(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(t);
			tr.commit();
                        return true;
		}catch (Exception e) {
			tr.rollback();
                        return false;
		}
                
	}
	
	@SuppressWarnings("unchecked")
    public List<T> getAll(Class<T> t) {
		String s = "From " + t.getName();
		Query q = em.createQuery(s);
		return q.getResultList();
	}
    
	
    public T getById(Class<T> t, Object o) {
		return em.find(t, o);
	}
}