/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.payrollSystem.business.custom.EmployeeBo;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.EmployeeDAO;
import lk.ijse.payrollSystem.dao.custom.LevelDAO;
import lk.ijse.payrollSystem.dao.custom.impl.EmployeeDAOImpl;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.entity.Employee;
import lk.ijse.payrollSystem.entity.Level;


/**
 *
 * @author acer
 */
public class EmployeeBoImpl implements EmployeeBo{
    private EmployeeDAOImpl employee;

    public EmployeeBoImpl() {
       this.employee=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    }
    

    @Override
    public boolean saveEmployee(EmployeeDTO employeeDTO) throws Exception {
      System.out.println(employeeDTO.geteId());
        Employee employee1 = new Employee(employeeDTO.geteId(),employeeDTO.getName(),employeeDTO.getNic(),employeeDTO.getGender(),employeeDTO.getDob(),employeeDTO.getAddress(),employeeDTO.getLeId(),employeeDTO.getTelNo(),employeeDTO.getDateOfJoining(),employeeDTO.geteMail() );
        return employee.save(employee1);
    }

    @Override
    public boolean deleteEmployee(String eId) throws Exception {
       return employee.delete(eId);  
    }

    @Override
    public boolean updateEmployee(EmployeeDTO employeeDTO) throws Exception {
        Employee employee1 = new Employee(employeeDTO.geteId(),employeeDTO.getName(),employeeDTO.getNic(),employeeDTO.getGender(),employeeDTO.getDob(),employeeDTO.getAddress(),employeeDTO.getLeId(),employeeDTO.getTelNo(),employeeDTO.getDateOfJoining(),employeeDTO.geteMail() );
        return employee.update(employee1); 
        
    }

    @Override
    public EmployeeDTO searchEmployee(String eId) throws Exception {
         
        EmployeeDAO aO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
        Employee employee = aO.search(eId);
        
        return new EmployeeDTO(employee.geteId(),employee.getName(),employee.getNic(),employee.getGender(),employee.getDob(),employee.getAddress(),employee.getLeId(),employee.getTelNo(),employee.getDateOfJoining(),employee.geteMail() );
        
    }

    @Override
    public String getSelectedeId(String selectedeId) throws Exception {
        return employee.getSelectedeId(selectedeId);
    }
    
    @Override
    public ArrayList<String> getEmployees() throws Exception {
        return employee.getEmployees();
    }

    @Override
    public ArrayList<EmployeeDTO> getAllEmployees() throws Exception {
        ArrayList<Employee> allEmployees = employee.getAll();
        ArrayList<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : allEmployees) {
            employeeDTOs.add(new EmployeeDTO(employee.geteId(),
            employee.getName(),
            employee.getAddress(),
            employee.getGender(),
            employee.getDob(),
            employee.getTelNo(),
            employee.getDateOfJoining(),
            employee.getNic(),
            employee.geteMail(),
            employee.getLeId()));
        }
        return employeeDTOs;
        }

    @Override
    public EmployeeDTO searchEmployees(String eId) throws Exception {
       
        Employee employee1 = employee.searchemps(eId);
        if(employee1!=null){
        return new EmployeeDTO(employee1.geteId(),employee1.getName(),employee1.getNic(),employee1.getGender(),employee1.getDob(),employee1.getAddress(),employee1.getLeId(),employee1.getTelNo(),employee1.getDateOfJoining(),employee1.geteMail());
        
        }else
            return null;
        
    }
}

   
   
    

   
    

  
   
    


    

