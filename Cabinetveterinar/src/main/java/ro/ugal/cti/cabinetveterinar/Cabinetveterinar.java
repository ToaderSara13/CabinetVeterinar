/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.cti.cabinetveterinar;

/**
 *
 * @author st190
 */



public class Cabinetveterinar {

    /*public static void main(String[] args) {
        
        
        Proprietar proprietar = new Proprietar ("Mihai Adrian", "Str. Stiintei, frig, etaj", "0739744864");
        //Animal animal = new Animal("Bobita" , "Rasa comuna", 2, proprietar);
        Animal animal = new Animal ("bla","fug",2 , proprietar);
        System.out.println(animal.toString());
    Iepure iepure = new Iepure("Cerasela",2);
    System.out.println(iepure.toString());
    }*/
    public static void main (String[] args){
        
    System.out.println(VaccinCatel.obtineListaVaccinuri());
    System.out.println(VaccinCatel.vaccinTest);
    VaccinCatel caine = new VaccinCatel();
    VaccinPisica pisica = new VaccinPisica();
    caine.validareVaccin();
    pisica.validareVaccin();
    }
}