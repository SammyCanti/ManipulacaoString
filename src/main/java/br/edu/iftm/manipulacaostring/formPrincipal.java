/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.iftm.manipulacaostring;

import javax.swing.JOptionPane;

/**
 *
 * @author IFTM
 */
public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    public formPrincipal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        inserirT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vogal = new javax.swing.JButton();
        consoante = new javax.swing.JButton();
        inverter = new javax.swing.JButton();
        tamanho = new javax.swing.JButton();
        palin = new javax.swing.JButton();
        crip = new javax.swing.JButton();
        descri = new javax.swing.JButton();
        valorN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Txt_IV50", 1, 18)); // NOI18N
        jLabel1.setText("MANIPULAÇÃO DE STRING");

        inserirT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirTActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite a string:");

        vogal.setText("VOGAIS");
        vogal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vogalActionPerformed(evt);
            }
        });

        consoante.setText("CONSOANTE");
        consoante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consoanteActionPerformed(evt);
            }
        });

        inverter.setText("INVERTER");
        inverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverterActionPerformed(evt);
            }
        });

        tamanho.setText("TAMANHO");
        tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoActionPerformed(evt);
            }
        });

        palin.setText("PALÍNDROMO");
        palin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palinActionPerformed(evt);
            }
        });

        crip.setText("CRIPTOGRAFAR");
        crip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cripActionPerformed(evt);
            }
        });

        descri.setText("DESCRIPTOGRAFAR");

        valorN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorNActionPerformed(evt);
            }
        });

        jLabel3.setText("Informe um valor para n:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vogal, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(consoante, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crip, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descri, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inverter, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(palin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(valorN, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(inserirT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vogal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consoante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inverter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(crip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirTActionPerformed

    private void vogalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vogalActionPerformed
        String string = inserirT.getText();
        int vogais = ManipulacaoString.Vogais(string);
        JOptionPane.showMessageDialog(this, "Quantidade de vogais na String: " + vogais);
        
    }//GEN-LAST:event_vogalActionPerformed

    private void consoanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consoanteActionPerformed
       String string = inserirT.getText();
       int consoantes = ManipulacaoString.Consoantes(string);
       JOptionPane.showMessageDialog(this, "Quantidade de consoantes na String: " + consoantes);
    }//GEN-LAST:event_consoanteActionPerformed

    private void tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoActionPerformed
        String string = inserirT.getText();
        int tamanho = ManipulacaoString.Tamanho(string);
        JOptionPane.showMessageDialog(this, "O tamanho da String é: " + tamanho);
    }//GEN-LAST:event_tamanhoActionPerformed

    private void inverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverterActionPerformed
        String string = inserirT.getText();
        String inverter = ManipulacaoString.Inverter(string);
        JOptionPane.showMessageDialog(this, "O inverso da String é: " + inverter);
    }//GEN-LAST:event_inverterActionPerformed

    private void palinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palinActionPerformed
        String string = inserirT.getText();
        boolean palin = ManipulacaoString.Palindromo(string);
        if(palin == true){
            JOptionPane.showMessageDialog(this, "É um palíndromo");
        } else
             JOptionPane.showMessageDialog(this, "Não é um palíndromo");
    }//GEN-LAST:event_palinActionPerformed

    private void valorNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorNActionPerformed

    private void cripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cripActionPerformed
        String string = inserirT.getText();
        int n = Integer.parseInt(valorN.getText());
        String resul = ManipulacaoString.Criptografar(string, n);
        JOptionPane.showMessageDialog(this, "String criptografada: " +resul);
        
    }//GEN-LAST:event_cripActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consoante;
    private javax.swing.JButton crip;
    private javax.swing.JButton descri;
    private javax.swing.JTextField inserirT;
    private javax.swing.JButton inverter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton palin;
    private javax.swing.JButton tamanho;
    private javax.swing.JTextField valorN;
    private javax.swing.JButton vogal;
    // End of variables declaration//GEN-END:variables
}
