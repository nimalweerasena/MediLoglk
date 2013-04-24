package rmsd;


import javax.swing.JDesktopPane;
import mymod.dbconnector;
import mymod.voidmodule;

public class Frmloging extends javax.swing.JFrame {
    public static String uname;
    public static String pword;
    public static String host;
    public static String port;
    public static String Database;
    public static Object database;
    public String sql = null;
    
    public Frmloging() {
        initComponents();
        this.setSize(455, 280);
        //  btnloging.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        btnloging = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtport = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CcmbDatabase = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("MySql Server  Administrator");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Enter Your Server Connection Details");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Copyright (c) 2012, District General Hospital - Matale - Sri Lanka");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("All rights reserved.");

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(2, 2, 5, 10));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("User Name");
        jPanel5.add(jLabel13);

        txtUname.setText("a");
        txtUname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnameFocusLost(evt);
            }
        });
        txtUname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnameKeyPressed(evt);
            }
        });
        jPanel5.add(txtUname);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Password");
        jPanel5.add(jLabel9);

        txtpassword.setText("a");
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        jPanel5.add(txtpassword);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnloging.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnloging.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tick.gif"))); // NOI18N
        btnloging.setText("Ok");
        btnloging.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnloging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogingActionPerformed(evt);
            }
        });
        btnloging.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnlogingKeyPressed(evt);
            }
        });
        jPanel3.add(btnloging);

        btnexit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cross.png"))); // NOI18N
        btnexit.setText("Cancel");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel3.add(btnexit);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/55.gif"))); // NOI18N
        jButton3.setText("Hide Host Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(3, 2, 5, 10));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Server Host");
        jPanel6.add(jLabel1);

        txtHost.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtHost.setText("localhost");
        txtHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHostActionPerformed(evt);
            }
        });
        txtHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHostKeyPressed(evt);
            }
        });
        jPanel6.add(txtHost);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Port");
        jPanel6.add(jLabel10);

        txtport.setText("3306");
        txtport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtportKeyPressed(evt);
            }
        });
        jPanel6.add(txtport);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Database");
        jPanel6.add(jLabel12);

        CcmbDatabase.setEditable(true);
        CcmbDatabase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Drugs", "Surgical", "Vaccine", "MySql" }));
        CcmbDatabase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CcmbDatabaseFocusLost(evt);
            }
        });
        CcmbDatabase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CcmbDatabaseKeyPressed(evt);
            }
        });
        jPanel6.add(CcmbDatabase);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Key.png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/54.gif"))); // NOI18N
        jButton2.setText("Show Host Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogingActionPerformed
        logging(); 

    }//GEN-LAST:event_btnlogingActionPerformed
    void logging() {
        uname = txtUname.getText();
        pword = txtpassword.getText();
        dbconnector.host = txtHost.getText();
        dbconnector.uname = uname;
        dbconnector.pword = pword;
        dbconnector.port = txtport.getText();
        database = CcmbDatabase.getSelectedItem();
        dbconnector.read_database(database);
      //  dbconnector.connsql(uname, pword, host, port);

        sql = "SELECT User from user WHERE User ='" + uname + "'AND Password ='" + pword + "'";
        ;
        if (voidmodule.RCountsql(sql)> 0) {
        } else {


            voidmodule.User_Name(uname);
            voidmodule.U_transaction(uname, "Loging");

            MDI open = new MDI();
            open.setVisible(true);
            open.setuser(uname);
            txtpassword.setText(null);
            this.setVisible(false);
        }


    }
  
    public static void removeAllFrames() {
        JDesktopPane d = MDI.jDesktopPane1;
        d.removeAll();
    }
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHostActionPerformed

    private void txtHostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHostKeyPressed
    }//GEN-LAST:event_txtHostKeyPressed

    private void txtportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtportKeyPressed
        if (evt.getKeyCode() == 10) {
            CcmbDatabase.requestFocus();
        }
    }//GEN-LAST:event_txtportKeyPressed

    private void btnlogingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlogingKeyPressed
        if (evt.getKeyCode() == 10) {
            logging();
        }
    }//GEN-LAST:event_btnlogingKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setSize(455, 415);
        jButton2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setSize(455, 280);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CcmbDatabaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CcmbDatabaseKeyPressed
        if (evt.getKeyCode() == 10) {
            logging();
            btnloging.requestFocus();
        }
    }//GEN-LAST:event_CcmbDatabaseKeyPressed

    private void CcmbDatabaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CcmbDatabaseFocusLost
        logging();
    }//GEN-LAST:event_CcmbDatabaseFocusLost

    private void txtUnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnameFocusLost
    }//GEN-LAST:event_txtUnameFocusLost

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
           if (evt.getKeyCode() == 10) {
            btnloging.requestFocus();
        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtUnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnameKeyPressed
        if (evt.getKeyCode() == 10) {
            txtpassword.requestFocus();
        }
    }//GEN-LAST:event_txtUnameKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Frmloging FS = new Frmloging();
                FS.setVisible(true);
                FS.setSize(455, 280);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CcmbDatabase;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnloging;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtUname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtport;
    // End of variables declaration//GEN-END:variables
}
