/*
 * Kieran Bates
 * October 27, 2019
 * This program allows a user to perform various calculations by using the default Java math methods
 */

/**
 *
 * @author Kieran Bates
 */
public class MathMethodsGUI extends javax.swing.JFrame {

    /**
     * Creates new form MathMethodsGUI
     */
    public MathMethodsGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        largestField1 = new javax.swing.JTextField();
        largestField2 = new javax.swing.JTextField();
        largestButton = new javax.swing.JButton();
        smallestField1 = new javax.swing.JTextField();
        smallestField2 = new javax.swing.JTextField();
        smallestButton = new javax.swing.JButton();
        powerOfField1 = new javax.swing.JTextField();
        powerOfField2 = new javax.swing.JTextField();
        powerOfButton = new javax.swing.JButton();
        hypotenuseField1 = new javax.swing.JTextField();
        hypotenuseButton = new javax.swing.JButton();
        hypotenuseField2 = new javax.swing.JTextField();
        roundedDownButton = new javax.swing.JButton();
        roundedUpButton = new javax.swing.JButton();
        squareRootButton = new javax.swing.JButton();
        inRadiansButton = new javax.swing.JButton();
        roundedDownField = new javax.swing.JTextField();
        roundedUpField = new javax.swing.JTextField();
        squareRootField = new javax.swing.JTextField();
        inRadiansField = new javax.swing.JTextField();
        largestOutput = new javax.swing.JLabel();
        smallestOutput = new javax.swing.JLabel();
        powerOfOutput = new javax.swing.JLabel();
        hypotenuseOutput = new javax.swing.JLabel();
        roundedDownOutput = new javax.swing.JLabel();
        roundedUpOutput = new javax.swing.JLabel();
        squareRootOutput = new javax.swing.JLabel();
        inRadiansOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("MATH METHODS");

