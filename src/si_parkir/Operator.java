/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_parkir;

/**
 *
 * @author Ramadhan Taufiq
 */
public class Operator extends Pegawai{
    String shift;
   
    
    public Operator(String id_pegawai, String nama, String shift){
        super.id_pegawai = id_pegawai;
        super.nama = nama;
        this.shift = shift;
        
    }
    
    public String getShift(){
       return shift;
    }
    
    @Override
    public String toString(){
        return "nama " + nama +
                " \n id "  + id_pegawai + 
                " \n shift " + shift;
     }
    
    
}
