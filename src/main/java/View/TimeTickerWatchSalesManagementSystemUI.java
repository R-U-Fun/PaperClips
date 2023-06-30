
//@author Keyasuthan 

package View;

import Model.Watch;
import Controller.WatchController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TimeTickerWatchSalesManagementSystemUI extends javax.swing.JFrame {

    DefaultTableModel model;
    Watch ObjWatch;
    WatchController ObjController;
    ArrayList<Watch> WatchList;
    int index;

    public TimeTickerWatchSalesManagementSystemUI() {
        initComponents();

        ObjController = new WatchController();
        WatchList = new ArrayList<>();
        index = 0;

    }

    String CName;
    String CID;
    String CMail;
    String WID;
    double Price;
    int Quantity;
    double Total;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCName = new javax.swing.JTextField();
        txtWID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCMail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 47, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(44, 47, 51));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(223, 223, 223));
        jLabel3.setText("Customer Name");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(223, 223, 223));
        jLabel2.setText("Watch ID");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(223, 223, 223));
        jLabel4.setText("Price");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(223, 223, 223));
        jLabel6.setText("Quantity");

        txtPrice.setBackground(new java.awt.Color(25, 0, 50));
        txtPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(223, 223, 223));
        txtPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtQuantity.setBackground(new java.awt.Color(25, 0, 50));
        txtQuantity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(223, 223, 223));
        txtQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(223, 223, 223));
        jLabel5.setText("Total");

        txtTotal.setBackground(new java.awt.Color(25, 0, 50));
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(223, 223, 223));
        txtTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtCName.setBackground(new java.awt.Color(25, 0, 50));
        txtCName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCName.setForeground(new java.awt.Color(223, 223, 223));
        txtCName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtWID.setBackground(new java.awt.Color(25, 0, 50));
        txtWID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtWID.setForeground(new java.awt.Color(223, 223, 223));
        txtWID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(223, 223, 223));
        jLabel8.setText("Customer ID");

        txtCID.setBackground(new java.awt.Color(25, 0, 50));
        txtCID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCID.setForeground(new java.awt.Color(223, 223, 223));
        txtCID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bAdd.setBackground(new java.awt.Color(35, 39, 42));
        bAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bAdd.setForeground(new java.awt.Color(223, 223, 223));
        bAdd.setText("ADD");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setBackground(new java.awt.Color(35, 39, 42));
        bDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bDelete.setForeground(new java.awt.Color(223, 223, 223));
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bUpdate.setBackground(new java.awt.Color(35, 39, 42));
        bUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bUpdate.setForeground(new java.awt.Color(223, 223, 223));
        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(223, 223, 223));
        jLabel9.setText("Customer Mail");

        txtCMail.setBackground(new java.awt.Color(25, 0, 50));
        txtCMail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCMail.setForeground(new java.awt.Color(223, 223, 223));
        txtCMail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWID)
                    .addComponent(txtCName)
                    .addComponent(txtCID)
                    .addComponent(txtCMail))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCName))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCID)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCMail)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel5.setBackground(new java.awt.Color(25, 0, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manage Sales Invoices");

        btnGoBack.setBackground(new java.awt.Color(35, 39, 42));
        btnGoBack.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        btnGoBack.setForeground(new java.awt.Color(223, 223, 223));
        btnGoBack.setText("Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btnGoBack))
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(25, 0, 50));

        jTable1.setBackground(new java.awt.Color(25, 0, 50));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(223, 223, 223));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus Name", "Cus ID", "Cus Mail", "Watch ID", "Price(LKR)", "Quantity", "Total(LKR)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(44, 47, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 223, 223));
        jLabel1.setText("Search By Watch ID");

        txtSearch.setBackground(new java.awt.Color(25, 0, 50));
        txtSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(223, 223, 223));
        txtSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bSearch.setBackground(new java.awt.Color(35, 39, 42));
        bSearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bSearch.setForeground(new java.awt.Color(223, 223, 223));
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSearch)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        try {
            String searchWatch = txtSearch.getText();
            for (Watch W : WatchList) {
                if (W.getWID().contains(searchWatch)) {
                    JOptionPane.showMessageDialog(rootPane, W.toString(), "Info ", 0);
                    return;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Watch Details Not Found", "Info ", 0);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid User Input", "Error", 0);
        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            CName = txtCName.getText();
            CID = txtCID.getText();
            CMail = txtCMail.getText();
            WID = txtWID.getText();
            Price = Double.parseDouble(txtPrice.getText());
            Quantity = Integer.parseInt(txtQuantity.getText());
            Total = Price * Quantity;
            txtTotal.setText(String.valueOf(Total));

            model.setValueAt(CName, jTable1.getSelectedRow(), 0);
            model.setValueAt(CID, jTable1.getSelectedRow(), 1);
            model.setValueAt(CMail, jTable1.getSelectedRow(), 2);
            model.setValueAt(WID, jTable1.getSelectedRow(), 3);
            model.setValueAt(Price, jTable1.getSelectedRow(), 4);
            model.setValueAt(Quantity, jTable1.getSelectedRow(), 5);
            model.setValueAt(Total, jTable1.getSelectedRow(), 6);

            JOptionPane.showMessageDialog(rootPane, "Updated a Watch", "Sucess", JOptionPane.INFORMATION_MESSAGE);

        } else {
            if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Is Empty", "Info", 0);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please Select Atleast One Row", "Info", 0);
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if (jTable1.getSelectedRowCount() == 1) {
            model.removeRow(jTable1.getSelectedRow());
            WatchList.remove(index);
            JOptionPane.showMessageDialog(rootPane, "Deleted a Watch", "Sucess", JOptionPane.INFORMATION_MESSAGE);
            index--;
        } else {
            if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Is Empty", "Info", 0);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please Select Atleast One Row", "Info", 0);
            }
        }


    }//GEN-LAST:event_bDeleteActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try {
            CName = txtCName.getText();
            CID = txtCID.getText();
            CMail = txtCMail.getText();
            WID = txtWID.getText();
            Price = Double.parseDouble(txtPrice.getText());
            Quantity = Integer.parseInt(txtQuantity.getText());

            index++;
            ObjWatch = ObjController.addWatch(WID, CName, CID ,CMail , Quantity, Price);
            txtTotal.setText(String.valueOf(ObjWatch.CalTotal()));

            model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                CName,
                "CUS00"+index,
                CMail,
                WID,
                Price,
                Quantity,
                txtTotal.getText(),});

            WatchList.add(ObjWatch);

            JOptionPane.showMessageDialog(rootPane, "Added Watch " + index, "Sucess", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid User Input", "Error", 0);
        }
    }//GEN-LAST:event_bAddActionPerformed
    
    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        //BACK TO MAIN UI
        PaperClipsMainUI MainUI = new PaperClipsMainUI();
        MainUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();

        String tblCName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblCID = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblCMail = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblWID = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblPrice = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String tblQuantity = model.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String tblTotal = model.getValueAt(jTable1.getSelectedRow(), 6).toString();

        txtCName.setText(tblCName);
        txtCID.setText(tblCID);
        txtCMail.setText(tblCMail);
        txtWID.setText(tblWID);
        txtPrice.setText(tblPrice);
        txtQuantity.setText(tblQuantity);
        txtTotal.setText(tblTotal);
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeTickerWatchSalesManagementSystemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCMail;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtWID;
    // End of variables declaration//GEN-END:variables
}
