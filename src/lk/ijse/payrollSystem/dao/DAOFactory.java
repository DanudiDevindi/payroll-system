/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao;

import lk.ijse.payrollSystem.dao.custom.Impl.UserDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.AttendanceDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.EmployeeDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.LeavesDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.LevelDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.LoanCatagoryDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.LoansDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.SalaryDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.SalaryDetailsDAOImpl;

/**
 *
 * @author acer
 */
public class DAOFactory {
     public enum DAOTypes{
        LEVEL, EMPLOYEE,ATTENDANCE,LOANS,SALARY,LEAVES,SALARYDETAILS,LOANCATAGORY,USER;
    }
    
    private static DAOFactory dAOFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (dAOFactory == null){
            dAOFactory = new DAOFactory();
        }
        return dAOFactory;
    }
    
    public <T> T getDAO(DAOTypes daoType){
        switch(daoType){
            case LEVEL:
                return (T) new LevelDAOImpl();
                 case EMPLOYEE:
                return (T) new EmployeeDAOImpl();
                 case ATTENDANCE:
                return (T) new AttendanceDAOImpl();
                 case LOANS:
                return (T) new LoansDAOImpl();
                  case SALARY:
                return (T) new SalaryDAOImpl();
                 case LEAVES:
                return (T) new LeavesDAOImpl();
                  case SALARYDETAILS:
                return (T) new SalaryDetailsDAOImpl();
                  case LOANCATAGORY:
                return (T) new LoanCatagoryDAOImpl();
                  case USER:
                return (T) new UserDAOImpl();
                
                
                
            
            default: 
                return null;
        }
    }
    
    
}
