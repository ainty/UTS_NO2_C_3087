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
public class Employee_3087 {
    
    protected String nama_3087, nip_3087;
    protected double gaji_3087;

    public Employee_3087() {
    }

    public Employee_3087(String nama_3087, String nip_3087, int gaji_3087) {
        this.nama_3087 = nama_3087;
        this.nip_3087 = nip_3087;
        this.gaji_3087 = gaji_3087;
    }
    
    public void cetakEmployee_3087(){
        System.out.println("");
        System.out.println("Nama Karyawan   : " + nama_3087);
        System.out.println("NIP             : " + nip_3087);
    }
    
}
