package ro.ugal.cti.cabinetveterinar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package ro.ugal.cti.cabinetveterinar;

/**
 *
 * @author st190
 */
public class VaccinCatel implements Vaccin, Analiza {
    
    public static String vaccinTest ="Catalog";
    public static String rezultatePeriodice = "Normale";
    public static String obtineListaVaccinuri() {
        return "Lista vaccinuri recomandate: Catelfree, Cainedog, Canergy, Catalerg";
    }
   @Override
   public void validareVaccin(){
    System.out.println("Vaccinul pentru caine a fost validat");
  }

    @Override
    public String vaccineaza() {
         return "Cainele se vaccineaza";
    }

    @Override
    public String valabilitateVaccin() {
        return "Vaccinul este valabil o luna";
    }

    @Override
    public void efectueazaAnaliza() {
       System.out.println( "Catelul isi face analize");
    }

    @Override
    public String obtinerezultate() {
        return " Cainele obtine rezultatele de la analize.";
    }
   
  }


