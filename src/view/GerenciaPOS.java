/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.ProjetoOS;
import servicos.ProjetoOSServico;
import servicos.ServicosFactory;

/**
 *
 * @author 182310076
 */
public class GerenciaPOS extends javax.swing.JFrame {

    /**
     * Creates new form GerenciaPOS
     */
    int idEdit;

    public GerenciaPOS() {
        initComponents();
        addRowToTablePOS();
    }

    private void limpaCamposPOS() {
        jTextFieldDataInicio.setText("");
        jTextFieldDataFim.setText("");
        jTextFieldCondicao.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldLinkUnboxing.setText("");
        jTextFieldCliente.setText("");
        jTextFieldTecnico.setText("");
    }

    private void addRowToTablePOS() {
        //pega a modelagem da tabela na interface gráfica
        DefaultTableModel model = (DefaultTableModel) jTablePOS.getModel();
        model.getDataVector().removeAllElements();// remove todas as linhas
        model.fireTableDataChanged();
        // cria vetor de 7 posições que corresponde as colunas da tabela
        Object rowData[] = new Object[8];
        ProjetoOSServico posS = ServicosFactory.getProjetoOSServico();
        // percorrer lista e popula vetor e add vetor a tabela
        for (ProjetoOS ProjetoOS : posS.listaProjetoOSs()) {
            rowData[0] = ProjetoOS.getIDOs();
            rowData[1] = ProjetoOS.getCondicao();
            rowData[2] = ProjetoOS.getDescricao();
            rowData[3] = ProjetoOS.getLinkUnboxing();
            rowData[4] = ProjetoOS.getDataInicio();
            rowData[5] = ProjetoOS.getDataFim();
            rowData[6] = ProjetoOS.getfk_Cliente_IDUsuario();
            rowData[7] = ProjetoOS.getfk_Tecnico_IDTecnico();
            model.addRow(rowData);
        }
    }

