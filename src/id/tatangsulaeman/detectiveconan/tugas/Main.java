/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.detectiveconan.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Detective Conan
 * 
 */
public class Main {
    public static void main(String[]args){
        String outputText =
                
                "Pilih Tokoh Di bawah :" + "\n" +
                "1. Shinichi Kudo/Conan Edogawa" + "\n" +
                "2. Ran Mouri"+ "\n" +
                "3. Kogoro Mouri";
        System.out.println(outputText);
        PerkenalanMember member = new PerkenalanMember();
        
        System.out.println("Nama \t\t: " +member.nama);
        System.out.println("Peran \t\t: " +member.peran);
        System.out.println("Peran \t\t: " +member.biodata);
        
    }
    
}

