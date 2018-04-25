package imd.calc;

import java.awt.event.KeyEvent;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTela = new javax.swing.JLabel();
        bntMult = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bnt9 = new javax.swing.JButton();
        bnt8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bnt4 = new javax.swing.JButton();
        bnt7 = new javax.swing.JButton();
        bnt5 = new javax.swing.JButton();
        bntSub = new javax.swing.JButton();
        bntPonto = new javax.swing.JButton();
        bntSoma = new javax.swing.JButton();
        bnt6 = new javax.swing.JButton();
        bntIgual = new javax.swing.JButton();
        bnt0 = new javax.swing.JButton();
        bnt2 = new javax.swing.JButton();
        bntCE = new javax.swing.JButton();
        bnt1 = new javax.swing.JButton();
        bnt3 = new javax.swing.JButton();
        bntDivi = new javax.swing.JButton();
        bntC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        txtTela.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtTela.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntMult.setText("X");
        bntMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMultActionPerformed(evt);
            }
        });

        jButton2.setText("±");

        bnt9.setText("9");
        bnt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt9ActionPerformed(evt);
            }
        });

        bnt8.setText("8");
        bnt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt8ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bnt4.setText("4");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });

        bnt7.setText("7");
        bnt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt7ActionPerformed(evt);
            }
        });

        bnt5.setText("5");
        bnt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt5ActionPerformed(evt);
            }
        });

        bntSub.setText("-");
        bntSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSubActionPerformed(evt);
            }
        });

        bntPonto.setText(".");
        bntPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPontoActionPerformed(evt);
            }
        });

        bntSoma.setText("+");
        bntSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSomaActionPerformed(evt);
            }
        });

        bnt6.setText("6");
        bnt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt6ActionPerformed(evt);
            }
        });

        bntIgual.setText("=");
        bntIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIgualActionPerformed(evt);
            }
        });

        bnt0.setText("0");
        bnt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt0ActionPerformed(evt);
            }
        });

        bnt2.setText("2");
        bnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt2ActionPerformed(evt);
            }
        });

        bntCE.setText("CE");
        bntCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCEActionPerformed(evt);
            }
        });

        bnt1.setText("1");
        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });

        bnt3.setText("3");
        bnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt3ActionPerformed(evt);
            }
        });

        bntDivi.setText("÷");
        bntDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDiviActionPerformed(evt);
            }
        });

        bntC.setText("C");
        bntC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntCE, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(8, 8, 8)
                        .addComponent(bntDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bnt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnt4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnt7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnt2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(bnt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnt0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnt9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntMult, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTela, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntCE)
                    .addComponent(bntDivi)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntC)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt4)
                            .addComponent(bnt5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt1)
                            .addComponent(bnt2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(bnt0)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bnt9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bnt6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bnt3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bntPonto))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bntMult)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bntSub)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bntSoma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bntIgual)))
                    .addComponent(bnt8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Double valor1, valor2;
    String sinal;
    
    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        txtTela.setText(txtTela.getText()+"1");
    }//GEN-LAST:event_bnt1ActionPerformed

    private void bnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt2ActionPerformed
        txtTela.setText(txtTela.getText()+"2");
    }//GEN-LAST:event_bnt2ActionPerformed

    private void bnt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt3ActionPerformed
        txtTela.setText(txtTela.getText()+"3");
    }//GEN-LAST:event_bnt3ActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
        txtTela.setText(txtTela.getText()+"4");
    }//GEN-LAST:event_bnt4ActionPerformed

    private void bnt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt5ActionPerformed
        txtTela.setText(txtTela.getText()+"5");
    }//GEN-LAST:event_bnt5ActionPerformed

    private void bnt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt6ActionPerformed
        txtTela.setText(txtTela.getText()+"6");
    }//GEN-LAST:event_bnt6ActionPerformed

    private void bnt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt7ActionPerformed
        txtTela.setText(txtTela.getText()+"7");
    }//GEN-LAST:event_bnt7ActionPerformed

    private void bnt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt8ActionPerformed
        txtTela.setText(txtTela.getText()+"8");
    }//GEN-LAST:event_bnt8ActionPerformed

    private void bnt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt9ActionPerformed
        txtTela.setText(txtTela.getText()+"9");
    }//GEN-LAST:event_bnt9ActionPerformed

    private void bnt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt0ActionPerformed
        txtTela.setText(txtTela.getText()+"0");
    }//GEN-LAST:event_bnt0ActionPerformed

    private void bntPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPontoActionPerformed
        // TODO add your handling code here:
        txtTela.setText(txtTela.getText()+".");
    }//GEN-LAST:event_bntPontoActionPerformed

    private void bntSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSomaActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtTela.getText());
        txtTela.setText("");
        sinal = "soma";
    }//GEN-LAST:event_bntSomaActionPerformed

    private void bntSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSubActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtTela.getText());
        txtTela.setText("");
        sinal = "sub";        
    }//GEN-LAST:event_bntSubActionPerformed

    private void bntDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDiviActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtTela.getText());
        txtTela.setText("");
        sinal = "divi";
    }//GEN-LAST:event_bntDiviActionPerformed

    private void bntMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMultActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtTela.getText());
        txtTela.setText("");
        sinal = "multi";        
    }//GEN-LAST:event_bntMultActionPerformed

    private void bntCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCActionPerformed
        // TODO add your handling code here:
        valor1 = null;
        valor2 = null;
        txtTela.setText("");
    }//GEN-LAST:event_bntCActionPerformed

    private void bntCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCEActionPerformed
        // TODO add your handling code here:
        txtTela.setText("");
    }//GEN-LAST:event_bntCEActionPerformed

    private void bntIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIgualActionPerformed
        valor2 = Double.parseDouble(txtTela.getText());
        if (null != sinal) switch (sinal) {
            case "soma":
                txtTela.setText(String.valueOf(valor1+valor2));
                break;
            case "sub":
                txtTela.setText(String.valueOf(valor1-valor2));
                break;
            case "divi":
                txtTela.setText(String.valueOf(valor1/valor2));
                break;
            case "multi":
                txtTela.setText(String.valueOf(valor1*valor2));
                break;
            default:
                break;
        } 
    }//GEN-LAST:event_bntIgualActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int fat = (int) Double.parseDouble(txtTela.getText());
        int i = fat -1;
        while (fat > 0){
            fat = fat * i;
            i++;
        }
        txtTela.setText(String.valueOf(fat));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch (evt.getKeyCode()){
            case KeyEvent.VK_0:
                txtTela.setText(txtTela.getText()+"0");
                break;
            case KeyEvent.VK_1:
                txtTela.setText(txtTela.getText()+"1");
                break;
            case KeyEvent.VK_2:
                txtTela.setText(txtTela.getText()+"2");
                break;
            case KeyEvent.VK_3:
                txtTela.setText(txtTela.getText()+"3");
                break;
            case KeyEvent.VK_4:
                txtTela.setText(txtTela.getText()+"4");
                break;
            case KeyEvent.VK_5:
                txtTela.setText(txtTela.getText()+"5");
                break;
            case KeyEvent.VK_6:
                txtTela.setText(txtTela.getText()+"6");
                break;
            case KeyEvent.VK_7:
                txtTela.setText(txtTela.getText()+"7");
                break;
            case KeyEvent.VK_8:
                txtTela.setText(txtTela.getText()+"8");
                break;
            case KeyEvent.VK_9:
                txtTela.setText(txtTela.getText()+"9");
                break;
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt0;
    private javax.swing.JButton bnt1;
    private javax.swing.JButton bnt2;
    private javax.swing.JButton bnt3;
    private javax.swing.JButton bnt4;
    private javax.swing.JButton bnt5;
    private javax.swing.JButton bnt6;
    private javax.swing.JButton bnt7;
    private javax.swing.JButton bnt8;
    private javax.swing.JButton bnt9;
    private javax.swing.JButton bntC;
    private javax.swing.JButton bntCE;
    private javax.swing.JButton bntDivi;
    private javax.swing.JButton bntIgual;
    private javax.swing.JButton bntMult;
    private javax.swing.JButton bntPonto;
    private javax.swing.JButton bntSoma;
    private javax.swing.JButton bntSub;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel txtTela;
    // End of variables declaration//GEN-END:variables
}
