/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dasar;

public class Player {
    
    // atribut
    String name;
    int speed;
    int healthPoin;

    // method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
}