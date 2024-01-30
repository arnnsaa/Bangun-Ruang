
package bangunruang;


public class LimasSegitiga extends BangunRuang {
    float a;
    float tS;
    float tL;
    
    @Override
    double volume(){
        float volume = 1/3 * (1/2 * a * tS) * tL;
        System.out.println("volume LimasSegitiga: " + volume );
        return volume;
        
}
    @Override
    double luasPermukaan(){
        float luasPermukaan = (1/2 * a * tS ) * tL * 1/3;
        System.out.println("luasPermukaan LimasSegitiga: " + luasPermukaan);
        return luasPermukaan;
    }
}
