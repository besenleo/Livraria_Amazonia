/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControleAutor;
import control.ControleEditora;
import control.ControleLivro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Autor;
import model.Editora;
import model.Livro;
import java.util.Set;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;


public class EditarLivro extends javax.swing.JFrame {
    
    ControleAutor controleAutor;
    ControleEditora controleEditora;
    ControleLivro controleLivro;
    Set<Autor> autores;
    Editora editora;
    Livro livro;
    DefaultComboBoxModel modelCombo;
    
    /**
     * Creates new form AdicionarLivro
     */
    public EditarLivro() {
        controleAutor = new ControleAutor();
        controleEditora = new ControleEditora();
        controleLivro = new ControleLivro();
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

        jLblTituloPagina = new javax.swing.JLabel();
        jLblTitulo = new javax.swing.JLabel();
        jTxtTitulo = new javax.swing.JTextField();
        jLblPreco = new javax.swing.JLabel();
        jTxtPreco = new javax.swing.JTextField();
        jBtnEditar = new javax.swing.JButton();
        jLblEditora = new javax.swing.JLabel();
        jLblCodigo = new javax.swing.JLabel();
        jCbxEditora = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListLivros = new javax.swing.JList<>();
        jLblInstrucao = new javax.swing.JLabel();
        jLblInstrucao2 = new javax.swing.JLabel();
        jLblCodigoBarras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLblTituloPagina.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLblTituloPagina.setText("Editar Livro");

        jLblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblTitulo.setText("Titulo:");

        jTxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTituloActionPerformed(evt);
            }
        });

        jLblPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblPreco.setText("Preço:");

        jBtnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnEditar.setText("Editar Livro");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jLblEditora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblEditora.setText("Selecione a Editora:");

        jLblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblCodigo.setText("Código de Barras:");

        jListLivros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListLivrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListLivros);

        jLblInstrucao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblInstrucao.setText("Selecione o livro que você deseja editar:");

        jLblInstrucao2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblInstrucao2.setText("Adicione o novos valores:");

        jLblCodigoBarras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblTitulo)
                            .addComponent(jLblPreco)
                            .addComponent(jLblCodigo)
                            .addComponent(jLblEditora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtTitulo)
                                .addComponent(jCbxEditora, 0, 395, Short.MAX_VALUE))
                            .addComponent(jLblCodigoBarras)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblInstrucao)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblInstrucao2))))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLblTituloPagina)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTituloPagina)
                .addGap(37, 37, 37)
                .addComponent(jLblInstrucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLblInstrucao2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodigo)
                    .addComponent(jLblCodigoBarras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTitulo)
                    .addComponent(jTxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPreco)
                    .addComponent(jTxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEditora)
                    .addComponent(jCbxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTituloActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Adicionando os Livros cadastrados na JList de livros
        DefaultListModel listModel = new DefaultListModel();
        List listLivro = new ArrayList();
        listLivro = controleLivro.carregarLivros();
        if (listLivro != null) {
            Iterator i = listLivro.iterator();
            while (i.hasNext()) {
                Livro livroList = (Livro) i.next();
                listModel.addElement(livroList);
            }
            jListLivros.setModel(listModel);
        }
        
        //Adicionando conteudo na JList de editoras
        modelCombo = new DefaultComboBoxModel();
        List listEditora = controleEditora.carregarEditora();
        if (listEditora != null) {
            Iterator j = listEditora.iterator();
            while (j.hasNext()) {
                Editora editoraList = (Editora) j.next();
                modelCombo.addElement(editoraList);
            }
            jCbxEditora.setModel(modelCombo);
        }

    }//GEN-LAST:event_formWindowActivated

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        editora = (Editora) jCbxEditora.getSelectedItem();
        
        // Verifica se a lista de index e o index da editora estao vazios 
        if(livro != null){
            //Remove espaços desnecessarios do campos
            jTxtTitulo.setText(jTxtTitulo.getText().trim());
            jTxtPreco.setText(jTxtPreco.getText().trim());
            
            // Faz uma ultima validaçao nos campos necessarios para adição
            if(!jTxtTitulo.getText().isEmpty() && !jTxtPreco.getText().isEmpty()){
                //Instancia o livro e adiciona no banco
                Livro livro = new Livro();
                livro.setIsbn(livro.getIsbn());
                livro.setTitulo(jTxtTitulo.getText());
                livro.setPreco(Float.parseFloat(jTxtPreco.getText()));
                livro.setEditora(editora);
                livro.setAutores(livro.getAutores());
                
                if(controleLivro.alterarLivro(livro)){
                    JOptionPane.showMessageDialog(null, "Livro editado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possivel editar o livro!");
                };
            }else{
                JOptionPane.showMessageDialog(null, "Voce deixou de preencher ou selecionar algum campo!");
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Voce NÃO selecionou um livro!");
        }   
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jListLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListLivrosMouseClicked
        int index = jListLivros.getSelectedIndex();
        
        if (index != -1){  
        
            DefaultListModel dlm = (DefaultListModel) jListLivros.getModel();
            Livro livro = (Livro) dlm.getElementAt(index);
            
            jLblCodigoBarras.setText("");
            jTxtTitulo.setText("");
            jTxtPreco.setText("");
        
            if (livro != null) {
                jLblCodigoBarras.setText(livro.getIsbn());
                jTxtTitulo.setText(livro.getTitulo());
                jTxtPreco.setText(Float.toString(livro.getPreco()));
                jCbxEditora.setSelectedIndex(modelCombo.getIndexOf(livro.getEditora()));
            } else {
                JOptionPane.showMessageDialog(null, "Livro não Encontrado!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Livro!");
        }
    }//GEN-LAST:event_jListLivrosMouseClicked

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
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JComboBox<String> jCbxEditora;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblCodigoBarras;
    private javax.swing.JLabel jLblEditora;
    private javax.swing.JLabel jLblInstrucao;
    private javax.swing.JLabel jLblInstrucao2;
    private javax.swing.JLabel jLblPreco;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JLabel jLblTituloPagina;
    private javax.swing.JList<String> jListLivros;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtPreco;
    private javax.swing.JTextField jTxtTitulo;
    // End of variables declaration//GEN-END:variables
}