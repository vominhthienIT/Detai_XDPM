/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;
import entities.Speciess;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author MINH THIEN
 */
public class SpeciessDAO extends GeneralDAO<Speciess>{
    public Speciess findSpeciessByID (String id){
      return em.find(Speciess.class, id);
    }
    public Speciess findSpeciessByName(String name){
        List<Speciess> listspec= this.getAll(Speciess.class);
         Speciess spec = new Speciess();
        for (int i =0;i<listspec.size();i++){
            if (listspec.get(i).getSpeciessName().equalsIgnoreCase(name)){
               spec = listspec.get(i);
            }
        }
        return spec;
    }
    
//    public Speciess getSpeciessByName(String name){
//        Query q1 = em.createNativeQuery("Select* from Speciess where speciessName='"+name+"'",Speciess.class);
//        return (Speciess) q1.getSingleResult();
//    }
    
}
