/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dataperpustakaan;



/**
 *
 * @author VivoBook
 */
import java.util.Scanner;

public class Dataperpustakaan {
 public static void main(String[] args) {
Scanner a = new Scanner(System. in );
int nim, jenis, harga_sewa;
int total_harga=0;
String namaARDW;
System.out.println ("===========================================================");
System.out.println ("INPUT DATA PEMINJAMAN");
System.out.println ("===========================================================");
System.out.print   ("Masukkan NAMA       = ");
namaARDW = a.nextLine();
System.out.print   ("Masukkan NIM        = ");
nim = a.nextInt();
System.out.print   ("Masukan Jumlah Buku = ");
jenis = a.nextInt();
System.out.println ("==========================================================");

int jenis_arr[] = new int[jenis];
String judul_arr[] = new String[jenis];
for (int b = 0; b < jenis; b++) {
System.out.print("Masukan Judul Buku : ");
judul_arr[b] = a.next();
System.out.print("Jenis Buku : 1. Komputer | 2. Non Komputer \nMasukan pilihan buku : ");
jenis_arr[b] = a.nextInt();
if(jenis_arr[b]==1){
harga_sewa = 10000;

total_harga = total_harga+harga_sewa;
}else if(jenis_arr[b]==2){
harga_sewa = 15000;

total_harga = total_harga+harga_sewa;
}
}
System.out.println("");
System.out.println ("==========================================================");
System.out.println ("DATA PEMINJAM");
System.out.println ("==========================================================");
System.out.println ("Nama Mahasiswa               = "+namaARDW);
System.out.println ("Nim Mahasiswa                = "+nim);
System.out.println ("Total Biaya Pinjam           = "+total_harga);
System.out.println ("==========================================================");
System.out.println ("DAFTAR BUKU YANG DIPINJAM");
System.out.println ("==========================================================");
for (int b = 0;b<jenis;b++){
System.out.println ("Judul Buku Ke : " + b +": " + judul_arr [b]);
}
    }
}
