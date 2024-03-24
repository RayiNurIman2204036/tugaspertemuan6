/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author Rayin
 */

class PersegiPanjang{
    int panjang;
    int lebar;
    
    PersegiPanjang(){
        panjang = 1;
        lebar = 1;
    }
    
    PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    int getLuas(){
        return (panjang * lebar) ;
        }
    int getKeliling(){
        return (panjang + lebar) * 2 ;
        }
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
        }
    }

public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("Luas persegi panjang dengan panjang "+persegiPanjang1.panjang +" dan lebar " + persegiPanjang1.lebar + " adalah "+ persegiPanjang1.getLuas()+" dan kelilingnya " + persegiPanjang1.getKeliling());
        System.out.printf("Masukan panjang: ");
        Scanner bilangan = new Scanner(System.in);
        int panjang = bilangan.nextInt();
        System.out.printf("Masukan lebar: ");
        int lebar = bilangan.nextInt();
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(panjang , lebar);
        System.out.println("Luas persegi panjang dengan panjang "+persegiPanjang2.panjang +" dan lebar " + persegiPanjang2.lebar + " adalah "+ persegiPanjang2.getLuas()+" dan kelilingnya " + persegiPanjang2.getKeliling());
        bilangan = new Scanner(System.in);
        System.out.printf("Masukan panjang: ");
        panjang = bilangan.nextInt();
        System.out.printf("Masukan lebar: ");
        lebar = bilangan.nextInt();
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(panjang , lebar);
        System.out.println("Luas persegi panjang dengan panjang "+persegiPanjang3.panjang +" dan lebar " + persegiPanjang3.lebar + " adalah "+ persegiPanjang3.getLuas()+" dan kelilingnya " + persegiPanjang3.getKeliling());
    }
}
