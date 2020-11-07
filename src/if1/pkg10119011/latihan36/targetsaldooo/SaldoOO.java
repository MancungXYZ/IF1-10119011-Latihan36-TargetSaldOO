/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan36.targetsaldooo;

/**
 *
 * @author Reihan Wiyanda
 */
public class SaldoOO {
    public int saldoAwal = 3500000;
    public double bunga = 8;
    
    public double hitungBunga () {
        return saldoAwal * bunga / 100;
    }
    
    public void hitungLamaSaldo () {
        int i = 1;
        while (saldoAwal <= 6000000) {
            saldoAwal += hitungBunga();
            System.out.println("Saldo bulan ke-" + i + " adalah\t Rp " + saldoAwal);
            i++;     
        }
    }
}
