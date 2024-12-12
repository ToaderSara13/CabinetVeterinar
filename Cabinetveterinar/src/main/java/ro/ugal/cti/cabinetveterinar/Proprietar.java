/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ro.ugal.cti.cabinetveterinar;

public class Proprietar {
    
    private String numePrenume;
    public String adresa;
    public String telefon;
   
    @Override
    public String toString() {
        return "Proprietar{" + "numePrenume=" + numePrenume + ", adresa=" + adresa + ", telefon=" + telefon + '}';
    }
public Proprietar(){
    
}

public Proprietar(String nume, String adresa, String telefon){
    this.adresa = adresa;
    this.numePrenume = nume;
    this.telefon = telefon;
}

public void setNumePrenume(String numePrenume){
    this.numePrenume = numePrenume;
}
public void setAdresa(String adresa){
    this.adresa = adresa;
}
public void setTelefon(String telefon){
    this.telefon = telefon;
}

public String getOwnerInfo(){
        return "Informatii proprietar: Nume:"+this.numePrenume+"adresa"+this.adresa+"telefon"+this.telefon;
                }
}
