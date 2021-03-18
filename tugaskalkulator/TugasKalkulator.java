/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskalkulator;

/**
 *
 * @author Deodatuss
 */
public class TugasKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator myCalc = new Kalkulator();
        
        int jml = myCalc.tambah(1,2);
        int kurang = myCalc.kurang(5,2);
        int kali = myCalc.kali(1,5);
        int bagi = myCalc.bagi(6,3);
        int mod = myCalc.modulus(5,2);
        
        System.out.println("Jumlah            :"+ jml);
        System.out.println("Kurang            :"+ kurang);
        System.out.println("Kali              :"+ kali);
        System.out.println("bagi              :"+ bagi);
        System.out.println("modulus           :"+ mod);
    }
    
}
