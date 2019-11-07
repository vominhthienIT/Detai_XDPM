/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author MINH THIEN
 */
public class Main {
    public static void main(String[] args) {
        Flashcreen fl = new Flashcreen();
        Home home = new Home();
        fl.setVisible(true);
        try {
            for (int i = 0 ; i <=100;i++){
                Thread.sleep(30);
                fl.lb_percent.setText(Integer.toString(i)+'%');
                fl.progress_load.setValue(i);
                if (i == 100){
                    fl.setVisible(false);
                    home.setVisible(true);
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
