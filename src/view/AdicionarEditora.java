package view;

import control.ControleEditora;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Editora;

public class AdicionarEditora extends javax.swing.JFrame {

    Editora editora;
    ControleEditora controleEditora;
    
    public AdicionarEditora() {
        controleEditora = new ControleEditora();
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

        jLblTitulo = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLblURL = new javax.swing.JLabel();
        jTxtURL = new javax.swing.JTextField();
        jBtnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLblTitulo.setText("Adicionar Editora");

        jLblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblNome.setText("Nome:");

        jLblURL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblURL.setText("URL:");

        jBtnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnAdicionar.setText("Adicionar Editora");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblNome)
                            .addComponent(jLblURL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jTxtURL))))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTitulo)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNome))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblURL)
                    .addComponent(jTxtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        //Remove espaços desnecessarios do campos
        jTxtNome.setText(jTxtNome.getText().trim());
        jTxtURL.setText(jTxtURL.getText().trim());
        
        /**Validação dos campos**/
        if(jTxtNome.getText().isEmpty() || jTxtURL.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Você deixou de preencher ou selecionar algum campo!");
        }else if(jTxtNome.getText().length() > 30 || jTxtNome.getText().length() <= 0){
            JOptionPane.showMessageDialog(null, "O nome da editora deve conter 1 até 25 caracteres.");
        }else if(jTxtURL.getText().length() > 80 || jTxtURL.getText().length() < 5){
            JOptionPane.showMessageDialog(null, "A URL da editora deve conter 1 até 80 caracteres.");
        }else{
            editora = new Editora();
        
            editora.setNome(jTxtNome.getText());
            editora.setUrl(jTxtURL.getText());
        
            if(controleEditora.gravarEditora(editora) == 1){
                JOptionPane.showMessageDialog(null, "Editora cadastrada com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar a editora!");
            }
        }
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JLabel jLblURL;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtURL;
    // End of variables declaration//GEN-END:variables
}
