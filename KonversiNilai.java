/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class KonversiNilai {
    public static void main(String[] args) {
        String nim, nama, prodi, matakuliah ;
        String grade ="";
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("========Masukan Data=======");
        System.out.println("Masukkan NIM =");
               nim = masukan.nextLine();
               System.out.println("Masukkan Nama =");
               nama = masukan.nextLine();
               System.out.println("Matakuliah");
               matakuliah = masukan.nextLine();
               System.out.println("Masukkan Nilai Angka");
               nilai = masukan.nextInt();
              
//       ========MENGAMBIL PRODI DARI NIM substring
                prodi = nim.substring(3,5);
//                if (prodi.equals("52")){
//                System.out.println("Program Studi = S-1 TI");
//                 } else if (prodi.equals("51")){
//                System.out.println("Program Studi = S-1 SI");
//                } else if(prodi.equals("31")){
//                System.out.println("Program Studi = D-3 SI");
//                } else {
//                System.out.println("Program studi Tidak Tersedia");
//                }
   switch (prodi){
       case "31" :
               System.out.println("Program Studi D-3 SI");
               break ;
       case "52" :
               System.out.println("Program Studi S-1 TI");
               break ;
       case "51" :
               System.out.println("Program Studi S-1 SI");
               break ;
       
       default :
               System.out.println("Prodi Tidak Tersedia");
               break ;

   }    if (nilai >= 85){
                grade = "A";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >= 80){
                grade = "A-";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >= 75){
                grade = "B+";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >=70){
                grade = "B";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >=65){
                grade = "B-";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >=60){
                grade = "C+";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >=55){
                grade = "C";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >=50){
                grade = "C-";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai >=45){
                grade = "D";
                System.out.println("Grade Siswa :" + grade);
        } else if (nilai < 45){
                grade = "E";
                System.out.println("Grade Siswa :" + grade);
        } else {
                System.out.println("Nilai Tidak Diketahui");
        }
        switch (grade){
                case "A":
                System.out.println("Sangat Memuaskan");
                break;
                case "A-":
                System.out.println("Sangat Memuaskan");
                break;
                case "B+":
                System.out.println("Memuaskan");
                break;
                case "B":
                System.out.println("Memuaskan");
                break;
                case "B-":
                System.out.println("Memuaskan");
                break;
                case "C+":
                System.out.println("Cukup");
                break;
                case "C":
                System.out.println("Cukup");
                break;
                case "C-":
                System.out.println("Cukup");
                break;
                case "D":
                System.out.println("Kurang");
                break;
                case "E":
                System.out.println("Sangat Kurang");
                break;
                default :
                System.out.println("Nilai Tidak Diketahui");
                break;
        }
        
   }           
    }

    

