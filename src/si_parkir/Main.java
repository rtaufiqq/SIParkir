/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_parkir;

import java.text.ParseException;

/**
 *
 * @author Ramadhan Taufiq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Mobil Innova = new Mobil("AB8134UH");
        Operator Paijo = new Operator("Paijo", "N89", "pagi");
            
        //TransaksiParkir ABC = new TransaksiParkir
        //        (Innova, Paijo, Innova.getWaktuMasuk());
        //System.out.println(Innova);
        //System.out.println(Paijo);
        
        //ABC.setWaktuKeluar();
        //System.out.println(Innova.getBiayaParkir(ABC.setLamaParkir("02:12")));
        /*
        TransaksiParkir Parkir = new TransaksiParkir(new Mobil("AB2193YU"),new Operator("Tomi",
                "id12", "siang"), Innova.getWaktuMasuk());
        Parkir.setWaktuKeluar();
        System.out.println(Parkir);
        Parkir.kendaraan_parkir.getBiayaParkir(Parkir.setLamaParkir("00:10"));
        */
        
        
        
        new SiParkirUI().setVisible(true);
    }

}