/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.cabinetveterinar;

/**
 *
 * @author st190
 */
public class VaccinPisica implements Vaccin {
    public String vaccineaza(){
        return "Pisica se vaccineaza cu rapel la 3 saptamani";
    }

    @Override
    public String valabilitateVaccin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void validareVaccin() {
        System.out.println("Pisica e vaccinata");
    }
    
}
