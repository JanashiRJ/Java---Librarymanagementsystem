/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookicon = new javax.swing.JButton();
        membericon = new javax.swing.JButton();
        issuebooklabel = new javax.swing.JLabel();
        returnbookButton = new javax.swing.JButton();
        Returnbooklabel = new javax.swing.JLabel();
        ShowdetailsButton = new javax.swing.JLabel();
        ssbutton = new javax.swing.JButton();
        Issue = new javax.swing.JButton();
        DeleteandUpateButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel2.setText("Welcome to Library Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 82, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add New Members");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 362, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Add New Books");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 362, -1, -1));

        bookicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N
        bookicon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bookicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookiconActionPerformed(evt);
            }
        });
        jPanel2.add(bookicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 176, 154, -1));

        membericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student.png"))); // NOI18N
        membericon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        membericon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membericonActionPerformed(evt);
            }
        });
        jPanel2.add(membericon, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 176, 155, -1));

        issuebooklabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        issuebooklabel.setText("Issue Books");
        jPanel2.add(issuebooklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        returnbookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N
        returnbookButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        returnbookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookButtonActionPerformed(evt);
            }
        });
        jPanel2.add(returnbookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 140, 150));

        Returnbooklabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Returnbooklabel.setText("Return Book");
        jPanel2.add(Returnbooklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        ShowdetailsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowdetailsButton.setText("Show Details");
        jPanel2.add(ShowdetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, -1, -1));

        ssbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1111122.png"))); // NOI18N
        ssbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        ssbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(ssbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 130, 160));

        Issue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/im.png"))); // NOI18N
        Issue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueActionPerformed(evt);
            }
        });
        jPanel2.add(Issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 150, 150));

        DeleteandUpateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de.png"))); // NOI18N
        DeleteandUpateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        DeleteandUpateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteandUpateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteandUpateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 150, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Delete & Update");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, -1, -1));

        LogOutButton.setBackground(new java.awt.Color(0, 51, 51));
        LogOutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        LogOutButton.setText("  Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookiconActionPerformed
        // TODO add your handling code here:
            setVisible(false);
            AddBooks object = new AddBooks();
            object.setVisible(true);
        
    }//GEN-LAST:event_bookiconActionPerformed

    private void membericonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membericonActionPerformed
        // TODO add your handling code here:
            setVisible(false);
            AddMembers object = new AddMembers();
            object.setVisible(true);

    }//GEN-LAST:event_membericonActionPerformed

    private void returnbookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookButtonActionPerformed
        // TODO add your handling code here:
           setVisible(false);
           ReturnBooks object = new ReturnBooks();
           object.setVisible(true);
           
    }//GEN-LAST:event_returnbookButtonActionPerformed

    private void ssbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssbuttonActionPerformed
        // TODO add your handling code here:
           setVisible(false);
           ShowAllDetails object = new ShowAllDetails();
           object.setVisible(true);
    }//GEN-LAST:event_ssbuttonActionPerformed

    private void IssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        IssueBook object = new IssueBook();
        object.setVisible(true);
    }//GEN-LAST:event_IssueActionPerformed

    private void DeleteandUpateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteandUpateButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        DeleteandUpdates object = new DeleteandUpdates();
        object.setVisible(true);
        
    }//GEN-LAST:event_DeleteandUpateButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LogOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteandUpateButton;
    private javax.swing.JButton Issue;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel Returnbooklabel;
    private javax.swing.JLabel ShowdetailsButton;
    private javax.swing.JButton bookicon;
    private javax.swing.JLabel issuebooklabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton membericon;
    private javax.swing.JButton returnbookButton;
    private javax.swing.JButton ssbutton;
    // End of variables declaration//GEN-END:variables
}
