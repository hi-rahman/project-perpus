/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectUas;

/**
 *
 * @author User
 */
public class buku {
    //    inisialisasi variabel
    public String kode, buku, sport, matic, jBayar;
    public double hrg=0,hrg_beb=0,hrg_s=0,hrg_mat=0,biaya=0,diskon=0,total=0;
    
    //    fungsi & method
    public void setSeleksiCode(){
        if(kode.equalsIgnoreCase("BK001")){
            buku="Mencoba bernafas";
        }
        else if(kode.equalsIgnoreCase("BK002")){
            buku="Kisah Asmara Kelvin dan Revand";
        }
        else{
            hrg=0;
        }
    }
    

}
