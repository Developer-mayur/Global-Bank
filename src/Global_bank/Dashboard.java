/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global_bank;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author hp
 */
public class Dashboard extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Dashboard
     */
    private String User_Id;
    public Dashboard(String User_Id) {
//        System.out.print(cardno);
        this.User_Id=User_Id;
        initComponents();
        setCardNo();
        setBalance();
//        setTransections();
        
        
    }

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Balance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcardno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton3.setSelected(true);
        jToggleButton3.setText("Transfer");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 130, 40));

        jPanel5.setBackground(new java.awt.Color(51, 0, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        jToggleButton5.setSelected(true);
        jToggleButton5.setText("Logout");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 710, 100, 30));

        jToggleButton2.setSelected(true);
        jToggleButton2.setText("Deposite");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 40));

        jToggleButton8.setSelected(true);
        jToggleButton8.setText("Home");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 760));

        jToggleButton7.setSelected(true);
        jToggleButton7.setText("Deposite");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 333, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel2.setText(" ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(960, 16, 295, 333);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 30, 0, 370);

        Balance.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Balance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Balance.setText(" ");
        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceActionPerformed(evt);
            }
        });
        jPanel2.add(Balance);
        Balance.setBounds(610, 250, 200, 59);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Balance");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(610, 170, 210, 90);

        txtcardno.setBackground(new java.awt.Color(0, 153, 153));
        txtcardno.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txtcardno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcardno.setRequestFocusEnabled(false);
        txtcardno.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtcardnoComponentHidden(evt);
            }
        });
        txtcardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcardnoActionPerformed(evt);
            }
        });
        jPanel2.add(txtcardno);
        txtcardno.setBounds(140, 230, 230, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GlobalBank/icons/cp.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 80, 370, 250);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 930, 380));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Recent Transections ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 270, -1));

        t1.setText(" ");
        jPanel3.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 620, 50));

        t2.setText(" ");
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel3.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 620, 50));

        t3.setText(" ");
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel3.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 620, 60));

        jTextField4.setText("jTextField3");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 620, 50));

        jTextField5.setText(" ");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 620, 50));

        t4.setText(" ");
        jPanel3.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 620, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 920, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       new page5(User_Id).setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        new Login().setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        new page6(User_Id).setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        new Dashboard(User_Id).setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void txtcardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcardnoActionPerformed

    private void txtcardnoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtcardnoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcardnoComponentHidden

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

     void setCardNo(){
     
         try{
         
            Conn c2 = new Conn();
           

                String q = "select cardno from Custmorvalue where User_Id = " + User_Id + "" ;

   ResultSet rs = c2.s.executeQuery(q);
                if (rs.next()) {
                    
                    String cardno2=rs.getString("cardno");
                    System.out.print(cardno2);
//                     new Dashboard(User_Id).setVisible(true);
                     
//                    setVisible(false);                                            
               txtcardno.setText(cardno2);
         txtcardno.setEditable(false);
         }
         } catch (Exception e) {
            e.printStackTrace();
        }}
     
     
     void setBalance(){
            try{
         
            Conn c3 = new Conn();
           

                String q = "select Balance from Custmorvalue where User_Id = " + User_Id + "" ;

   ResultSet rs1 = c3.s.executeQuery(q);
                if (rs1.next()) {
                    
                    String b=rs1.getString("Balance");
                    System.out.print(b);
//                     new Dashboard(User_Id).setVisible(true);
                     
//                    setVisible(false);                                            
               Balance.setText(b);
         Balance.setEditable(false);
         }
         } catch (Exception e) {
            e.printStackTrace();
        }
         
     }
     
//   void  setTransections(){
//            try{
//         
//            Conn c4 = new Conn();
//           
//
//                String q = "select Balance from Custmorvalue where User_Id = " + User_Id + "" ;
//
//   ResultSet rs1 = c4.s.executeQuery(q);
//                if (rs1.next()) {
//                    
//                    String s=rs2.getString("Balance");
//                    System.out.print(s);
////                     new Dashboard(User_Id).setVisible(true);
//                     
////                    setVisible(false);                                            
//               Balance.setText(b);
//         Balance.setEditable(false);
//         }
//         } catch (Exception e) {
//            e.printStackTrace();
//        } 
//       
//       
//   }    
     
     
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
               

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Balance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField txtcardno;
    // End of variables declaration//GEN-END:variables
}