    private boolean validaInputsPOS() {
        return true;
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPaneListaProjeto = new javax.swing.JScrollPane();
        jTablePOS = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldTecnico = new javax.swing.JTextField();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonEditarPOS = new javax.swing.JButton();
        jButtonSalvarPOS = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCancelarPOS = new javax.swing.JButton();
        jTextFieldDataFim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDataInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldLinkUnboxing = new javax.swing.JTextField();
        jTextFieldCondicao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerenciar Projeto/Ordens de Serviço");

        jTablePOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Condição", "Descrição", "Unboxing", "Data de Criação", "Data de Finalização", "Técnico", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneListaProjeto.setViewportView(jTablePOS);
        if (jTablePOS.getColumnModel().getColumnCount() > 0) {
            jTablePOS.getColumnModel().getColumn(0).setResizable(false);
            jTablePOS.getColumnModel().getColumn(1).setResizable(false);
            jTablePOS.getColumnModel().getColumn(2).setResizable(false);
            jTablePOS.getColumnModel().getColumn(3).setResizable(false);
            jTablePOS.getColumnModel().getColumn(4).setResizable(false);
            jTablePOS.getColumnModel().getColumn(5).setResizable(false);
            jTablePOS.getColumnModel().getColumn(6).setResizable(false);
            jTablePOS.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel2.setText("Data de Finalização:");

        jLabel3.setText("Técnico:");

        jLabel4.setText("Condição:");

        jLabel5.setText("Descrição:");

        jLabel6.setText("Cliente:");

        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jTextFieldTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTecnicoActionPerformed(evt);
            }
        });

        jButtonEditarPOS.setText("Editar");
        jButtonEditarPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPOSActionPerformed(evt);
            }
        });

        jButtonSalvarPOS.setText("Salvar");
        jButtonSalvarPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarPOSActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonCancelarPOS.setText("Cancelar");
        jButtonCancelarPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPOSActionPerformed(evt);
            }
        });

        jTextFieldDataFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataFimActionPerformed(evt);
            }
        });

        jLabel7.setText("Data de Inicio:");

        jTextFieldDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataInicioActionPerformed(evt);
            }
        });

        jLabel8.setText("Link Unboxing");

        jTextFieldLinkUnboxing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLinkUnboxingActionPerformed(evt);
            }
        });

        jTextFieldCondicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCondicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDataFim))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCondicao))
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEditarPOS)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvarPOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarPOS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLinkUnboxing, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldDataInicio))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneListaProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLinkUnboxing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneListaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEditarPOS)
                        .addComponent(jButtonSalvarPOS)
                        .addComponent(jButtonCancelarPOS))
                    .addComponent(jButtonVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jButtonEditarPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPOSActionPerformed
        // TODO add your handling code here:
        jButtonSalvarPOS.setText("Atualizar");
        jButtonCancelarPOS.setVisible(true);

        int linha = jTablePOS.getSelectedRow();
        idEdit = (int) jTablePOS.getValueAt(linha, 0);
        ProjetoOSServico POSs = ServicosFactory.getProjetoOSServico();
        ProjetoOS POS = POSs.getProjetoOSById(idEdit);
        jTextFieldDataInicio.setText(POS.getDataInicio());
        jTextFieldDataFim.setText(POS.getDataFim());
        jTextFieldCondicao.setText(POS.getCondicao());
        jTextFieldDescricao.setText(POS.getDescricao());
        jTextFieldLinkUnboxing.setText(POS.getLinkUnboxing());
        jTextFieldTecnico.setText(String.valueOf(POS.getfk_Cliente_IDUsuario()));
        jTextFieldCliente.setText(String.valueOf(POS.getfk_Tecnico_IDTecnico()));
    }//GEN-LAST:event_jButtonEditarPOSActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSalvarPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarPOSActionPerformed
        // TODO add your handling code here:
        if (jButtonSalvarPOS.getText().equals("Salvar")) {
            //salvar
            if (validaInputsPOS()) {
                try {
                    // Verificar se os campos que devem ser inteiros contêm apenas números
                    int tecnicoID = Integer.parseInt(jTextFieldTecnico.getText());
                    int clienteID = Integer.parseInt(jTextFieldCliente.getText());

                    ProjetoOS pos = new ProjetoOS();
                    pos.setCondicao(jTextFieldCondicao.getText());
                    pos.setDescricao(jTextFieldDescricao.getText());
                    pos.setLinkUnboxing(jTextFieldLinkUnboxing.getText());
                    pos.setDataInicio(jTextFieldDataInicio.getText());
                    pos.setDataFim(jTextFieldDataFim.getText());
                    pos.setfk_Tecnico_IDTecnico(tecnicoID);  // Aqui já está convertendo corretamente
                    pos.setfk_Cliente_IDUsuario(clienteID);   // Aqui também

                    ProjetoOSServico POSs = ServicosFactory.getProjetoOSServico();
                    POSs.cadastrarProjetoOS(pos);
                    addRowToTablePOS();
                    limpaCamposPOS();
                } catch (NumberFormatException e) {
                    // Exibir mensagem de erro se os campos técnico ou cliente não forem numéricos
                    JOptionPane.showMessageDialog(null, "Os campos Técnico e Cliente devem conter apenas números!", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            //update
            try {
                int tecnicoID = Integer.parseInt(jTextFieldTecnico.getText());
                int clienteID = Integer.parseInt(jTextFieldCliente.getText());

                ProjetoOS posS = new ProjetoOS();
                posS.setIDOs(idEdit);
                posS.setDataInicio(jTextFieldDataInicio.getText());
                posS.setDataFim(jTextFieldDataFim.getText());
                posS.setCondicao(jTextFieldCondicao.getText());
                posS.setDescricao(jTextFieldDescricao.getText());
                posS.setLinkUnboxing(jTextFieldLinkUnboxing.getText());
                posS.setfk_Tecnico_IDTecnico(tecnicoID);
                posS.setfk_Cliente_IDUsuario(clienteID);
                ProjetoOSServico POSs = ServicosFactory.getProjetoOSServico();
                POSs.atualizaProjetoOS(posS);
                addRowToTablePOS();
                JOptionPane.showMessageDialog(this, "Projeto/Ordem de Serviço atualizado com sucesso!!");
                //jBDefault();
                limpaCamposPOS();
            } catch (NumberFormatException e) {
                // Exibir mensagem de erro se os campos técnico ou cliente não forem numéricos
                JOptionPane.showMessageDialog(null, "Os campos Técnico e Cliente devem conter apenas números!", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSalvarPOSActionPerformed

    private void jButtonCancelarPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPOSActionPerformed
        // TODO add your handling code here:
        limpaCamposPOS();
    }//GEN-LAST:event_jButtonCancelarPOSActionPerformed

    private void jTextFieldDataFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataFimActionPerformed

    private void jTextFieldDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataInicioActionPerformed

    private void jTextFieldTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTecnicoActionPerformed

    private void jTextFieldLinkUnboxingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLinkUnboxingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLinkUnboxingActionPerformed

    private void jTextFieldCondicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCondicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCondicaoActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarPOS;
    private javax.swing.JButton jButtonEditarPOS;
    private javax.swing.JButton jButtonSalvarPOS;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneListaProjeto;
    private javax.swing.JTable jTablePOS;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCondicao;
    private javax.swing.JTextField jTextFieldDataFim;
    private javax.swing.JTextField jTextFieldDataInicio;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldLinkUnboxing;
    private javax.swing.JTextField jTextFieldTecnico;
    // End of variables declaration//GEN-END:variables
}
