/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_parkir;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Ramadhan Taufiq
 */
public abstract class Kendaraan {
    String no_plat;
    String waktuMasuk;       
     
    public String getNo_plat(){
       return no_plat;
    }
    
    public String getWaktuMasuk(){
        Calendar sekarang = Calendar.getInstance();
        sekarang.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        return waktuMasuk = formatter.format(sekarang.getTime());
    }
     
    public abstract long getBiayaParkir(long lamaParkir);   
    
}
