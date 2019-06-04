/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.payrollSystem.business.custom.LeavesBo;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.LeavesDAO;
import lk.ijse.payrollSystem.dao.custom.impl.LeavesDAOImpl;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LeavesDTO;
import lk.ijse.payrollSystem.entity.Leaves;
import lk.ijse.payrollSystem.entity.Loans;
import lk.ijse.payrollSystem.view.leaves;

/**
 * 
 * @author acer
 */
public class LeavesBoImpl implements LeavesBo{
  private  LeavesDAOImpl leavesDao;

    public LeavesBoImpl() {
         leavesDao=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LEAVES);
    }
  

    @Override
    public boolean saveLeaves(LeavesDTO leavesDTO) throws Exception {
        System.out.println(leavesDTO.getLevId());
       Leaves leaves1 = new Leaves(leavesDTO.getLevId(),leavesDTO.geteId(),leavesDTO.getEmpname(),leavesDTO.getLevel(),leavesDTO.getType(),leavesDTO.getMonth(),leavesDTO.getTotalLeave(),leavesDTO.getDatesOfLeaves(),leavesDTO.getBalanceLeave());
        return leavesDao.save(leaves1);
    }

    @Override
    public boolean deleteLeaves(String levId) throws Exception {
        return leavesDao.delete(levId);
    }

    @Override
    public LeavesDTO searchLeaves(String levId) throws Exception {
        
        Leaves leaves = leavesDao.search(levId);
        if(leaves!=null){
            return new LeavesDTO(leaves.getLevId(),leaves.geteId(),leaves.getEmpname(),leaves.getLevel(),leaves.getType(),leaves.getMonth(),leaves.getTotalLeaves(),leaves.getDateOfLeaves(),leaves.getBalanceLeaves());
        }else
            return null;
    }

    @Override
    public boolean updateLeaves(LeavesDTO leavesDTO) throws Exception {
        Leaves leaves1 = new Leaves(leavesDTO.getLevId(),leavesDTO.geteId(),leavesDTO.getEmpname(),leavesDTO.getLevel(),leavesDTO.getType(),leavesDTO.getMonth(),leavesDTO.getTotalLeave(),leavesDTO.getDatesOfLeaves(),leavesDTO.getBalanceLeave());
        return leavesDao.updateLeaves (leaves1);
    }

    @Override
    public ArrayList<LeavesDTO> getAllLeaves() throws Exception {
         ArrayList<Leaves> allLeaves = leavesDao.getAll();
        ArrayList<LeavesDTO> leavesDTOs = new ArrayList<>();
        for (Leaves leaves : allLeaves) {
            leavesDTOs.add(new LeavesDTO(leaves.getLevId(),
                    leaves.geteId(),
                    leaves.getEmpname(),
                    leaves.getLevel(),
                    leaves.getType(),
                    leaves.getMonth(),
                    leaves.getTotalLeaves(),
                    leaves.getDateOfLeaves(),
                    leaves.getBalanceLeaves()));
            
        }
        return leavesDTOs;
    }

   
}
