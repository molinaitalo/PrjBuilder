/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

/**
 *
 * @author Matheus
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuListagem = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elementosGraficos/Cake Land.png"))); // NOI18N

        jMenuListagem.setText("Listagem");
        jMenuListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListagemActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuListagem);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuCadastro);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListagemActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listagem().setModal(true);
                new listagem().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuListagemActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setModal(true);
                new cadastro().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sobre().setModal(true);
                new sobre().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuSobreActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuListagem;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}