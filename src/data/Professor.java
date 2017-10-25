/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Professor extends Employee {

   private String School; 
   private String Deparment;

    public Professor(String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
    }

   
   @Override
    public float paySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
