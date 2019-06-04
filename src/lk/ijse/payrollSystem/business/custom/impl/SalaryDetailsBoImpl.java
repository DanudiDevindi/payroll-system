/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import lk.ijse.payrollSystem.business.custom.SalaryDetailsBo;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.SalaryDetailsDAO;
import lk.ijse.payrollSystem.dao.custom.impl.SalaryDetailsDAOImpl;
import lk.ijse.payrollSystem.dto.SalaryDetailsDTO;
import lk.ijse.payrollSystem.entity.Salary;
import lk.ijse.payrollSystem.entity.SalaryDetails;

/**
 *
 * @author acer
 */
public class SalaryDetailsBoImpl implements SalaryDetailsBo{
     private  SalaryDetailsDAO salaryDetails;

    public SalaryDetailsBoImpl() {
        salaryDetails=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SALARYDETAILS);
    }

    @Override
    public boolean saveSalaryDetails(SalaryDetailsDTO salaryDetailsDTO) throws Exception {
         SalaryDetails salaryDetails1=new SalaryDetails(salaryDetailsDTO.getSdId(),salaryDetailsDTO.getEmpId(),salaryDetailsDTO.getEmpname(),salaryDetailsDTO.getLevel(),salaryDetailsDTO.getBasicSalaryAmount(),salaryDetailsDTO.getSalId(),salaryDetailsDTO.getDate(),salaryDetailsDTO.getNoPay(),salaryDetailsDTO.getLoan(),salaryDetailsDTO.getDamages(),salaryDetailsDTO.getEpf(),salaryDetailsDTO.getGrossDeduction(),salaryDetailsDTO.getNetSalary());     
        return salaryDetails.save(salaryDetails1);
    }

    @Override
    public boolean deleteSalaryDetails(String sdId) throws Exception {
        return salaryDetails.delete(sdId);
    }

    @Override
    public SalaryDetailsDTO searchSalaryDetails(String sdId) throws Exception {
  
       SalaryDetails sd = salaryDetails.search(sdId);
        System.out.println(sd.getDate()+sd.getEmpId());
        if(sd!=null){
       return new SalaryDetailsDTO(sd.getSdId(),sd.getEmpId(),sd.getEmpname(),sd.getLevel(),sd.getBasicSalaryAmount(),sd.getSalId(),sd.getDate(),sd.getNoPay(),sd.getLoan(),sd.getDamages(),sd.getEpf(),sd.getGrossDeduction(),sd.getNetSalary());
    }else
        return null;
    }


    @Override
    public boolean updateSalaryDetails(SalaryDetailsDTO salaryDetailsDTO) throws Exception {
          SalaryDetails salaryDetails1=new SalaryDetails(salaryDetailsDTO.getSdId(),salaryDetailsDTO.getEmpId(),salaryDetailsDTO.getEmpname(),salaryDetailsDTO.getLevel(),salaryDetailsDTO.getBasicSalaryAmount(),salaryDetailsDTO.getSalId(),salaryDetailsDTO.getDate(),salaryDetailsDTO.getNoPay(),salaryDetailsDTO.getLoan(),salaryDetailsDTO.getDamages(),salaryDetailsDTO.getEpf(),salaryDetailsDTO.getGrossDeduction(),salaryDetailsDTO.getNetSalary());     
        return salaryDetails.update(salaryDetails1);
        
       
    }

    
     
    
}
