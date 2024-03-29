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
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.payrollSystem.controller.levelController;
import lk.ijse.payrollSystem.db.DBConnection;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.validation.validation;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author acer
 */
public class level extends javax.swing.JFrame {
    private levelController ctrl;
    private boolean update =false;
    


    /**
     * Creates new form level
     */
    public level() {
        initComponents();
        setLocationRelativeTo(null);
        this.ctrl=new levelController();
        generatelevelId();
        LevelIdtxt.setVisible(true);
        LevelIdtxt.setEditable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homebtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LevelIdlbl = new javax.swing.JLabel();
        LevelNametxt = new javax.swing.JTextField();
        LevelNamelbl = new javax.swing.JLabel();
        totalLeavestxt = new javax.swing.JTextField();
        BasicSalaryAmountlbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Savelbl = new javax.swing.JLabel();
        Deletelbl = new javax.swing.JLabel();
        Updatelbl = new javax.swing.JLabel();
        Printlbl3 = new javax.swing.JLabel();
        LevelIdtxt = new javax.swing.JTextField();
        BasicSalaryAmountlbl1 = new javax.swing.JLabel();
        EPFAmounttxt = new javax.swing.JTextField();
        BasicSalaryAmountlbl2 = new javax.swing.JLabel();
        BasicSalaryAmounttxt1 = new javax.swing.JTextField();
        calculatertxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LevelNamelbl1 = new javax.swing.JLabel();

        jLabel21.setBackground(new java.awt.Color(204, 204, 255));
        jLabel21.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Search");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel21.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(9, 9, 27));

        jPanel2.setBackground(new java.awt.Color(9, 9, 27));

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

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Level");
        jLabel3.setOpaque(true);

        empbtn.setBackground(new java.awt.Color(9, 9, 27));
        empbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        empbtn.setForeground(new java.awt.Color(255, 255, 255));
        empbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empbtn.setText("Manage Employee");
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payrollSystem/asset/level.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(empbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(empbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LevelIdlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LevelIdlbl.setForeground(new java.awt.Color(255, 255, 255));
        LevelIdlbl.setText("LevelId");
        jPanel4.add(LevelIdlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, -1));

        LevelNametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LevelNametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        LevelNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelNametxtActionPerformed(evt);
            }
        });
        LevelNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LevelNametxtKeyTyped(evt);
            }
        });
        jPanel4.add(LevelNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 240, 26));

        LevelNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LevelNamelbl.setForeground(new java.awt.Color(0, 102, 102));
        LevelNamelbl.setText("Level ID");
        jPanel4.add(LevelNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        totalLeavestxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalLeavestxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        totalLeavestxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalLeavestxtKeyTyped(evt);
            }
        });
        jPanel4.add(totalLeavestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 229, 26));

        BasicSalaryAmountlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BasicSalaryAmountlbl.setForeground(new java.awt.Color(0, 102, 102));
        BasicSalaryAmountlbl.setText("EPF Amount");
        jPanel4.add(BasicSalaryAmountlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Savelbl.setBackground(new java.awt.Color(0, 102, 102));
        Savelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Savelbl.setForeground(java.awt.Color.white);
        Savelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Savelbl.setText("Save");
        Savelbl.setOpaque(true);
        Savelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavelblMouseClicked(evt);
            }
        });

        Deletelbl.setBackground(new java.awt.Color(0, 102, 102));
        Deletelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deletelbl.setForeground(java.awt.Color.white);
        Deletelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Deletelbl.setText("Delete");
        Deletelbl.setOpaque(true);
        Deletelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletelblMouseClicked(evt);
            }
        });

        Updatelbl.setBackground(new java.awt.Color(0, 102, 102));
        Updatelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Updatelbl.setForeground(java.awt.Color.white);
        Updatelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Updatelbl.setText("Update");
        Updatelbl.setOpaque(true);
        Updatelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatelblMouseClicked(evt);
            }
        });

        Printlbl3.setBackground(new java.awt.Color(0, 102, 102));
        Printlbl3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Printlbl3.setForeground(new java.awt.Color(255, 255, 255));
        Printlbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Printlbl3.setText("Print");
        Printlbl3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Printlbl3.setOpaque(true);
        Printlbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Printlbl3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Savelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(Updatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(Deletelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(Printlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Updatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Printlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 461, 940, 170));

        LevelIdtxt.setEditable(false);
        LevelIdtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LevelIdtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        LevelIdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelIdtxtActionPerformed(evt);
            }
        });
        jPanel4.add(LevelIdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 229, 26));

        BasicSalaryAmountlbl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BasicSalaryAmountlbl1.setForeground(new java.awt.Color(0, 102, 102));
        BasicSalaryAmountlbl1.setText("Basic Salary Amount");
        jPanel4.add(BasicSalaryAmountlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        EPFAmounttxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EPFAmounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EPFAmounttxtActionPerformed(evt);
            }
        });
        EPFAmounttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EPFAmounttxtKeyTyped(evt);
            }
        });
        jPanel4.add(EPFAmounttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 229, 31));

        BasicSalaryAmountlbl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BasicSalaryAmountlbl2.setForeground(new java.awt.Color(0, 102, 102));
        BasicSalaryAmountlbl2.setText("Total leaves");
        jPanel4.add(BasicSalaryAmountlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        BasicSalaryAmounttxt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BasicSalaryAmounttxt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        BasicSalaryAmounttxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BasicSalaryAmounttxt1KeyTyped(evt);
            }
        });
        jPanel4.add(BasicSalaryAmounttxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 229, 26));

        calculatertxt.setBackground(new java.awt.Color(255, 255, 255));
        calculatertxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculatertxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculatertxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payrollSystem/asset/calcualter.png"))); // NOI18N
        calculatertxt.setText("Calculate  ");
        calculatertxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        calculatertxt.setOpaque(true);
        calculatertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculatertxtMouseClicked(evt);
            }
        });
        jPanel4.add(calculatertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 206, 42));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Level");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 400, 53));

        LevelNamelbl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LevelNamelbl1.setForeground(new java.awt.Color(0, 102, 102));
        LevelNamelbl1.setText("Level Name");
        jPanel4.add(LevelNamelbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        home h=new home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

    private void empbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empbtnMouseClicked
        ManageEmployee e=new ManageEmployee();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empbtnMouseClicked

    private void SavelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavelblMouseClicked
     
        LevelDTO level = new LevelDTO(LevelIdtxt.getText(),
                LevelNametxt.getText(),
               new BigDecimal(BasicSalaryAmounttxt1.getText()),
                new BigDecimal(EPFAmounttxt.getText()),
                 totalLeavestxt.getText());

        if (!update) {
            try {
                boolean result = ctrl.saveLevel(level);
                if (result) {
                    JOptionPane.showMessageDialog(this, "level has been added successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add the level");
                }
            } catch (Exception ex) {
                Logger.getLogger(level.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        clearTextFields();
        generatelevelId();
    }//GEN-LAST:event_SavelblMouseClicked

    private void UpdatelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatelblMouseClicked
        try {
            LevelDTO level = new LevelDTO(LevelIdtxt.getText(),
                LevelNametxt.getText(),
               new BigDecimal(BasicSalaryAmounttxt1.getText()),
                    new BigDecimal(EPFAmounttxt.getText()),
                      totalLeavestxt.getText());
                boolean result = ctrl.updateLevel(level);

                if (result) {
                    JOptionPane.showMessageDialog(this, "Level has been updated successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update the level");
                }
            } catch (Exception ex) {
                Logger.getLogger(level.class.getName()).log(Level.SEVERE, null, ex);
            }
          clearTextFields();
            
    }//GEN-LAST:event_UpdatelblMouseClicked

    private void DeletelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletelblMouseClicked
        try {
            boolean result =ctrl.deleteLevel(LevelIdtxt.getText());
            
            
            if (result) {
                JOptionPane.showMessageDialog(this, "Level has been deleted successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete the Level");
            }
            clearTextFields();
        } catch (Exception ex) {
            Logger.getLogger(level.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
    }//GEN-LAST:event_DeletelblMouseClicked

    private void homebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseEntered
         homebtn.setFont(new Font("Lucida Bright", 1, 30));
        homebtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_homebtnMouseEntered

    private void homebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseExited
          homebtn.setFont(new Font("Tahoma", 1, 18));
       homebtn.setForeground(new Color(51, 255, 255));
    }//GEN-LAST:event_homebtnMouseExited

    private void empbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empbtnMouseEntered
          empbtn.setFont(new Font("Lucida Bright", 1, 30));
        empbtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_empbtnMouseEntered

    private void empbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empbtnMouseExited
       empbtn.setFont(new Font("Tahoma", 1, 18));
       empbtn.setForeground(new Color(51, 255, 255));
    }//GEN-LAST:event_empbtnMouseExited

    private void LevelNametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LevelNametxtKeyTyped
     validation.name(LevelNametxt);
    }//GEN-LAST:event_LevelNametxtKeyTyped

    private void BasicSalaryAmounttxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BasicSalaryAmounttxt1KeyTyped
     validation.priceText(BasicSalaryAmounttxt1);
    }//GEN-LAST:event_BasicSalaryAmounttxt1KeyTyped

    private void EPFAmounttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EPFAmounttxtKeyTyped
      validation.priceText(EPFAmounttxt);
    }//GEN-LAST:event_EPFAmounttxtKeyTyped

    private void totalLeavestxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalLeavestxtKeyTyped
   
    }//GEN-LAST:event_totalLeavestxtKeyTyped

    private void calculatertxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatertxtMouseClicked
       Double basicSalaryAmount= Double.parseDouble(BasicSalaryAmounttxt1.getText().toString());
       
        double EPFAmount=(double) (basicSalaryAmount* 8/100);
        String x=String.valueOf( String.format("%.2f", EPFAmount));
       EPFAmounttxt.setText(x);
    }//GEN-LAST:event_calculatertxtMouseClicked

    private void LevelIdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelIdtxtActionPerformed
       LevelNametxt.requestFocus();
    }//GEN-LAST:event_LevelIdtxtActionPerformed

    private void LevelNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelNametxtActionPerformed
        BasicSalaryAmounttxt1.requestFocus();
    }//GEN-LAST:event_LevelNametxtActionPerformed

    private void EPFAmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EPFAmounttxtActionPerformed
      totalLeavestxt.requestFocus();
    }//GEN-LAST:event_EPFAmounttxtActionPerformed

    private void Printlbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Printlbl3MouseClicked
        try {
            InputStream is = getClass().getResourceAsStream("/lk/ijse/payrollSystem/reports/level.jasper");
            HashMap m = new HashMap();
            JasperPrint fillReport = JasperFillManager.fillReport(is, m, DBConnection.getInstance().getConnection());
            JasperViewer.viewReport(fillReport);
        } catch (Exception ex) {
            Logger.getLogger(employeeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Printlbl3MouseClicked

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
            java.util.logging.Logger.getLogger(level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new level().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BasicSalaryAmountlbl;
    private javax.swing.JLabel BasicSalaryAmountlbl1;
    private javax.swing.JLabel BasicSalaryAmountlbl2;
    private javax.swing.JTextField BasicSalaryAmounttxt1;
    private javax.swing.JLabel Deletelbl;
    private javax.swing.JTextField EPFAmounttxt;
    private javax.swing.JLabel LevelIdlbl;
    private javax.swing.JTextField LevelIdtxt;
    private javax.swing.JLabel LevelNamelbl;
    private javax.swing.JLabel LevelNamelbl1;
    private javax.swing.JTextField LevelNametxt;
    private javax.swing.JLabel Printlbl3;
    private javax.swing.JLabel Savelbl;
    private javax.swing.JLabel Updatelbl;
    private javax.swing.JLabel calculatertxt;
    private javax.swing.JLabel empbtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField totalLeavestxt;
    // End of variables declaration//GEN-END:variables

    private void clearTextFields() {
        LevelIdtxt.setText("");
        LevelNametxt.setText("");
        BasicSalaryAmounttxt1.setText("");
        EPFAmounttxt.setText("");
        totalLeavestxt.setText("");
        
    }

  private void generatelevelId() {
         try {
             LevelIdtxt.setText(IDGenerator.getNewID("Level","leId","L"));
         } catch (SQLException ex) {
             Logger.getLogger(level.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(level.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(level.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }
    }

   

   
