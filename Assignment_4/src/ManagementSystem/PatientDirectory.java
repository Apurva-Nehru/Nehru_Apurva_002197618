/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementSystem;

import java.util.ArrayList;

/**
 *
 * @author apurv
 */
public class PatientDirectory {
    ArrayList<Patient> pad = new ArrayList<>();
    
    public PatientDirectory(){
    }
    
    public void addPatient(Patient p){
        pad.add(p);
    }
    
    public ArrayList<Patient> getPatientList(){
        return pad;
    }
    
}
