/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game2;

public class Play {
    public static void main(String[] args) {
        Drone drone = new Drone();
            
            drone.energi = 45;
            drone.ketinggian = 100;
            drone.kecepatan = 85;
            drone.merek = "sony";
            
            //call the methods on the drone object
            drone.terbang();
            drone.maju();
            drone.turun();
            drone.matikanMesin();
        }
    }  

