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
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public void setVarsta (int varsta) {
        this.varsta = varsta;
    }
    
    public void setLocNastere(String locNastere){
        this.locNastere = locNastere;
    }
    
    public String toString(){
        return this.nume+ " "+this.varsta+" "+this.locNastere;
    }
    
    //public abstract String sunet();
    public String animalulMananca(String specie){
        return "Animalul din specia "+specie+" mananca";
    }

      /*  public String nume;
        public String specie;
        public int varsta;
        public Proprietar proprietar;
     
    
    public String toString() {
        return "Animal{" + "nume=" + nume + ", specie=" + specie + ", varsta=" + varsta + ", proprietar=" + proprietar + '}';
    }  
        
     public Animal(String nume, String specie, int varsta, Proprietar proprietar){
        this.nume=nume;
        this.specie=specie;
        this.varsta=varsta;
        this.proprietar=proprietar;
        }
 
    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    
    public double calcGreutate() {
        return (varsta <= 1) ? 2.0 : (varsta <= 3) ? 5.0 : 8.0;
    }*/
}
