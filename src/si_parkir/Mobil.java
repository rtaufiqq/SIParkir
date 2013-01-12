/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_parkir;


/**
 *
 * @author Ramadhan Taufiq
 */
public class Mobil extends Kendaraan{
    
    public Mobil(String no_plat){
        super.no_plat = no_plat;
    }
  
    @Override
    public long getBiayaParkir(long lamaParkir){
        if (lamaParkir < 3 ){
            return 5000;
            } else { 
                lamaParkir= lamaParkir-3;
                return lamaParkir*2000 + 5000; 
            }
    }
    
    
    
}
