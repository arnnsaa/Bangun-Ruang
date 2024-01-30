
package bangunruang;

public class Balok extends BangunRuang {
    float p;
    float l;
    float t;
    
    double volume(){
        float volume = p * l * t;
        System.out.println("volume balok:" + volume);
        return volume;   
    }
    
    double luasPermukaan(){
        float luasPermukaan = 2* p * l + 2* p * t + 2 * l * t;
        System.out.println("luasPermukaan balok: " + luasPermukaan);
        return luasPermukaan;
    }
}
