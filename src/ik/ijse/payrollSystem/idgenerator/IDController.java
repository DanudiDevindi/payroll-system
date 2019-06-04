/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.payrollSystem.idgenerator;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.ijse.payrollSystem.db.DBConnection;

/**
 *
 * @author acer
 */
public class IDController {

    public static String getLastID(String tblName, String colName) throws SQLException, ClassNotFoundException, IOException {
        String SQL = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1", colName, tblName, colName);
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
}

