/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbooif2.pkg10119074.latihan47.nilaimahasiswa;

/**
 *
 * @author Acer
 */
public class PBOOIF210119074Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa nilaimahasiswa = new NilaiMahasiswa();

        nilaimahasiswa.setNilaiQuiz(75.0);
        nilaimahasiswa.setNilaiUts(45.0);
        nilaimahasiswa.setNilaiUas(34.0);

        double quiz = nilaimahasiswa.getNilaiQuiz();
        double uts = nilaimahasiswa.getNilaiUts();
        double uas = nilaimahasiswa.getNilaiUas();
        double nilaiAkhir = nilaimahasiswa.nilaiAkhir(quiz, uts, uas);
        char index = nilaimahasiswa.index(nilaiAkhir);
        String str = String.valueOf(index);
        String keterangan = nilaimahasiswa.keterangan(str);

        System.out.println("Quiz\t\t\t = " + quiz);
        System.out.println("UTS\t\t\t = " + uts);
        System.out.println("UAS\t\t\t = " + uas);
        System.out.println();
        System.out.println();
        System.out.println("Nilai Akhir\t\t\t = " + nilaiAkhir);
        System.out.println("Keterangan\t\t\t = " + keterangan);
    }
    
}
