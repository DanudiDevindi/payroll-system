/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business;

import lk.ijse.payrollSystem.business.custom.impl.AttendanceBoImpl;
import lk.ijse.payrollSystem.business.custom.impl.SalaryBoImpl;
import lk.ijse.payrollSystem.business.custom.impl.EmployeeBoImpl;
import lk.ijse.payrollSystem.business.custom.impl.LeavesBoImpl;
import lk.ijse.payrollSystem.business.custom.impl.LevelBoImpl;
import lk.ijse.payrollSystem.business.custom.impl.LoanCatagoryBoImpl;
import lk.ijse.payrollSystem.business.custom.impl.LoansBoImpl;
import lk.ijse.payrollSystem.business.custom.impl.SalaryDetailsBoImpl;

/**
 *
 * @author acer
 */
public class BoFactory {
    public enum BOTypes{
        LEVEL, EMPLOYEE, ATTENDANCE,LOANS,SALARY,LEAVES,SALARYDETAILS,LOANCATAGORY;
    }
    
    private static BoFactory boFactory;
    
    private BoFactory(){
        
    }
    
    public static BoFactory getInstance(){
        if (boFactory == null){
            boFactory = new BoFactory();
        }
        return boFactory;
    }
    
    public <T> T getBO(BOTypes boType){
          switch(boType){
                case LEVEL:
                return (T) new LevelBoImpl();
                case EMPLOYEE:
                return (T) new EmployeeBoImpl();
                case ATTENDANCE:
                return (T) new AttendanceBoImpl();
                 case LOANS:
                return (T) new LoansBoImpl();
                case SALARY:
                return (T) new SalaryBoImpl();
                 case LEAVES:
                return (T) new LeavesBoImpl();
                 case SALARYDETAILS:
                return (T) new SalaryDetailsBoImpl();
                  case LOANCATAGORY:
                return (T) new LoanCatagoryBoImpl();
                 
                 
           
            default:
                return null;
        }
    
     }
}
