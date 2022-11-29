/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3087;

/**
 *
 * @author Tyaa
 * Nur Ainie Adistya Putri (21103087)
 * S1SI-05-C
 */
public class SalariedEmployee_3087 extends Employee_3087 {
    private double upahMingguan_3087;

    public SalariedEmployee_3087(String nama_3087, String nip_3087, int gaji_3087) {
        super(nama_3087, nip_3087, gaji_3087);
        this.upahMingguan_3087 = gaji_3087;
    }
    
    public void cetakSalaried_3087(){
        super.cetakEmployee_3087();
        System.out.println("Upah Mingguan   : " + upahMingguan_3087);
    }
}
