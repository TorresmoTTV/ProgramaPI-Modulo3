/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

import servicos.GeradorRelatorioPDF;

/**
 *
 * @author 182310076
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTecnicos = new javax.swing.JTable();
        jScrollPaneListaProjeto = new javax.swing.JScrollPane();
        jTableOrdemdeServico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuAdministrador = new javax.swing.JMenuBar();
        jMenuCriarAdministrador = new javax.swing.JMenu();
        jMenuItemCriarTecnico = new javax.swing.JMenuItem();
        jMenuItemCriarProjetoOS = new javax.swing.JMenuItem();
        jMenuCriarRelatorio = new javax.swing.JMenu();
        jMenuItemRelatorioPOS = new javax.swing.JMenuItem();
        jMenuEditarAdministrador = new javax.swing.JMenu();
        jMenuItemEditarTécnico = new javax.swing.JMenuItem();
        jMenuItemEditarProjetoOS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableTecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableTecnicos);

        jTableOrdemdeServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data de Criação", "Data de Finalização", "Condição", "Descrição", "Técnico", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneListaProjeto.setViewportView(jTableOrdemdeServico);
        if (jTableOrdemdeServico.getColumnModel().getColumnCount() > 0) {
            jTableOrdemdeServico.getColumnModel().getColumn(0).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(1).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(2).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(3).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(4).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(5).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setText("Projeto/Ordem de Serviços:");

        jLabel3.setText("Técnicos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                            .addComponent(jScrollPaneListaProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneListaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jMenuCriarAdministrador.setText("Criar");

        jMenuItemCriarTecnico.setText("Criar Técnico");
        jMenuItemCriarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriarTecnicoActionPerformed(evt);
            }
        });
        jMenuCriarAdministrador.add(jMenuItemCriarTecnico);

        jMenuItemCriarProjetoOS.setText("Criar Projeto/Ordem de Serviço");
        jMenuItemCriarProjetoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriarProjetoOSActionPerformed(evt);
            }
        });
        jMenuCriarAdministrador.add(jMenuItemCriarProjetoOS);

        jMenuCriarRelatorio.setText("Criar Relatórios");

        jMenuItemRelatorioPOS.setText("Projeto/OrdemDeServico");
        jMenuItemRelatorioPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioPOSActionPerformed(evt);
            }
        });
        jMenuCriarRelatorio.add(jMenuItemRelatorioPOS);

        jMenuCriarAdministrador.add(jMenuCriarRelatorio);

        jMenuAdministrador.add(jMenuCriarAdministrador);

        jMenuEditarAdministrador.setText("Editar/Deletar");

        jMenuItemEditarTécnico.setText("Editar/Deletar Técnico");
        jMenuEditarAdministrador.add(jMenuItemEditarTécnico);

        jMenuItemEditarProjetoOS.setText("Editar/Deletar Projeto/Ordem de Serviço");
        jMenuEditarAdministrador.add(jMenuItemEditarProjetoOS);

        jMenuAdministrador.add(jMenuEditarAdministrador);

        setJMenuBar(jMenuAdministrador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCriarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriarTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCriarTecnicoActionPerformed

    private void jMenuItemRelatorioPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioPOSActionPerformed
        // TODO add your handling code here:
        try {
            GeradorRelatorioPDF GerarPOS = new GeradorRelatorioPDF();
            GerarPOS.gerarRelatorioProjetoOS();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar o relatório: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemRelatorioPOSActionPerformed

    private void jMenuItemCriarProjetoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriarProjetoOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCriarProjetoOSActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuAdministrador;
    private javax.swing.JMenu jMenuCriarAdministrador;
    private javax.swing.JMenu jMenuCriarRelatorio;
    private javax.swing.JMenu jMenuEditarAdministrador;
    private javax.swing.JMenuItem jMenuItemCriarProjetoOS;
    private javax.swing.JMenuItem jMenuItemCriarTecnico;
    private javax.swing.JMenuItem jMenuItemEditarProjetoOS;
    private javax.swing.JMenuItem jMenuItemEditarTécnico;
    private javax.swing.JMenuItem jMenuItemRelatorioPOS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneListaProjeto;
    private javax.swing.JTable jTableOrdemdeServico;
    private javax.swing.JTable jTableTecnicos;
    // End of variables declaration//GEN-END:variables
}
