/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LeavesDTO;

/**
 *
 * @author acer
 */
public interface LeavesBo {

    public boolean saveLeaves(LeavesDTO leaves)throws Exception;

    public boolean deleteLeaves(String levId)throws Exception;

    public LeavesDTO searchLeaves(String levId)throws Exception;

    public boolean updateLeaves(LeavesDTO leavesDTO)throws Exception;

    public ArrayList<LeavesDTO> getAllLeaves()throws Exception;

   
    
}
