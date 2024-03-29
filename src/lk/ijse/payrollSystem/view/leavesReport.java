/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.view;

import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.payrollSystem.controller.LeavesController;
import lk.ijse.payrollSystem.db.DBConnection;
import lk.ijse.payrollSystem.dto.LeavesDTO;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author acer
 */
public class leavesReport extends javax.swing.JFrame {
    private LeavesController ctrl;

    /**
     * Creates new form leavesReport
     */
    public leavesReport() {
        ctrl=new LeavesController();
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        leavesReportTbl = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Viewlbl = new javax.swing.JLabel();
        Printlbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homebtn = new javax.swing.JLabel();
        Employeetxt = new javax.swing.JLabel();
        loanbtn = new javax.swing.JLabel();
        paybtn = new javax.swing.JLabel();
        attendancebtn = new javax.swing.JLabel();
        loanreportBtn = new javax.swing.JLabel();
        paysheetbtn = new javax.swing.JLabel();
        leavesbtn = new javax.swing.JLabel();
        Employeetxt1 = new javax.swing.JLabel();
        salarytxt = new javax.swing.JLabel();
        Employeetxt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Leaves Report");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 22, 358, 53));

        leavesReportTbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leavesReportTbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leavesReportTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Level Id", "Emp Id", "Emp name", "Level", "leave Type", "Month", "Total leaves", "Dates  of leaves", "Balance leaves"
            }
        ));
        jScrollPane1.setViewportView(leavesReportTbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 149, 1090, 325));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Viewlbl.setBackground(new java.awt.Color(0, 102, 102));
        Viewlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Viewlbl.setForeground(new java.awt.Color(255, 255, 255));
        Viewlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Viewlbl.setText("View");
        Viewlbl.setOpaque(true);
        Viewlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewlblMouseClicked(evt);
            }
        });

        Printlbl.setBackground(new java.awt.Color(0, 102, 102));
        Printlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Printlbl.setForeground(new java.awt.Color(255, 255, 255));
        Printlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Printlbl.setText("Print");
        Printlbl.setOpaque(true);
        Printlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(Viewlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(Printlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Viewlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Printlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 549, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, 1150, 800));

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
        jPanel1.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 286, 53));

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
        jPanel1.add(loanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 286, 53));

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
        jPanel1.add(paybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 286, 53));

        attendancebtn.setBackground(new java.awt.Color(9, 9, 27));
        attendancebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attendancebtn.setForeground(new java.awt.Color(255, 255, 255));
        attendancebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendancebtn.setText("Attendance");
        attendancebtn.setOpaque(true);
        attendancebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendancebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendancebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendancebtnMouseExited(evt);
            }
        });
        jPanel1.add(attendancebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 286, 53));

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
        jPanel1.add(loanreportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 290, 53));

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
        jPanel1.add(paysheetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 286, 53));

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
        jPanel1.add(leavesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 286, 53));

        Employeetxt1.setBackground(new java.awt.Color(0, 102, 102));
        Employeetxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Employeetxt1.setForeground(new java.awt.Color(255, 255, 255));
        Employeetxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employeetxt1.setText("Leaves Report");
        Employeetxt1.setOpaque(true);
        jPanel1.add(Employeetxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 290, 53));

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

        Employeetxt2.setBackground(new java.awt.Color(9, 9, 27));
        Employeetxt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Employeetxt2.setForeground(new java.awt.Color(255, 255, 255));
        Employeetxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employeetxt2.setText("Employee Report");
        Employeetxt2.setOpaque(true);
        Employeetxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Employeetxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Employeetxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Employeetxt2MouseExited(evt);
            }
        });
        jPanel1.add(Employeetxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 290, 53));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewlblMouseClicked
        getAllLeaves();
    }//GEN-LAST:event_ViewlblMouseClicked

    private void PrintlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintlblMouseClicked
           try {
            InputStream is = getClass().getResourceAsStream("/lk/ijse/payrollSystem/reports/Leaves.jasper");
            HashMap m = new HashMap();
            JasperPrint fillReport = JasperFillManager.fillReport(is, m, DBConnection.getInstance().getConnection());
            JasperViewer.viewReport(fillReport);
        } catch (Exception ex) {
            Logger.getLogger(employeeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintlblMouseClicked

    private void leavesbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesbtnMouseExited
        leavesbtn.setFont(new Font("Tahoma", 1, 18));
        leavesbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_leavesbtnMouseExited

    private void leavesbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesbtnMouseEntered
        leavesbtn.setFont(new Font("Lucida Bright", 1, 30));
        leavesbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_leavesbtnMouseEntered

    private void leavesbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavesbtnMouseClicked
        leaves l = new leaves();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_leavesbtnMouseClicked

    private void paysheetbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paysheetbtnMouseExited
        paysheetbtn.setFont(new Font("Tahoma", 1, 18));
        paysheetbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paysheetbtnMouseExited

    private void paysheetbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paysheetbtnMouseEntered
        paysheetbtn.setFont(new Font("Lucida Bright", 1, 30));
        paysheetbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paysheetbtnMouseEntered

    private void paysheetbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paysheetbtnMouseClicked
        paySheet p = new paySheet();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paysheetbtnMouseClicked

    private void loanreportBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanreportBtnMouseExited
        loanreportBtn.setFont(new Font("Tahoma", 1, 18));
        loanreportBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanreportBtnMouseExited

    private void loanreportBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanreportBtnMouseEntered
        loanreportBtn.setFont(new Font("Lucida Bright", 1, 30));
        loanreportBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanreportBtnMouseEntered

    private void loanreportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanreportBtnMouseClicked
        loanReport l = new loanReport();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loanreportBtnMouseClicked

    private void attendancebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancebtnMouseExited
        attendancebtn.setFont(new Font("Tahoma", 1, 18));
        attendancebtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_attendancebtnMouseExited

    private void attendancebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancebtnMouseEntered
        attendancebtn.setFont(new Font("Lucida Bright", 1, 30));
        attendancebtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_attendancebtnMouseEntered

    private void attendancebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancebtnMouseClicked
        attendance p=new attendance();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_attendancebtnMouseClicked

    private void paybtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybtnMouseExited
        paybtn.setFont(new Font("Tahoma", 1, 18));
        paybtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paybtnMouseExited

    private void paybtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybtnMouseEntered
        paybtn.setFont(new Font("Lucida Bright", 1, 30));
        paybtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_paybtnMouseEntered

    private void paybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybtnMouseClicked
        paySlip l = new paySlip();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paybtnMouseClicked

    private void loanbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseExited
        loanbtn.setFont(new Font("Tahoma", 1, 18));
        loanbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanbtnMouseExited

    private void loanbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseEntered
        loanbtn.setFont(new Font("Lucida Bright", 1, 30));
        loanbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loanbtnMouseEntered

    private void loanbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseClicked
        loan l = new loan();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loanbtnMouseClicked

    private void loanbtnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanbtnMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_loanbtnMouseDragged

    private void EmployeetxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeetxtMouseExited
        Employeetxt.setFont(new Font("Tahoma", 1, 18));
        Employeetxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_EmployeetxtMouseExited

    private void EmployeetxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeetxtMouseEntered
        Employeetxt.setFont(new Font("Lucida Bright", 1, 30));
        Employeetxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_EmployeetxtMouseEntered

    private void EmployeetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeetxtMouseClicked
        ManageEmployee m = new ManageEmployee();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeetxtMouseClicked

    private void homebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseExited
        homebtn.setFont(new Font("Tahoma", 1, 18));
        homebtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_homebtnMouseExited

    private void homebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseEntered
        homebtn.setFont(new Font("Lucida Bright", 1, 30));
        homebtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_homebtnMouseEntered

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        home h = new home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

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

    private void Employeetxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employeetxt2MouseClicked
        employeeReport e = new employeeReport();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Employeetxt2MouseClicked

    private void Employeetxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employeetxt2MouseEntered
        Employeetxt2.setFont(new Font("Lucida Bright", 1, 30));
        Employeetxt2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_Employeetxt2MouseEntered

    private void Employeetxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employeetxt2MouseExited
       Employeetxt2.setFont(new Font("Tahoma", 1, 18));
       Employeetxt2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_Employeetxt2MouseExited

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
            java.util.logging.Logger.getLogger(leavesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leavesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leavesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leavesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leavesReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Employeetxt;
    private javax.swing.JLabel Employeetxt1;
    private javax.swing.JLabel Employeetxt2;
    private javax.swing.JLabel Printlbl;
    private javax.swing.JLabel Viewlbl;
    private javax.swing.JLabel attendancebtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leavesReportTbl;
    private javax.swing.JLabel leavesbtn;
    private javax.swing.JLabel loanbtn;
    private javax.swing.JLabel loanreportBtn;
    private javax.swing.JLabel paybtn;
    private javax.swing.JLabel paysheetbtn;
    private javax.swing.JLabel salarytxt;
    // End of variables declaration//GEN-END:variables

    private void getAllLeaves() {
        
          try {
            
            ArrayList<LeavesDTO> allLeaves= ctrl.getAllLeaves();
            
            DefaultTableModel dtm = (DefaultTableModel) leavesReportTbl.getModel();
            dtm.setRowCount(0);
            
            for (LeavesDTO leaves : allLeaves) {
                Object[] rowData = {
            leaves.getLevId(),
                    leaves.geteId(),
                    leaves.getEmpname(),
                    leaves.getLevel(),
                    leaves.getType(),
                    leaves.getMonth(),
                    leaves.getTotalLeave(),
                    leaves.getDatesOfLeaves(),
                    leaves.getBalanceLeave()
                };
                
      dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(leavesReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }


