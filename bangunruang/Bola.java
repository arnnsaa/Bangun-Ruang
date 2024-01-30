
package bangunruang;

public class Bola extends BangunRuang {
    
    float r;
    
    double volume(){
        float volume = (float)(Math. PI * r * r * r * 4/3);
        System.out.println("volume Bola: " + volume);
        return volume;
        
    }
    
    double luasPermukaan(){
        float luasPermukaan = (float)(4 * Math.PI * r * r);
        System.out.println("Luas permukaan Bola: " + luasPermukaan);
        return luasPermukaan;
    }
}
