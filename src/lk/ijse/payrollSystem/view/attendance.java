/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.view;

import ik.ijse.payrollSystem.idgenerator.IDGenerator;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.payrollSystem.controller.AttendanceController;
import lk.ijse.payrollSystem.controller.ManageEmployeeController;
import lk.ijse.payrollSystem.db.DBConnection;
import lk.ijse.payrollSystem.dto.AttendanceDTO;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author acer
 */
public class attendance extends javax.swing.JFrame {
    private boolean update=false;
     private AttendanceController controller;


    /**
     * Creates new form attendance
     */
    public attendance() {
        initComponents();
        setDate();
        controller = new AttendanceController();
        getAllEmployees();
        generateAttendanceId();
        aIdtxt.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        EmpIdlbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Yeslbl = new javax.swing.JLabel();
        EmpIdcombobox = new javax.swing.JComboBox<>();
        timeIntxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Attendancetbl = new javax.swing.JTable();
        timeOuttxt = new javax.swing.JTextField();
        Datelbl1 = new javax.swing.JLabel();
        aIdtxt = new javax.swing.JTextField();
        datetxt2 = new javax.swing.JTextField();
        Printlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homebtn = new javax.swing.JLabel();
        Employeetxt = new javax.swing.JLabel();
        loanbtn = new javax.swing.JLabel();
        salarytxt = new javax.swing.JLabel();
        paybtn = new javax.swing.JLabel();
        empbtn = new javax.swing.JLabel();
        leavesReportBtn = new javax.swing.JLabel();
        loanreportBtn = new javax.swing.JLabel();
        paysheetbtn = new javax.swing.JLabel();
        leavesbtn = new javax.swing.JLabel();
        attendancebtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmpIdlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmpIdlbl.setForeground(new java.awt.Color(0, 102, 102));
        EmpIdlbl.setText("Emp Name");
        jPanel2.add(EmpIdlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 111, 26));

        Datelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Datelbl.setForeground(new java.awt.Color(0, 102, 102));
        Datelbl.setText("Date");
        jPanel2.add(Datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 73, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Time in");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 98, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Time Out");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 98, -1));

        Yeslbl.setBackground(new java.awt.Color(0, 102, 102));
        Yeslbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Yeslbl.setForeground(new java.awt.Color(255, 255, 255));
        Yeslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Yeslbl.setText("Yes");
        Yeslbl.setOpaque(true);
        Yeslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YeslblMouseClicked(evt);
            }
        });
        jPanel2.add(Yeslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, 154, 40));

        EmpIdcombobox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmpIdcombobox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(EmpIdcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 242, 35));

        timeIntxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeIntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        timeIntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeIntxtActionPerformed(evt);
            }
        });
        jPanel2.add(timeIntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 242, 26));

        Attendancetbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Attendancetbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Attendancetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance Id", "EmpId", "Time in", "Time out", "date"
            }
        ));
        jScrollPane1.setViewportView(Attendancetbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 844, 269));

        timeOuttxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeOuttxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        timeOuttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeOuttxtActionPerformed(evt);
            }
        });
        jPanel2.add(timeOuttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 242, 26));

        Datelbl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Datelbl1.setForeground(new java.awt.Color(255, 255, 255));
        Datelbl1.setText("Atendance Id");
        jPanel2.add(Datelbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        aIdtxt.setEditable(false);
        aIdtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aIdtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPanel2.add(aIdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 242, 26));

        datetxt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datetxt2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPanel2.add(datetxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 242, 26));

        Printlbl.setBackground(new java.awt.Color(0, 102, 102));
        Printlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Printlbl.setForeground(new java.awt.Color(255, 255, 255));
        Printlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Printlbl.setText("Print");
        Printlbl.setOpaque(true);
        Printlbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PrintlblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Printlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintlblMouseClicked(evt);
            }
        });
        jPanel2.add(Printlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 840, 163, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Attendance");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 288, 53));

        jPanel1.setBackground(new java.awt.Color(9, 9, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homebtn.setBackground(new java.awt.Color(9, 9, 27));
        homebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payrollSystem/asset/home2.png"))); // NOI18N
        homebtn.setText("Home");
        homebtn.setOpaque(true);
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homebtnMouseExited(evt);
            }
        });
        jPanel1.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 286, 53));

        Employeetxt.setBackground(new java.awt.Color(9, 9, 27));
        Employeetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Employeetxt.setForeground(new java.awt.Color(255, 255, 255));
        Employeetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employeetxt.setText("Manage Employee");
        Employeetxt.setOpaque(true);
        Employeetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeetxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmployeetxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmployeetxtMouseExited(evt);
            }
        });
        jPanel1.add(Employeetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 286, 53));

        loanbtn.setBackground(new java.awt.Color(9, 9, 27));
        loanbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loanbtn.setForeground(new java.awt.Color(255, 255, 255));
        loanbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanbtn.setText("Loan");
        loanbtn.setOpaque(true);
        loanbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loanbtnMouseDragged(evt);
            }
        });
        loanbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loanbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loanbtnMouseExited(evt);
            }
        });
        jPanel1.add(loanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 286, 53));

        salarytxt.setBackground(new java.awt.Color(9, 9, 27));
        salarytxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salarytxt.setForeground(new java.awt.Color(255, 255, 255));
        salarytxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salarytxt.setText("Basic Salary");
        salarytxt.setOpaque(true);
        salarytxt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                salarytxtMouseDragged(evt);
            }
        });
        salarytxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salarytxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salarytxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salarytxtMouseExited(evt);
            }
        });
        jPanel1.add(salarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 286, 53));

        paybtn.setBackground(new java.awt.Color(9, 9, 27));
        paybtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paybtn.setForeground(new java.awt.Color(255, 255, 255));
        paybtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paybtn.setText("PaySlip");
        paybtn.setOpaque(true);
        paybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paybtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paybtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paybtnMouseExited(evt);
            }
        });
        jPanel1.add(paybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 286, 53));

        empbtn.setBackground(new java.awt.Color(9, 9, 27));
        empbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        empbtn.setForeground(new java.awt.Color(255, 255, 255));
        empbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empbtn.setText("Employee Report");
        empbtn.setOpaque(true);
        empbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empbtnMouseExited(evt);
            }
        });
        jPanel1.add(empbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 286, 53));

        leavesReportBtn.setBackground(new java.awt.Color(9, 9, 27));
        leavesReportBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        leavesReportBtn.setForeground(new java.awt.Color(255, 255, 255));
        leavesReportBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leavesReportBtn.setText("Leaves Report");
        leavesReportBtn.setOpaque(true);
        leavesReportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leavesReportBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leavesReportBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leavesReportBtnMouseExited(evt);
            }
        });
        jPanel1.add(leavesReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 290, 53));

        loanreportBtn.setBackground(new java.awt.Color(9, 9, 27));
        loanreportBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loanreportBtn.setForeground(new java.awt.Color(255, 255, 255));
        loanreportBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanreportBtn.setText("Loans Report");
        loanreportBtn.setOpaque(true);
        loanreportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanreportBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loanreportBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loanreportBtnMouseExited(evt);
            }
        });
        jPanel1.add(loanreportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 290, 53));

        paysheetbtn.setBackground(new java.awt.Color(9, 9, 27));
        paysheetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paysheetbtn.setForeground(new java.awt.Color(255, 255, 255));
        paysheetbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paysheetbtn.setText("Pay Sheet");
        paysheetbtn.setOpaque(true);
        paysheetbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paysheetbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paysheetbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paysheetbtnMouseExited(evt);
            }
        });
        jPanel1.add(paysheetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 286, 53));

        leavesbtn.setBackground(new java.awt.Color(9, 9, 27));
        leavesbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        leavesbtn.setForeground(new java.awt.Color(255, 255, 255));
        leavesbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leavesbtn.setText("Leaves");
        leavesbtn.setOpaque(true);
        leavesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leavesbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leavesbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leavesbtnMouseExited(evt);
            }
        });
        jPanel1.add(leavesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 286, 53));

        attendancebtn.setBackground(new java.awt.Color(0, 102, 102));
        attendancebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attendancebtn.setForeground(new java.awt.Color(255, 255, 255));
        attendancebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendancebtn.setText("Attendance");
        attendancebtn.setOpaque(true);
        jPanel1.add(attendancebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 290, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YeslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YeslblMouseClicked
     
       String aId= aIdtxt.getText();
       String eId=(String) EmpIdcombobox.getSelectedItem();
        String inTime= timeIntxt.getText();
        String outTime=timeOuttxt.getText();
        String date=datetxt2.getText();
        
        AttendanceDTO attendance=new AttendanceDTO(aId,eId,inTime,outTime,date);
        
        
        if (!update) {
            try {
                boolean result = controller.saveAttendance(attendance);
                if (result) {
                    JOptionPane.showMessageDialog(this, "Employee attendance has been added successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add the employee attendance");
                }
            } catch (Exception ex) {
                Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            
            try {
                if (Attendancetbl.getSelectedRow() == -1) {
                    return;
                }
                
                attendance.setaId((String) Attendancetbl.getValueAt(Attendancetbl.getSelectedRow(), 0));
                boolean result = controller.updateAttendance(attendance);
                
                if (result) {
                    JOptionPane.showMessageDialog(this, "Employee attendance has been updated successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update the Employee attendance");
                }
            } catch (Exception ex) {
                Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        generateAttendanceId();
        
        update = false;
        Attendancetbl.clearSelection();
        clearTextFields();
        loadAllAttendance();
    }//GEN-LAST:event_YeslblMouseClicked

    private void timeIntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeIntxtActionPerformed
       timeOuttxt.requestFocus();
    }//GEN-LAST:event_timeIntxtActionPerformed

    private void timeOuttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeOuttxtActionPerformed
      datetxt2.requestFocus();
    }//GEN-LAST:event_timeOuttxtActionPerformed

    private void PrintlblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PrintlblAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintlblAncestorAdded

    private void PrintlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintlblMouseClicked

        try {
            InputStream is = getClass().getResourceAsStream("/lk/ijse/payrollSystem/reports/attendance.jasper");
            HashMap m = new HashMap();
            JasperPrint fillReport = JasperFillManager.fillReport(is, m, DBConnection.getInstance().getConnection());
            JasperViewer.viewReport(fillReport);
        } catch (Exception ex) {
            Logger.getLogger(employeeReport.class.getName()).log(Level.SEVERE, null, ex);
            //        } catch (SQLException ex) {
            //            Logger.getLogger(employeeReport.class.getName()).log(Level.SEVERE, null, ex);
            //        } catch (IOException ex) {
            //            Logger.getLogger(employeeReport.class.getName()).log(Level.SEVERE, null, ex);
            //        } catch (JRException ex) {
            //            Logger.getLogger(employeeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintlblMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        home h = new home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

    private void homebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseEntered
        homebtn.setFont(new Font("Lucida Bright", 1, 30));
        homebtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_homebtnMouseEntered

    private void homebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseExited
        homebtn.setFont(new Font("Tahoma", 1, 18));
        homebtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_homebtnMouseExited

    private void loanbtnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_loanbtnMouseDragged

    private void loanbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseClicked
        loan l = new loan();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loanbtnMouseClicked

    private void loanbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseEntered
        loanbtn.setFont(new Font("Lucida Bright", 1, 30));
        loanbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanbtnMouseEntered

    private void loanbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseExited
        loanbtn.setFont(new Font("Tahoma", 1, 18));
        loanbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanbtnMouseExited

    private void salarytxtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salarytxtMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_salarytxtMouseDragged

    private void salarytxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salarytxtMouseClicked
        basicSalary b = new basicSalary();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salarytxtMouseClicked

    private void salarytxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salarytxtMouseEntered
        salarytxt.setFont(new Font("Lucida Bright", 1, 30));
        salarytxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_salarytxtMouseEntered

    private void salarytxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salarytxtMouseExited
        salarytxt.setFont(new Font("Tahoma", 1, 18));
        salarytxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_salarytxtMouseExited

    private void paybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybtnMouseClicked
        paySlip l = new paySlip();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paybtnMouseClicked

    private void paybtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybtnMouseEntered
        paybtn.setFont(new Font("Lucida Bright", 1, 30));
        paybtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paybtnMouseEntered

    private void paybtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybtnMouseExited
        paybtn.setFont(new Font("Tahoma", 1, 18));
        paybtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paybtnMouseExited

    private void empbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empbtnMouseClicked
        employeeReport e=new employeeReport();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empbtnMouseClicked

    private void empbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empbtnMouseEntered
        empbtn.setFont(new Font("Lucida Bright", 1, 30));
        empbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_empbtnMouseEntered

    private void empbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empbtnMouseExited
        empbtn.setFont(new Font("Thahoma",1,18));
        empbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_empbtnMouseExited

    private void leavesReportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesReportBtnMouseClicked
        leavesReport l=new leavesReport();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_leavesReportBtnMouseClicked

    private void leavesReportBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesReportBtnMouseEntered
        leavesReportBtn.setFont(new Font("Lucida Bright", 1, 30));
        leavesReportBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_leavesReportBtnMouseEntered

    private void leavesReportBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesReportBtnMouseExited
        leavesReportBtn.setFont(new Font("Tahoma", 1, 18));
        leavesReportBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_leavesReportBtnMouseExited

    private void loanreportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanreportBtnMouseClicked
        loanReport l = new loanReport();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loanreportBtnMouseClicked

    private void loanreportBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanreportBtnMouseEntered
        loanreportBtn.setFont(new Font("Lucida Bright", 1, 30));
        loanreportBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanreportBtnMouseEntered

    private void loanreportBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanreportBtnMouseExited
        loanreportBtn.setFont(new Font("Tahoma", 1, 18));
        loanreportBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanreportBtnMouseExited

    private void paysheetbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paysheetbtnMouseClicked
        paySheet p = new paySheet();
        p.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_paysheetbtnMouseClicked

    private void paysheetbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paysheetbtnMouseEntered
        paysheetbtn.setFont(new Font("Lucida Bright", 1, 30));
        paysheetbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paysheetbtnMouseEntered

    private void paysheetbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paysheetbtnMouseExited
        paysheetbtn.setFont(new Font("Tahoma", 1, 18));
        paysheetbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paysheetbtnMouseExited

    private void leavesbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesbtnMouseClicked
        leaves l = new leaves();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_leavesbtnMouseClicked

    private void leavesbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesbtnMouseEntered
        leavesbtn.setFont(new Font("Lucida Bright", 1, 30));
        leavesbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_leavesbtnMouseEntered

    private void leavesbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesbtnMouseExited
        leavesbtn.setFont(new Font("Tahoma", 1, 18));
        leavesbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_leavesbtnMouseExited

    private void EmployeetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeetxtMouseClicked
        ManageEmployee m = new ManageEmployee();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeetxtMouseClicked

    private void EmployeetxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeetxtMouseEntered
        Employeetxt.setFont(new Font("Lucida Bright", 1, 30));
        Employeetxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_EmployeetxtMouseEntered

    private void EmployeetxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeetxtMouseExited
        Employeetxt.setFont(new Font("Tahoma", 1, 18));
        Employeetxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_EmployeetxtMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Attendancetbl;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JLabel Datelbl1;
    private javax.swing.JComboBox<String> EmpIdcombobox;
    private javax.swing.JLabel EmpIdlbl;
    private javax.swing.JLabel Employeetxt;
    private javax.swing.JLabel Printlbl;
    private javax.swing.JLabel Yeslbl;
    private javax.swing.JTextField aIdtxt;
    private javax.swing.JLabel attendancebtn;
    private javax.swing.JTextField datetxt2;
    private javax.swing.JLabel empbtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leavesReportBtn;
    private javax.swing.JLabel leavesbtn;
    private javax.swing.JLabel loanbtn;
    private javax.swing.JLabel loanreportBtn;
    private javax.swing.JLabel paybtn;
    private javax.swing.JLabel paysheetbtn;
    private javax.swing.JLabel salarytxt;
    private javax.swing.JTextField timeIntxt;
    private javax.swing.JTextField timeOuttxt;
    // End of variables declaration//GEN-END:variables

    private void setDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        datetxt2.setText(sdf.format(date));
    }

    private void getAllEmployees() {
         
        try {
            ArrayList<String> allEmployees = controller.getEmployees();
            for (String employee : allEmployees) {
                EmpIdcombobox.addItem(employee);
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearTextFields() {
        aIdtxt.setText("");
        timeIntxt.setText("");
        timeOuttxt.setText("");
        datetxt2.setText("");
    }

    

    private void loadAllAttendance() {
         try {
            
            ArrayList<AttendanceDTO> allAttendance = controller.getAllAttendance();
            
            DefaultTableModel dtm = (DefaultTableModel) Attendancetbl.getModel();
            dtm.setRowCount(0);
            
            for (AttendanceDTO attendance : allAttendance) {
                Object[] rowData = {
                    attendance.getaId(),
                    attendance.geteId(),
                    attendance.getInTime(),
                    attendance.getOutTime(),
                    attendance.getDate()
                };
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void generateAttendanceId() {
          try {
             aIdtxt.setText(IDGenerator.getNewID("Attendance","aId","A"));
         } catch (SQLException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }
    }

    

