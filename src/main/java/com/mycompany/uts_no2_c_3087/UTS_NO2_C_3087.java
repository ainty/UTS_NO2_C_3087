/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3087;

/**
 *
 * @author Tyaa
 * Nur Ainie Adistya Putri (21103087)
 * S1SI-05-C
 */
public class UTS_NO2_C_3087 {

    public static void main(String[] args) {
        
        SalariedEmployee_3087 sal = new SalariedEmployee_3087("Yanti", "2342373", 500000);
        CommissionEmployee_3087 com = new CommissionEmployee_3087(700000, 100000, 5, "Supri", "874248", 0);
        ProjectPlanner_3087 pro = new ProjectPlanner_3087(1000000, 500000, 8, "Andi", "947385", 0);
        
        sal.cetakSalaried_3087();
        com.hitungGaji_3087();
        com.cetakCommission_3087();
        pro.hitungGajiP_3087();
        pro.cetakProjectPlanner_3087();
    }
}
