
package bangunruang;

public class Kubus extends BangunRuang{
    float sisi;
    
    double volume(){
        float hasil = sisi * sisi * sisi;
        System.out.println("volume = " + hasil);
        return hasil;
    }
    
    double luasPermukaan(){
        float hasil = 6 * sisi;
        System.out.println("luasPermukaan kubus " + "= " + hasil);
        return hasil;
    }
}
