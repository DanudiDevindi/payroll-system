/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.main;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import lk.ijse.payrollSystem.view.LogingForm;

/**
 *
 * @author acer
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Logger superLogger = Logger.getLogger("");
        
        File folder = new File("logs");
        folder.mkdir();
        
        FileHandler fileHandler = new FileHandler("logs/error.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        
        superLogger.addHandler(fileHandler);
        
        LogingForm frmMain=new  LogingForm();
        frmMain.setVisible(true);
    }
        }
    

