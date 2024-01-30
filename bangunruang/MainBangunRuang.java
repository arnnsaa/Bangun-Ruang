
package bangunruang;

import java.util.Scanner;

public class MainBangunRuang {

    public static void main(String[] args) {
             
             Scanner scanner = new Scanner (System.in);
             
             BangunRuang bangunRuang = new BangunRuang();
             
             Bola bola = new Bola();
             System.out.println("Masukkan jari-jari bola: ");
             bola.r = scanner.nextFloat();
             
             Kubus kubus = new Kubus();
             System.out.println("Masukkan panjang rusuk");
             kubus.sisi = scanner.nextFloat();
        
             Balok balok = new Balok();
             System.out.println("Masukkan panjang balok");
             balok.p = scanner.nextFloat();
             System.out.println("Masukkan lebar balok");
             balok.l = scanner.nextFloat();
             System.out.println("Masukkan tinggi balok");
             balok.t = scanner.nextFloat();
             
             LimasSegitiga limassegitiga = new LimasSegitiga();
             System.out.println("Masukkan alas limasSegitiga (a): ");
             limassegitiga.a = scanner.nextFloat();
             System.out.println("Masukkan tinggi Alas Segitiga limasSegita (tS): ");
             limassegitiga.tS = scanner.nextFloat();
             System.out.println("Masukkan tinggi Sisi Tegak limasSegitiga (tL): ");
             limassegitiga.tL = scanner.nextFloat();
             
             System.out.println("=================================");
        bangunRuang.luasPermukaan();
        bola.luasPermukaan();
        kubus.luasPermukaan();
        balok.luasPermukaan();
        limassegitiga.luasPermukaan();
        
        System.out.println("=================================");
        
        bangunRuang.volume();
        bola.volume();
        kubus.volume();
        balok.volume();
        limassegitiga.volume();
        
        System.out.println("=================================");

           
}
}

