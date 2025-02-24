/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.viwer;
import com.mycompany.mavenproject1.Modelo.ConsultaFabric;
import com.mycompany.mavenproject1.Controle.Consulta;
import com.mycompany.mavenproject1.Modelo.Fabrica;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class TelaHistoricoPaciente extends javax.swing.JFrame {

    /**
     * Creates new form TelaHistoricoPaciente
     */
    public TelaHistoricoPaciente() {
        initComponents();
        listar();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomePaHP = new javax.swing.JTextField();
        txtCpfHP = new javax.swing.JFormattedTextField();
        txtEmailHP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableHP = new javax.swing.JTable();
        jbMenuHP = new javax.swing.JButton();
        jbPequisaHP = new javax.swing.JButton();
        jbFecharHP = new javax.swing.JButton();
        btEditaHP = new javax.swing.JButton();
        btExcluirConHP = new javax.swing.JButton();
        btNewConstHP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Historico de Pacientes");

        txtNomePaHP.setText("Nome Do Paciente");

        try {
            txtCpfHP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtEmailHP.setText("@gmail Etc");

        jtableHP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome Paciente", "Nome Dr", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jtableHP);

        jbMenuHP.setText("Menu");
        jbMenuHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuHPActionPerformed(evt);
            }
        });

        jbPequisaHP.setText("Pesquisar");

        jbFecharHP.setText("Fechar");
        jbFecharHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharHPActionPerformed(evt);
            }
        });

        btEditaHP.setText("Editar");
        btEditaHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditaHPActionPerformed(evt);
            }
        });

        btExcluirConHP.setText("Excluir");
        btExcluirConHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirConHPActionPerformed(evt);
            }
        });

        btNewConstHP.setText("Nova Consulta");
        btNewConstHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewConstHPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCpfHP)
                                        .addComponent(txtNomePaHP, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                    .addComponent(txtEmailHP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btNewConstHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditaHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluirConHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbMenuHP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPequisaHP)
                        .addGap(1, 1, 1)
                        .addComponent(jbFecharHP)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomePaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCpfHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPequisaHP)
                    .addComponent(jbMenuHP)
                    .addComponent(jbFecharHP)
                    .addComponent(btEditaHP)
                    .addComponent(btExcluirConHP)
                    .addComponent(btNewConstHP))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMenuHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuHPActionPerformed
         TelaPrincipal view = new TelaPrincipal();
        view.setVisible(true);
    }//GEN-LAST:event_jbMenuHPActionPerformed

    private void jbFecharHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharHPActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharHPActionPerformed

    private void btExcluirConHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirConHPActionPerformed
        int idx = jtableHP.getSelectedRow();
                
        if (idx > -1) {
            Consulta obj = ls.get(idx);
            
            if(JOptionPane.showConfirmDialog(this,
                    "Tem Certeza que deseja excluir Consulta do: "+obj.getPacienteConsult()+" com Medico: "+obj.getMedicConsult()+" do dia: "+obj.getDtConsult(),
                    "Excluir?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                
                Fabrica<Consulta> fabrica = new ConsultaFabric();
                
                if(fabrica.excluir(obj)){
                    listar();
                }else {
                    JOptionPane.showConfirmDialog(this,
                           "A consulta não pode ser Excluida.",
                           "Erro", JOptionPane.ERROR_MESSAGE);
                }
                    
            }
        }else {
            JOptionPane.showMessageDialog(this, "Selecione o Medico.",
            "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }//GEN-LAST:event_btExcluirConHPActionPerformed

    private void btNewConstHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewConstHPActionPerformed
        TelaMarcarConsulta view = new TelaMarcarConsulta();
        view.setVisible(true);
        
        view.addWindowListener(new WindowListener() {
            public void windowClosing(WindowEvent e) {}
            public void windowOpened(WindowEvent e) {}
            public void windowClosed(WindowEvent e) {
                listar();
            }
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}

          
        });
  
    }//GEN-LAST:event_btNewConstHPActionPerformed

    private void btEditaHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditaHPActionPerformed
        int idx = jtableHP.getSelectedRow();
        
        if(idx > -1) {
            TelaMarcarConsulta view = new TelaMarcarConsulta(ls.get(idx));
            
            view.setVisible(true);
            
            view.addWindowListener(new WindowListener() {
                public void windowClosing(WindowEvent e) {}
                public void windowOpened(WindowEvent e) {}
                public void windowClosed(WindowEvent e) {
                    listar();
                }
                public void windowIconified(WindowEvent e) {}
                public void windowDeiconified(WindowEvent e) {}
                public void windowActivated(WindowEvent e) {}
                public void windowDeactivated(WindowEvent e) {}
                
            });
        }else {
            JOptionPane.showMessageDialog(this, "Selecione a consulta.",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
         
    }//GEN-LAST:event_btEditaHPActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistoricoPaciente().setVisible(true);
            }
        });
    }

    public void listar() {
        DefaultTableModel model = (DefaultTableModel) jtableHP.getModel();
        model.getDataVector().removeAllElements();
        
        Fabrica<Consulta> fabrica = new ConsultaFabric();
        ls = fabrica.listar();
        
        for (Consulta obj : ls){
            model.addRow(new Object[] { obj.getPacienteConsult(), obj.getMedicConsult(), obj.getEscp(),
            obj.getDtConsult(), obj.getHrConsult(), obj.getObsConsult()});
        }
        
        jtableHP.setModel(model);
    }
    
    private List<Consulta> ls;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditaHP;
    private javax.swing.JButton btExcluirConHP;
    private javax.swing.JButton btNewConstHP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbFecharHP;
    private javax.swing.JButton jbMenuHP;
    private javax.swing.JButton jbPequisaHP;
    private javax.swing.JTable jtableHP;
    private javax.swing.JFormattedTextField txtCpfHP;
    private javax.swing.JTextField txtEmailHP;
    private javax.swing.JTextField txtNomePaHP;
    // End of variables declaration//GEN-END:variables
}
