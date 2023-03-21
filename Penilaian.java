/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

/**
 *
 * @author Lab Informatika
 */
public class Penilaian {
    String nama,jurusan,nim;
    Double tb,eyd,sk,kr;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Double getTb() {
        return tb;
    }

    public void setTb(Double tb) {
        this.tb = tb;
    }

    public Double getEyd() {
        return eyd;
    }

    public void setEyd(Double eyd) {
        this.eyd = eyd;
    }

    public Double getSk() {
        return sk;
    }

    public void setSk(Double sk) {
        this.sk = sk;
    }

    public Double getKr() {
        return kr;
    }

    public void setKr(Double kr) {
        this.kr = kr;
    }
    
    public void hitungKT(){
        double hasilkt = (tb*15/100)+(eyd*35/100)+(sk*25/100)+(kr*25/100);
        if(hasilkt>=85){
            String ket = "LOLOS";
            System.out.println("Keterangan"+ket);
        }else {
            String ket = "TIDAK LOLOS";
            System.out.println("Keterangan"+ket);
        }
    }
    
    public void hitungCP(){
        double hasilkt = (tb*30/100)+(eyd*20/100)+(20*25/100)+(kr*30/100);
        if(hasilkt>=85){
            String ket = "LOLOS";
            System.out.println("Keterangan "+ket);
        }else {
            String ket = "TIDAK LOLOS";
            System.out.println("Keterangan "+ket);
        }
    }
}
