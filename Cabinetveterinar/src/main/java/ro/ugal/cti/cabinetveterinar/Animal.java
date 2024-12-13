/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.cabinetveterinar;

/**
 *
 * @author st190
 */

public class Animal {
    
    public String nume;
    public int varsta;
    public Proprietar proprietar;
    public String locNastere;
    protected String staturaAnimal;
    
    public final static int nrMaxPacienti = 10;
    
    public Animal (){
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }

    public String getLocNastere() {
        return locNastere;
    }

    public void setLocNastere(String locNastere) {
        this.locNastere = locNastere;
    }

    public String getStaturaAnimal() {
        return staturaAnimal;
    }

    public void setStaturaAnimal(String staturaAnimal) {
        this.staturaAnimal = staturaAnimal;
    }

    

    @Override
    public String toString() {
        return  nume + "," + varsta + ","+ locNastere +","+ proprietar.toString();
    }
    //public abstract String sunet();
    public String animalulMananca(String specie){
        return "Animalul din specia "+specie+" mananca";
    }  
        
     public Animal(String nume, int varsta, String locNastere, Proprietar proprietar){
        this.nume=nume;
        this.locNastere=locNastere;
        this.varsta=varsta;
        this.proprietar=proprietar;
        }
 
    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    
    public double calcGreutate() {
        return (varsta <= 1) ? 2.0 : (varsta <= 3) ? 5.0 : 8.0;
    }

  
}
