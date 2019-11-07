/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;
import entities.Title;
import java.util.List;
/**
 *
 * @author MINH THIEN
 */
public class TitleDAO extends GeneralDAO<Title>{
    public Title findTitleByID (String id){
      return em.find(Title.class, id);
    }
    public Title findTitleByName(String name){
        List<Title> listtitle= this.getAll(Title.class);
         Title title = new Title();
        for (int i =0;i<listtitle.size();i++){
            if (listtitle.get(i).getTitleName().equalsIgnoreCase(name)){
               title =listtitle.get(i);
            }
        }
        return title;
    }
}
