package view;

import control.ControleAutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Autor;

public class EditarAutor extends javax.swing.JFrame {
    
    ControleAutor controleAutor;
    Autor autor;

    public EditarAutor() {
        controleAutor = new ControleAutor();
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
        jLblSobrenome = new javax.swing.JLabel();
        jTxtSobrenome = new javax.swing.JTextField();
        jBtnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAutores = new javax.swing.JList<>();
        jLblInstrucao1 = new javax.swing.JLabel();
        jLblInstrucao2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLblTitulo.setText("Editar Autor");

        jLblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblNome.setText("Nome:");

        jTxtNome.setToolTipText("");

        jLblSobrenome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblSobrenome.setText("Sobrenome:");

        jBtnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnEditar.setText("Editar Autor");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jListAutores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListAutores);

        jLblInstrucao1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblInstrucao1.setText("Selecione o autor que deseja editar:");

        jLblInstrucao2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblInstrucao2.setText("Adicione os novos valores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblInstrucao1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblInstrucao2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblNome)
                            .addComponent(jLblSobrenome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNome)
                            .addComponent(jTxtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLblTitulo)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLblInstrucao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLblInstrucao2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNome)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSobrenome)
                    .addComponent(jTxtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // Editando o conteúdo do autor selecionado na JList
        DefaultListModel dlm = (DefaultListModel) jListAutores.getModel();
        autor = (Autor) dlm.getElementAt(jListAutores.getSelectedIndex());
        if (autor != null) {
            autor.setNome(jTxtNome.getText());
            autor.setfNome(jTxtSobrenome.getText());
            
            if (controleAutor.alterarAutor(autor)) {
                JOptionPane.showMessageDialog(null, "Autor atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel atualizar o autor");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Autor não Encontrado!");
        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Adicionando conteúdo na JList de autores
        DefaultListModel listModel = new DefaultListModel();
        List listAutor = new ArrayList();
        listAutor = controleAutor.carregarAutores();
        if (listAutor != null) {
            Iterator i = listAutor.iterator();
            while (i.hasNext()) {
                Autor deptList = (Autor) i.next();
                listModel.addElement(deptList);
            }
            jListAutores.setModel(listModel);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jListAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAutoresMouseClicked
        //Adicionando os valores do objeto selecionado na JList dos autores nos TextFields
        int index = jListAutores.getSelectedIndex();
        if (index != -1){  
        
            DefaultListModel dlm = (DefaultListModel) jListAutores.getModel();
            autor = (Autor) dlm.getElementAt(index);
        
            if (autor != null) {
                jTxtNome.setText(autor.getNome());
                jTxtSobrenome.setText(autor.getfNome());
            } else {
                JOptionPane.showMessageDialog(null, "Autor não Encontrado!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um autor!");
        }
    }//GEN-LAST:event_jListAutoresMouseClicked

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
            java.util.logging.Logger.getLogger(EditarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JLabel jLblInstrucao1;
    private javax.swing.JLabel jLblInstrucao2;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSobrenome;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JList<String> jListAutores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSobrenome;
    // End of variables declaration//GEN-END:variables
}