        largestField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largestField2ActionPerformed(evt);
            }
        });

        largestButton.setText("Largest");
        largestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largestButtonActionPerformed(evt);
            }
        });

        smallestField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallestField2ActionPerformed(evt);
            }
        });

        smallestButton.setText("Smallest");
        smallestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallestButtonActionPerformed(evt);
            }
        });

        powerOfField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerOfField2ActionPerformed(evt);
            }
        });

        powerOfButton.setText("Power Of");
        powerOfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerOfButtonActionPerformed(evt);
            }
        });

        hypotenuseButton.setText("Hypotenuse");
        hypotenuseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypotenuseButtonActionPerformed(evt);
            }
        });

        hypotenuseField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypotenuseField2ActionPerformed(evt);
            }
        });

        roundedDownButton.setText("Rounded Down");
        roundedDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedDownButtonActionPerformed(evt);
            }
        });

        roundedUpButton.setText("Rounded Up");
        roundedUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedUpButtonActionPerformed(evt);
            }
        });

        squareRootButton.setText("Square Root");
        squareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootButtonActionPerformed(evt);
            }
        });

        inRadiansButton.setText("In Radians");
        inRadiansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inRadiansButtonActionPerformed(evt);
            }
        });

        roundedDownField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedDownFieldActionPerformed(evt);
            }
        });

        inRadiansField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inRadiansFieldActionPerformed(evt);
            }
        });

        largestOutput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        largestOutput.setText("...");

        smallestOutput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        smallestOutput.setText("...");

        powerOfOutput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        powerOfOutput.setText("...");

        hypotenuseOutput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hypotenuseOutput.setText("...");

        roundedDownOutput.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roundedDownOutput.setText("...");

        roundedUpOutput.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roundedUpOutput.setText("...");

        squareRootOutput.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        squareRootOutput.setText("...");

        inRadiansOutput.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        inRadiansOutput.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(largestField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(largestField2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(smallestField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(smallestField2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(powerOfField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(powerOfField2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hypotenuseField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hypotenuseField2))
                    .addComponent(smallestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(powerOfButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hypotenuseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(largestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                        .addComponent(roundedDownField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(inRadiansField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(squareRootField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(roundedUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(powerOfOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(largestOutput)
                                            .addGap(0, 67, Short.MAX_VALUE))
                                        .addComponent(smallestOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(hypotenuseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(281, 281, 281)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inRadiansOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(roundedUpOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundedDownOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(squareRootOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inRadiansButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(squareRootButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundedUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundedDownButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(104, 104, 104))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(largestField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundedDownField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(largestField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(largestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(largestOutput)
                    .addComponent(roundedDownOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(smallestField1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(roundedUpField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(smallestField2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smallestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smallestOutput)
                    .addComponent(roundedUpOutput))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(powerOfField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(squareRootField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(powerOfField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powerOfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareRootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerOfOutput)
                    .addComponent(squareRootOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hypotenuseField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hypotenuseField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inRadiansField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hypotenuseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inRadiansButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hypotenuseOutput)
                    .addComponent(inRadiansOutput))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void largestField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largestField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largestField2ActionPerformed

    private void smallestField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallestField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smallestField2ActionPerformed

    private void powerOfField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerOfField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powerOfField2ActionPerformed

    private void hypotenuseField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypotenuseField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hypotenuseField2ActionPerformed

    private void largestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largestButtonActionPerformed
        
        //Math class calculation for choosing largest number
        double one = Double.parseDouble(largestField1.getText()); //Store number in field 1
        double two = Double.parseDouble(largestField2.getText()); //Store number in field 2
        
        largestOutput.setText(String.valueOf(Math.max(one, two))); //Perform calculation and display output

    }//GEN-LAST:event_largestButtonActionPerformed

    private void roundedDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedDownButtonActionPerformed
        
        //Math class calculation for rounding down to nearest whole
        roundedDownOutput.setText(String.valueOf(Math.floor(Double.parseDouble(roundedDownField.getText()))));
        
    }//GEN-LAST:event_roundedDownButtonActionPerformed

    private void squareRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootButtonActionPerformed
        
        //Math class calculation for square root
        double rounded = Math.sqrt(Double.parseDouble(squareRootField.getText()));
        rounded = rounded * 1000;
        rounded = Math.round(rounded);
        rounded = rounded/1000;
        squareRootOutput.setText(String.valueOf(rounded));
        
    }//GEN-LAST:event_squareRootButtonActionPerformed

    private void roundedDownFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedDownFieldActionPerformed
        
    }//GEN-LAST:event_roundedDownFieldActionPerformed

    private void inRadiansFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inRadiansFieldActionPerformed
        
    }//GEN-LAST:event_inRadiansFieldActionPerformed

    private void smallestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallestButtonActionPerformed
        
        //Math class calculation for choosing smallest number
        double one = Double.parseDouble(smallestField1.getText()); //Store number in field 1
        double two = Double.parseDouble(smallestField2.getText()); //Store number in field 2
        
        smallestOutput.setText(String.valueOf(Math.min(one, two))); //Perform calculation and display output
        
    }//GEN-LAST:event_smallestButtonActionPerformed

    private void powerOfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerOfButtonActionPerformed
        
        //Math class calculation for powers
        double one = Double.parseDouble(powerOfField1.getText()); //Store number in field 1
        double two = Double.parseDouble(powerOfField2.getText()); //Store number in field 2
        
        powerOfOutput.setText(String.valueOf(Math.pow(one, two))); //Perfrom calculation and display output
        
    }//GEN-LAST:event_powerOfButtonActionPerformed

    private void hypotenuseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypotenuseButtonActionPerformed
        
        //Math class calculation for hypotenuse
        double one = Double.parseDouble(hypotenuseField1.getText()); //Store number in field 1
        double two = Double.parseDouble(hypotenuseField2.getText()); //Store number in field 2
        
        hypotenuseOutput.setText(String.valueOf(Math.hypot(one, two))); //Perform calculation and display output
        
    }//GEN-LAST:event_hypotenuseButtonActionPerformed

    private void inRadiansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inRadiansButtonActionPerformed
        
        //Math class calculation for converting to radians
        double rounded = Math.toRadians(Double.parseDouble(inRadiansField.getText()));
        rounded = rounded * 1000;
        rounded = Math.round(rounded);
        rounded = rounded / 1000;
        inRadiansOutput.setText(String.valueOf(rounded));
        
    }//GEN-LAST:event_inRadiansButtonActionPerformed

    private void roundedUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedUpButtonActionPerformed
        
        //Math class calculation for rounding up to nearset whole
        roundedUpOutput.setText(String.valueOf(Math.ceil(Double.parseDouble(roundedUpField.getText()))));
        
    }//GEN-LAST:event_roundedUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathMethodsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hypotenuseButton;
    private javax.swing.JTextField hypotenuseField1;
    private javax.swing.JTextField hypotenuseField2;
    private javax.swing.JLabel hypotenuseOutput;
    private javax.swing.JButton inRadiansButton;
    private javax.swing.JTextField inRadiansField;
    private javax.swing.JLabel inRadiansOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton largestButton;
    private javax.swing.JTextField largestField1;
    private javax.swing.JTextField largestField2;
    private javax.swing.JLabel largestOutput;
    private javax.swing.JButton powerOfButton;
    private javax.swing.JTextField powerOfField1;
    private javax.swing.JTextField powerOfField2;
    private javax.swing.JLabel powerOfOutput;
    private javax.swing.JButton roundedDownButton;
    private javax.swing.JTextField roundedDownField;
    private javax.swing.JLabel roundedDownOutput;
    private javax.swing.JButton roundedUpButton;
    private javax.swing.JTextField roundedUpField;
    private javax.swing.JLabel roundedUpOutput;
    private javax.swing.JButton smallestButton;
    private javax.swing.JTextField smallestField1;
    private javax.swing.JTextField smallestField2;
    private javax.swing.JLabel smallestOutput;
    private javax.swing.JButton squareRootButton;
    private javax.swing.JTextField squareRootField;
    private javax.swing.JLabel squareRootOutput;
    // End of variables declaration//GEN-END:variables
}
