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
public class Administrative extends Employee {
    private String category; 
    private float Salary; 

    public Administrative(String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
    }

    @Override
    public float paySalary() {
        this.Salary= 500;
        return Salary; 
    }
    
}
