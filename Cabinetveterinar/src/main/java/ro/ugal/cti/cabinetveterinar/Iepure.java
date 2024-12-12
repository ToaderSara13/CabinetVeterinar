/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.cabinetveterinar;

/**
 *
 * @author st190
 */
public class Iepure {

    
    Animal animal;
    public String culoareBlana;
    public int varsta;
    
 
    public String toString() {
        return "Iepure{" + "animal=" + animal + ", culoareBlana=" + culoareBlana + ", varsta=" + varsta + '}';
    }
    
        Iepure(){
        
        }
        Iepure(String culoareBlana, int varsta)
    {
        this.culoareBlana = culoareBlana;
        this.varsta = varsta;
    }
    public String getInfo(){
        return "Culoare blana:"+ this.culoareBlana+"Varsta:"+this.varsta;
    }
    public String Ingrijire(){
        return "trebuie periata";
    }
}
