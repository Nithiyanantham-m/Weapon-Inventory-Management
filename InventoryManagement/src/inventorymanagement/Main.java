package inventorymanagement;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {

    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;

    public Main() {
        initComponents();
        this.setLocationRelativeTo(this);
        attributeVisible();
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            JOptionPane.showMessageDialog(this, "Driver Loaded!");
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-KB3TBJN:1521:XE",
                        "nithi", "2362");
                JOptionPane.showMessageDialog(this, "Connected to Oracle database!");
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableAttributes = new javax.swing.JComboBox<>();
        selectTable = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        attSeven = new javax.swing.JTextField();
        attEight = new javax.swing.JTextField();
        attOne = new javax.swing.JTextField();
        attTwo = new javax.swing.JTextField();
        attThree = new javax.swing.JTextField();
        attFour = new javax.swing.JTextField();
        attFive = new javax.swing.JTextField();
        attSix = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        o_insertBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        searchval = new javax.swing.JTextField();
        delBtn = new javax.swing.JButton();
        delVal = new javax.swing.JTextField();
        updBtn = new javax.swing.JButton();
        upVal = new javax.swing.JTextField();
        upVal1 = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        org_id = new javax.swing.JLabel();
        orgn = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        ot = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management");

        tableAttributes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organization_ID", "Organization_Name", "Contact_Number ", "O_Type ", "Email " }));

        selectTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organization", "Organization Location", "Org loc div", "Supplier", "Raw Materials", "Weapons List", "Order Table", "Weapon Requirements", "Weapons Details", "Armory" }));
        selectTable.setToolTipText("");
        selectTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTableActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(attOne)
                    .addComponent(attThree)
                    .addComponent(attFour)
                    .addComponent(attFive)
                    .addComponent(attSix)
                    .addComponent(attSeven)
                    .addComponent(attEight))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(attOne, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attThree, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attFour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(attFive, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(attSix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(attSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attEight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);

        o_insertBtn.setText("INSERT");
        o_insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_insertBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("SEARCH");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        delBtn.setText("DELETE");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        updBtn.setText("UPDATE");
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(o_insertBtn)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SearchBtn)
                                .addComponent(delBtn)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchval)
                            .addComponent(delVal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(updBtn)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upVal1)
                            .addComponent(upVal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(o_insertBtn)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBtn)
                    .addComponent(searchval, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delBtn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(delVal, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updBtn)
                    .addComponent(upVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(upVal1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jPanel3.setOpaque(false);

        org_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        org_id.setForeground(new java.awt.Color(255, 204, 0));
        org_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org_id.setText("Organization ID");

        orgn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orgn.setForeground(new java.awt.Color(255, 204, 0));
        orgn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orgn.setText("Organization Name");

        cn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cn.setForeground(new java.awt.Color(255, 204, 0));
        cn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cn.setText("Contact Number");

        em.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        em.setForeground(new java.awt.Color(255, 204, 0));
        em.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        em.setText("Email");

        ot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ot.setForeground(new java.awt.Color(255, 204, 0));
        ot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ot.setText("Type");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(org_id, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orgn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(em, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(org_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orgn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagement/Apac-News-8.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(selectTable, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(tableAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(selectTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tableAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTableActionPerformed
        int option = selectTable.getSelectedIndex();

        switch (option) {

            case 0:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(true);
                attFour.setVisible(true);
                attFive.setVisible(true);
                attSix.setVisible(false);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                organizationAttributes();
                break;

            case 1:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(false);
                attFour.setVisible(false);
                attFive.setVisible(false);
                attSix.setVisible(false);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                organizationLocationAttributes();
                break;

            case 2:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(false);
                attFour.setVisible(false);
                attFive.setVisible(false);
                attSix.setVisible(false);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                organizationLocDivAttributes();
                break;

            case 3:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(true);
                attFour.setVisible(true);
                attFive.setVisible(false);
                attSix.setVisible(false);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                supplierAttributes();

                break;

            case 4:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(true);
                attFour.setVisible(true);
                attFive.setVisible(true);
                attSix.setVisible(true);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                rawMaterialsAttributes();

                break;

            case 5:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(true);
                attFour.setVisible(false);
                attFive.setVisible(false);
                attSix.setVisible(false);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                weaponListAttributes();
                break;

            case 6:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(true);
                attFour.setVisible(true);
                attFive.setVisible(true);
                attSix.setVisible(true);
                attSeven.setVisible(true);
                attEight.setVisible(false);
                orderTableAttributes();
                break;

            case 7:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(true);
                attFour.setVisible(false);
                attFive.setVisible(false);
                attSix.setVisible(false);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                weaponReqAttributes();
                break;

            case 8:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(true);
                attFour.setVisible(true);
                attFive.setVisible(true);
                attSix.setVisible(true);
                attSeven.setVisible(true);
                attEight.setVisible(true);
                weaponDetailsAttributes();
                break;

            case 9:
                attOne.setVisible(true);
                attTwo.setVisible(true);
                attThree.setVisible(false);
                attFour.setVisible(false);
                attFive.setVisible(false);
                attSix.setVisible(false);
                attSeven.setVisible(false);
                attEight.setVisible(false);
                armoryAttributes();
                break;

        }
    }//GEN-LAST:event_selectTableActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
        String sql = null;
        int option = selectTable.getSelectedIndex();
        String tableAttributeName = tableAttributes.getSelectedItem().toString();

        // TODO add your handling code here:
        switch (option) {

            case 0:
                sql = "UPDATE Organization SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Organization_ID = '" + upVal1.getText() + "'";

                updateValues(sql, 5);
                break;

            case 1:
                sql = "UPDATE Organization_Location SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Organization_ID = '" + upVal1.getText() + "'";
                updateValues(sql, 5);

                break;

            case 2:
                sql = "UPDATE Org_loc_div SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE City = '" + upVal1.getText() + "'";
                updateValues(sql, 5);

                break;

            case 3:
                sql = "UPDATE Supplier  SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Supplier_ID = '" + upVal1.getText() + "'";

                updateValues(sql, 5);

                break;

            case 4:
                sql = "UPDATE Raw_Materials SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Material_ID = '" + upVal1.getText() + "'";

                updateValues(sql, 5);

                break;

            case 5:
                sql = "UPDATE Weapons_List SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Weapon_ID = '" + upVal1.getText() + "'";
                updateValues(sql, 5);

                break;

            case 6:
                sql = "UPDATE Order_Table SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Order_ID = '" + upVal1.getText() + "'";
                updateValues(sql, 5);

                break;

            case 7:
                sql = "UPDATE Weapon_Requirements SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Material_ID = '" + upVal1.getText() + "'";
                updateValues(sql, 5);

                break;

            case 8:
                sql = "UPDATE Weapons_Details SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Weapon_ID = '" + upVal1.getText() + "'";

                updateValues(sql, 5);

                break;

            case 9:
                sql = "UPDATE ARMORY SET " + tableAttributeName + " = '" + upVal.getText() + "' WHERE Weapon_ID = '" + upVal1.getText() + "'";
                updateValues(sql, 5);

                break;
        }
    }//GEN-LAST:event_updBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        String sql = null;
        int option = selectTable.getSelectedIndex();

        // TODO add your handling code here:
        switch (option) {

            case 0:
                sql = "delete from Organization where  organization_id = '" + delVal.getText() + "'";
                deleteValues(sql, 5);
                break;

            case 1:
                sql = "delete FROM Organization_Location where organization_id='" + delVal.getText() + "'";
                deleteValues(sql, 5);
                break;

            case 2:
                sql = "delete  FROM Org_loc_div where city='" + delVal.getText() + "'";
                deleteValues(sql, 2);
                break;

            case 3:
                sql = "delete  FROM Supplier where Supplier_ID='" + delVal.getText() + "'";
                deleteValues(sql, 4);
                break;

            case 4:
                sql = "delete  FROM Raw_Materials where Material_ID='" + delVal.getText() + "'";
                deleteValues(sql, 6);
                break;

            case 5:
                sql = "delete  FROM Weapons_List where Weapon_ID='" + delVal.getText() + "'";
                deleteValues(sql, 3);
                break;

            case 6:
                sql = "delete  FROM Order_Table where Order_ID='" + delVal.getText() + "'";
                deleteValues(sql, 7);
                break;

            case 7:
                sql = "delete  FROM Weapon_Requirements where Material_ID='" + delVal.getText() + "'";
                deleteValues(sql, 3);
                break;

            case 8:
                sql = "delete  FROM Weapons_Details where Weapon_ID='" + delVal.getText() + "'";
                deleteValues(sql, 8);
                break;

            case 9:
                sql = "delete  FROM ARMORY where Weapon_ID='" + delVal.getText() + "'";
                deleteValues(sql, 2);
                break;
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        //searchValues();
        String sql = null;
        int option = selectTable.getSelectedIndex();

        // TODO add your handling code here:
        switch (option) {

            case 0:
                sql = "select * from Organization where  organization_id = '" + searchval.getText() + "'";
                searchValues(sql, 5);
                break;

            case 1:
                sql = "SELECT * FROM Organization_Location where organization_id='" + searchval.getText() + "'";
                searchValues(sql, 5);
                break;

            case 2:
                sql = "SELECT * FROM Org_loc_div where city='" + searchval.getText() + "'";
                searchValues(sql, 2);
                break;

            case 3:
                sql = "SELECT * FROM Supplier where Supplier_ID='" + searchval.getText() + "'";
                searchValues(sql, 4);
                break;

            case 4:
                sql = "SELECT * FROM Raw_Materials where Material_ID='" + searchval.getText() + "'";
                searchValues(sql, 6);
                break;

            case 5:
                sql = "SELECT * FROM Weapons_List where Weapon_ID='" + searchval.getText() + "'";
                searchValues(sql, 3);
                break;

            case 6:
                sql = "SELECT * FROM Order_Table where Order_ID='" + searchval.getText() + "'";
                searchValues(sql, 7);
                break;

            case 7:
                sql = "SELECT * FROM Weapon_Requirements where Material_ID='" + searchval.getText() + "'";
                searchValues(sql, 3);
                break;

            case 8:
                sql = "SELECT * FROM Weapons_Details where Weapon_ID='" + searchval.getText() + "'";
                searchValues(sql, 8);
                break;

            case 9:
                sql = "SELECT * FROM ARMORY where Weapon_ID='" + searchval.getText() + "'";
                searchValues(sql, 2);
                break;
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void o_insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_insertBtnActionPerformed
        String sql = null;
        int option = selectTable.getSelectedIndex();
        switch (option) {

            case 0:
                sql = "insert into Organization values(?,?,?,?,?)";
                insertValue(sql, 5);
                break;

            case 1:
                sql = "insert into Organization_Location values(?,?)";
                insertValue(sql, 2);

                break;

            case 2:
                sql = "insert into  Org_loc_div values(?,?)";
                insertValue(sql, 2);
                break;

            case 3:
                sql = "insert into Supplier  values(?,?,?,?)";
                insertValue(sql, 4);
                break;

            case 4:
                sql = "insert into Raw_Materials values(?,?,?,?,?,?)";
                insertValue(sql, 6);
                break;

            case 5:
                sql = "insert into Weapons_List values(?,?,?)";
                insertValue(sql, 3);
                break;

            case 6:
                sql = "insert into  Order_Table values(?,?,?,?,?,?,?)";
                insertValue(sql, 7);
                break;

            case 7:
                sql = "insert into Weapon_Requirements values(?,?,?)";
                insertValue(sql, 3);
                break;

            case 8:
                sql = "insert into Weapons_Details values(?,?,?,?,?,?,?,?)";
                insertValue(sql, 8);
                break;

            case 9:
                sql = "insert into Armory values(?,?)";
                insertValue(sql, 2);
                break;
        }
    }//GEN-LAST:event_o_insertBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        refreshAll();
    }//GEN-LAST:event_clearBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField attEight;
    private javax.swing.JTextField attFive;
    private javax.swing.JTextField attFour;
    private javax.swing.JTextField attOne;
    private javax.swing.JTextField attSeven;
    private javax.swing.JTextField attSix;
    private javax.swing.JTextField attThree;
    private javax.swing.JTextField attTwo;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel cn;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField delVal;
    private javax.swing.JLabel em;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton o_insertBtn;
    private javax.swing.JLabel org_id;
    private javax.swing.JLabel orgn;
    private javax.swing.JLabel ot;
    private javax.swing.JTextField searchval;
    private javax.swing.JComboBox<String> selectTable;
    private javax.swing.JComboBox<String> tableAttributes;
    private javax.swing.JTextField upVal;
    private javax.swing.JTextField upVal1;
    private javax.swing.JButton updBtn;
    // End of variables declaration//GEN-END:variables

    private void attributeVisible() {
        attOne.setVisible(true);
        attTwo.setVisible(true);
        attThree.setVisible(true);
        attFour.setVisible(true);
        attFive.setVisible(true);
        attSix.setVisible(false);
        attSeven.setVisible(false);
        attEight.setVisible(false);
    }

    private void insertValue(String sql, int attribute) {
        try {
            ps = con.prepareStatement(sql);
            JTextField att = null;

            for (int i = 1; i <= attribute; i++) {
                if (i == 1) {
                    att = attOne;
                } else if (i == 2) {
                    att = attTwo;
                } else if (i == 3) {
                    att = attThree;
                } else if (i == 4) {
                    att = attFour;
                } else if (i == 5) {
                    att = attFive;
                } else if (i == 6) {
                    att = attSix;
                } else if (i == 7) {
                    att = attSeven;
                } else if (i == 8) {
                    att = attEight;
                }

                ps.setString(i, att.getText());
            }
            ps.execute();

            JOptionPane.showMessageDialog(this, "Inserted!");
            refresh(attribute);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void displayItems(String sql, int attribute) {

        try {
            String sql1 = "select * from ORGANIZATION";
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                attOne.setText(rs.getString(1));
                attTwo.setText(rs.getString(2));
                attThree.setText(rs.getString(3));
                attFour.setText(rs.getString(4));
                attFive.setText(rs.getString(5));
//String s=rs.getString(13);
                JOptionPane.showMessageDialog(this, "Record Found!");
            } else {
                JOptionPane.showMessageDialog(this, "Record NotFound!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void searchValues(String sql, int attribute) {

        refresh(attribute);
        try {
            JTextField att = null;
            //String sql = "select * from Organization where  organization_id = '" + attOne.getText() + "'";
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                for (int i = 1; i <= attribute; i++) {
                    if (i == 1) {
                        att = attOne;
                    } else if (i == 2) {
                        att = attTwo;
                    } else if (i == 3) {
                        att = attThree;
                    } else if (i == 4) {
                        att = attFour;
                    } else if (i == 5) {
                        att = attFive;
                    } else if (i == 6) {
                        att = attSix;
                    } else if (i == 7) {
                        att = attSeven;
                    } else if (i == 8) {
                        att = attEight;
                    }

                    att.setText(rs.getString(i));
                }

                //String s=rs.getString(13);
                JOptionPane.showMessageDialog(this, "Record Found!");
                searchval.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void refresh(int attribute) {
        for (int i = 1; i <= attribute; i++) {
            if (i == 1) {
                attOne.setText("");
            } else if (i == 2) {
                attTwo.setText("");
            } else if (i == 3) {
                attThree.setText("");
            } else if (i == 4) {
                attFour.setText("");
            } else if (i == 5) {
                attFive.setText("");
            } else if (i == 6) {
                attSix.setText("");
            } else if (i == 7) {
                attSeven.setText("");
            } else if (i == 8) {
                attEight.setText("");
            }
        }
    }

    private void deleteValues(String sql, int attribute) {
        // Step 3: Execute the query
        refresh(attribute);

        try {
            st = con.createStatement();
            int rowsAffected = st.executeUpdate(sql);
            // Step 4: Handle the result
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY DELETED");
                delVal.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "RECORD NOT FOUND");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void organizationAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Organization_ID");
        tableAttributes.addItem("Organization_Name");
        tableAttributes.addItem("Contact_Number");
        tableAttributes.addItem("O_Type");
        tableAttributes.addItem("Email");

        org_id.setVisible(true);
        orgn.setVisible(true);
        cn.setVisible(true);
        em.setVisible(true);
        ot.setVisible(true);

    }

    private void organizationLocationAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Organization_ID");
        tableAttributes.addItem("City");
        lableHide();
    }

    private void organizationLocDivAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("City");
        tableAttributes.addItem("Country");
        lableHide();

    }

    private void supplierAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Supplier_ID");
        tableAttributes.addItem("Supplier_Name");
        tableAttributes.addItem("Supplier_Location");
        tableAttributes.addItem("Contact_Number");
        lableHide();
    }

    private void rawMaterialsAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Material_ID");
        tableAttributes.addItem("Material_Name");
        tableAttributes.addItem("Import_Date");
        tableAttributes.addItem("Quantity");
        tableAttributes.addItem("Supplier_ID");
        tableAttributes.addItem("R_Type");
        lableHide();

    }

    private void weaponListAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Weapon_ID");
        tableAttributes.addItem("Quantity");
        tableAttributes.addItem("Weapon_Type");
        lableHide();

    }

    private void orderTableAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Order_ID");
        tableAttributes.addItem("Organization_ID");
        tableAttributes.addItem("Weapon_ID");
        tableAttributes.addItem("Purchase_Date");
        tableAttributes.addItem("Quantity");
        tableAttributes.addItem("Total_Price");
        tableAttributes.addItem("Delivery_Date");
        lableHide();
    }

    private void weaponReqAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Material_ID");
        tableAttributes.addItem("Weapon_ID");
        tableAttributes.addItem("Bullet");
        lableHide();

    }

    private void weaponDetailsAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Weapon_ID");
        tableAttributes.addItem("Weapon_Name");
        tableAttributes.addItem("MFG_Date");
        tableAttributes.addItem("W_Type");
        tableAttributes.addItem("Price");
        tableAttributes.addItem("Caliber");
        tableAttributes.addItem("Weight");
        tableAttributes.addItem("Fire_Rate");
        lableHide();
    }

    private void armoryAttributes() {
        tableAttributes.removeAllItems();
        tableAttributes.addItem("Weapon_ID");
        tableAttributes.addItem("Sector");
        lableHide();

    }

    private void updateValues(String sql, int attribute) {
        refresh(attribute);

        try {
            st = con.createStatement();
            int rowsAffected = st.executeUpdate(sql);
            // Step 4: Handle the result
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY UPDATED");
                upVal.setText("");
                upVal1.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "RECORD NOT FOUND");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void refreshAll() {
        attOne.setText("");
        attTwo.setText("");
        attThree.setText("");
        attFour.setText("");
        attFive.setText("");
        attSix.setText("");
        attSeven.setText("");
        attEight.setText("");

    }
    
     private void lableHide() {
        org_id.setVisible(false);
        orgn.setVisible(false);
        cn.setVisible(false);
        em.setVisible(false);
        ot.setVisible(false);
    }
}
