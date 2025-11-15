/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Praveen
 */
public class Main_Application extends javax.swing.JFrame {
    /**
     * Creates new form Main_Application
     */
    public Main_Application() {
        initComponents();
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_product_perfomandce = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_user_management = new javax.swing.JButton();
        btn_best_sele = new javax.swing.JButton();
        btn_regional_sale = new javax.swing.JButton();
        btn_regional_sale1 = new javax.swing.JButton();
        btn_loat_data = new javax.swing.JButton();
        btn_log_Out = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Sampath Food City (PVT) Ltd ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Best Selling Products Analysis ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_product_perfomandce.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_product_perfomandce.setText("Product Performance");
        btn_product_perfomandce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_perfomandceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Sampath Food City (PVT) Ltd ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Dashboard");

        btn_user_management.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_user_management.setText("User Management ");
        btn_user_management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_managementActionPerformed(evt);
            }
        });

        btn_best_sele.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_best_sele.setText("Best Selling Products ");
        btn_best_sele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_best_seleActionPerformed(evt);
            }
        });

        btn_regional_sale.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_regional_sale.setText("Regional Sales ");
        btn_regional_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regional_saleActionPerformed(evt);
            }
        });

        btn_regional_sale1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_regional_sale1.setText("Customer Behavior ");
        btn_regional_sale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regional_sale1ActionPerformed(evt);
            }
        });

        btn_loat_data.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_loat_data.setText("Load Data ");
        btn_loat_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loat_dataActionPerformed(evt);
            }
        });

        btn_log_Out.setBackground(new java.awt.Color(153, 153, 153));
        btn_log_Out.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btn_log_Out.setText("Log out");
        btn_log_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_OutActionPerformed(evt);
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
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_user_management, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(btn_loat_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_best_sele)
                            .addComponent(btn_regional_sale1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_regional_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_product_perfomandce, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_log_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_log_Out))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_user_management, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_regional_sale1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_product_perfomandce, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_best_sele, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_regional_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_loat_data, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loat_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loat_dataActionPerformed
        // TODO add your handling code here:
        product_data_load load_data = new product_data_load();
        // Show the next page
        load_data.setVisible(true);
        // Close the current page
        this.dispose();
    }//GEN-LAST:event_btn_loat_dataActionPerformed

    private void btn_best_seleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_best_seleActionPerformed
        // TODO add your handling code here:
        Best_Selling_Products load_data = new Best_Selling_Products();
        // Show the next page
        load_data.setVisible(true);
        // Close the current page
        this.dispose();
    }//GEN-LAST:event_btn_best_seleActionPerformed

    private void btn_regional_sale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regional_sale1ActionPerformed
        // TODO add your handling code here:
        customer_behavior_product load_data = new customer_behavior_product();
        // Show the next page
        load_data.setVisible(true);
        // Close the current page
        this.dispose();
        
    }//GEN-LAST:event_btn_regional_sale1ActionPerformed

    private void btn_user_managementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_managementActionPerformed
        // TODO add your handling code here:
        
        User_Management load_data = new User_Management();
        // Show the next page
        load_data.setVisible(true);
        // Close the current page
        this.dispose();
    }//GEN-LAST:event_btn_user_managementActionPerformed

    private void btn_regional_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regional_saleActionPerformed
        // TODO add your handling code here:
        Regional_Sales_Analysis load_data = new Regional_Sales_Analysis();
        // Show the next page
        load_data.setVisible(true);
        // Close the current page
        this.dispose();
    }//GEN-LAST:event_btn_regional_saleActionPerformed

    private void btn_product_perfomandceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_perfomandceActionPerformed
        // TODO add your handling code here:
        Product_Performance load_data = new Product_Performance();
        // Show the next page
        load_data.setVisible(true);
        // Close the current page
        this.dispose();
    }//GEN-LAST:event_btn_product_perfomandceActionPerformed

    private void btn_log_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_OutActionPerformed
        // TODO add your handling code here:
   
        login_page load_data = new login_page();
        // Show the next page
        load_data.setVisible(true);
        // Close the current page
        this.dispose();
        
    }//GEN-LAST:event_btn_log_OutActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_best_sele;
    private javax.swing.JButton btn_loat_data;
    private javax.swing.JButton btn_log_Out;
    private javax.swing.JButton btn_product_perfomandce;
    private javax.swing.JButton btn_regional_sale;
    private javax.swing.JButton btn_regional_sale1;
    private javax.swing.JButton btn_user_management;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
