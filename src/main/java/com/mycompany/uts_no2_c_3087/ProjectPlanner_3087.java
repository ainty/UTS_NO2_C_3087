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
public class ProjectPlanner_3087 extends Employee_3087 {
    private double gajiPokok_3087, komisi_3087, totalHasilProyek_3087, pajak_3087;

    public ProjectPlanner_3087(double gajiPokok_3087, double komisi_3087, double totalHasilProyek_3087, String nama_3087, String nip_3087, int gaji_3087) {
        super(nama_3087, nip_3087, gaji_3087);
        this.gajiPokok_3087 = gajiPokok_3087;
        this.komisi_3087 = komisi_3087;
        this.totalHasilProyek_3087 = totalHasilProyek_3087;
    }
    
    public double hitungGajiP_3087(){
        pajak_3087 = gajiPokok_3087 * 0.05;
        gaji_3087 = gajiPokok_3087 + (komisi_3087 * totalHasilProyek_3087) - pajak_3087;
        return gaji_3087;
    }
    
    public void cetakProjectPlanner_3087(){
        super.cetakEmployee_3087();
        System.out.println("Total Gaji Project Planner : " + gaji_3087);
    }
}
