/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_parkir;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramadhan Taufiq
 */
public class TransaksiParkir {
    String waktuKeluar,waktuMasuk;
    Kendaraan kendaraan_parkir;
    Operator op;
     
    public TransaksiParkir(Kendaraan kendaraan_parkir, Operator op,
            String waktuMasuk){
        this.op = op;
        this.kendaraan_parkir = kendaraan_parkir;
        this.waktuMasuk = waktuMasuk;
    }
    
    public void setWaktuKeluar(){
        Calendar sekarang = Calendar.getInstance();
        sekarang.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        waktuKeluar = formatter.format(sekarang.getTime());
    }
    
    /**
     *@param waktuMasuk = waktu dimana kendaraan masuk
     * jadi setLamaParkir itu pake input waktu masuk
     * @throws ParseException
     */
    public long setLamaParkir(String waktuMasuk) throws ParseException{   
            SimpleDateFormat temp = new SimpleDateFormat("HH:mm");
            Date date1 = temp.parse(waktuMasuk);
            Date date2 = temp.parse(waktuKeluar);
            long diff = date2.getTime() - date1.getTime();
            long diffMinutes = diff / (60 * 1000) % 60;          
            long diffHours = diff / (60 * 60 * 1000);
            JOptionPane.showMessageDialog(null, "Lama Parkir : " + diffHours + "jam " + 
                    diffMinutes + "menit");
            /*System.out.println("Lama Parkir : " + diffHours + "jam " + 
                    diffMinutes + "menit");
                    */
            if (diffMinutes > 30){
                diffHours++;
            }
            return diffHours;      
    }
    
    @Override
    public String toString(){
        return "nomor plat " + kendaraan_parkir.no_plat +
                "\nwaktu masuk " + waktuMasuk +
                "\nwaktu keluar " + waktuKeluar +
                "\npetugas " + op.getNama();
    }
    
}
