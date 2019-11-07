/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;
import entities.Disks;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MINH THIEN
 */
public class DisksDAO extends GeneralDAO<Disks>{
    public Disks findDiskByID (String id){
      return em.find(Disks.class, id);
    }
    public Disks findDiskByName (String name){
        List<Disks> listdisk = this.getAll(Disks.class);
         Disks disk = new Disks();
        for (int i =0;i<listdisk.size();i++){
            if (listdisk.get(i).getDiskName().equalsIgnoreCase(name)){
               disk = listdisk.get(i);
            }
        }
        return disk;
    }
    public List<Disks> findDiskByIdTitle (String id){
        List<Disks> listdisk = this.getAll(Disks.class);
        List<Disks> listDiskTitle = new ArrayList<>();
        for (int i =0;i<listdisk.size();i++){
            if (listdisk.get(i).getTitle().getTitleID().equalsIgnoreCase(id)){
              listDiskTitle.add(listdisk.get(i));
            }
        }
        return listDiskTitle;
    }
}
