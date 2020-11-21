/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.detectiveconan.tugas;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Detective Conan
 * 
 */
public class PerkenalanMember extends Tokoh {
    
     public int pilihTokoh(){
        System.out.print("Ketikan no Tokoh : ");
        Scanner inKey = new Scanner(System.in);
        return inKey.nextInt();
    }
     
    public PerkenalanMember () {
        int pilih = pilihTokoh();
        switch (pilih) {
            case 1 -> {
                this.nama = "Shinichi Kudo/Conan Edogawa";
                this.peran = "Tokoh Utama";
                this.biodata = "Shinichi Kudo (工藤 新一 Kudō Shinichi) adalah tokoh protagonis utama dari serial Detektif Conan. Ia kemudian bernama samaran Conan Edogawa (江戸川 コナン Edogawa Conan). Conan Edogawa berasal dari nama Arthur Conan Doyle dan Edogawa Rampo.[4] Shinichi Kudo adalah seorang detektif SMA terkenal yang sering membantu polisi menyelesaikan kasus sulit. Suatu hari ia diam-diam menginvestigasi dua orang mencurigakan, yang kemudian diketahui sebagai Gin dan Vodka, anggota Organisasi Hitam. Namun aksinya tepergok oleh Gin, sehingga ia dipukul dan dipaksa meminum racun[5]. Alih-alih membunuhnya, racun tersebut malah membuat badannya menyusut menjadi seorang anak kecil. Untuk mengantisipasi kalau Gin dan Vodka menyelidiki keberadaannya, Shinichi menggunakan nama samaran Conan Edogawa sebagai identitas barunya. Ia kemudian tinggal bersama teman masa kecilnya, Ran Mouri dan membantu ayahnya Kogoro - seorang detektif swasta, untuk menyelesaikan kasus, dengan harapan dapat menemukan kasus yang terlibat dengan Organisasi Hitam.\n" +
                               "\n" +
                               "Identitas asli Conan hanya diketahui segelintir orang. Bila sedang menyamar sebagai Conan, ia menunjukkan karakter yang polos dan imut, layaknya anak kelas 1 SD. Ucapan khasnya adalah \"Ah-re-re?!\" (Lhoo?), sebuah ungkapan ala anak SD saat melihat suatu kejanggalan. Sebaliknya, saat sedang menyelidiki kasus sebagai detektif SMA, ia terlihat serius dan memiliki intuisi tinggi layaknya orang dewasa.[4]\n" +
                               "\n" +
                               "Dalam komik versi bahasa Inggrisnya - Case Closed nama Shinichi Kudo adalah Jimmy Kudo. Dalam animasi versi bahasa Jepangnya, suara Shinichi diperankan oleh Kappei Yamaguchi, sementara suara Conan diperankan oleh Minami Takayama. Dalam drama spesial live-action, Shinichi Kudo diperankan oleh Shun Oguri, dan selanjutnya oleh Mizobata Junpei.";
            }
            case 2 -> {
                this.nama = "Ran Mouri";
                this.peran = "Teman Shinichi Kudo";
                this.biodata = "Ran Mouri (毛利 蘭 Mōri Ran) adalah teman masa kecil dan cinta pertama Shinichi Kudo. Sepanjang cerita, Ran selalu menyimpan perasaan cintanya terhadap Shinichi dan setia menunggu kepulangannya. Ran tinggal bersama ayahnya, Kogoro Mouri, yang merupakan seorang detektif swasta. Meski masih masih duduk di bangku SMA, Ran handal dalam urusan rumah tangga, serta jago mengurusi ayahnya yang tinggal terpisah dari ibunya.\n" +
                               "\n" +
                               "Salah satu teman dekat Ran adalah Sonoko Suzuki, yang sering menjadi penasihat dalam urusan percintaannya. Ran ahli dalam karate, namun takut terhadap hantu. Ia adalah ketua klub karate dan mempunyai perawakan yang atraktif[6]. Meski kuat, Ran juga digambarkan sebagai karakter yang mudah menangis. Ran beberapa kali hampir membongkar identitas asli Conan Edogawa[6]. Dalam versi bahasa Inggrisnya, Ran bernama Rachel Moore. Dalam animasi versi bahasa Jepangnya, suara Ran diperankan oleh Wakana Yamazaki. Dalam drama spesial live-action, Ran Mouri diperankan oleh Tomoka Kurokawa, tetapi digantikan oleh Kutsuna Shiori.";
            }
            case 3 -> {
                this.nama = "Kogoro Mouri";
                this.peran = "Detektif Swasta";
                this.biodata = "Kogoro Mouri (毛利 小五郎 Mōri Kogorō) adalah seorang detektif swasta dan ayah dari Ran Mouri. Ia terkenal dengan sebutan Kogoro Tidur, karena kebiasaannya yang selalu tertidur saat memecahkan kasus. Di balik itu, sebenarnya Conanlah yang memecahkan kasus dengan cara menidurkan Kogoro menggunakan peluru bius, kemudian menggunakan alat pengubah suara untuk meniru suara Kogoro.[7]\n" +
                               "\n" +
                               "Kogoro ahli dalam judo[6] dan merupakan pengagum wanita cantik. Ia penggemar berat idol Yoko Okino. Kogoro tinggal terpisah dari istrinya dan hidup berdua dengan anak perempuannya, Ran Mouri. Hobinya adalah bermain mahjong dan taruhan pacuan kuda. Dalam komik versi bahasa Inggrisnya, Kogoro Mouri bernama Richard Moore. Suara Kogoro dalam animasi berbahasa Jepangnya diperankan oleh Akira Kamiya (episode 1 - 548) dan Rikiya Koyama (Ep. 553 - sekarang). Dalam drama spesial live-action, Kogoro diperankan oleh Jinnai Takanori.";
            }
            default -> {
            }
        }
    }
}
