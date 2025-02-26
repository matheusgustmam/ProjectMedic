/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.viwer;

import com.mycompany.mavenproject1.Controle.Consulta;
import com.mycompany.mavenproject1.Controle.Medic;
import com.mycompany.mavenproject1.Controle.Paciente;
import com.mycompany.mavenproject1.Modelo.ConsultaFabric;
import com.mycompany.mavenproject1.Modelo.Fabrica;
import com.mycompany.mavenproject1.Modelo.MedicFabric;
import com.mycompany.mavenproject1.Modelo.PacienteFabrica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ComboBoxModel;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;



/**
 *
 * @author Matheus
 */
public class TelaMarcarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form TelaMarcarConsulta
     */
    private Medic medico;
    
    public TelaMarcarConsulta() {
        initComponents();
        
        this.medico= new Medic();
        setValor(new Consulta());
        listarPaciente();
        listarMedic();
        
        
        setValor(new Consulta());
    }

    public TelaMarcarConsulta(Consulta valor){
        initComponents();
        
        setValor(valor);
        Fabrica<Medic> fabrica = new MedicFabric();
        cbDrCon.addItem(fabrica.getEntidade(valor.getId_medico()));
        cbEspecialidadeCon.addItem(valor.getEscp());
        Fabrica<Paciente> fabricaPaci = new PacienteFabrica();
        
        cbPacienteCon.addItem(fabricaPaci.getEntidade(valor.getPaciente().getId()));
        
        cbPacienteCon.setSelectedItem(valor);
        cbDrCon.setSelectedItem(valor);
        cbEspecialidadeCon.setSelectedItem(valor.getEscp());
        txaObsCon.setText(valor.getObsConsult());
        txfHorasConst.setText(valor.getHrConsult());
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
        txfDateConst.setValue(formatter.format(valor.getDtConsult()));
        
        //SimpleDateFormat formatterhor = new SimpleDateFormat("hh:mm:ss");
        //txfHorasConst.setValue(formatterhor.format(valor.getHrConsult()));
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbPacienteCon = new javax.swing.JComboBox<>();
        cbDrCon = new javax.swing.JComboBox<>();
        cbEspecialidadeCon = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObsCon = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btMarcarCon = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txfDateConst = new javax.swing.JFormattedTextField();
        txfHorasConst = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Marcar Consulta");

        jLabel2.setText("Paciente:");

        jLabel3.setText("Dr:");

        jLabel4.setText("Especialidade");

        jLabel5.setText("Obs:");

        cbDrCon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDrConItemStateChanged(evt);
            }
        });

        cbEspecialidadeCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "teste" }));

        txaObsCon.setColumns(20);
        txaObsCon.setRows(5);
        jScrollPane1.setViewportView(txaObsCon);

        jLabel6.setText("Data Da Consulta:");

        jLabel7.setText("Horas Da Consulta");

        btMarcarCon.setText("Marcar Consulta");
        btMarcarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarcarConActionPerformed(evt);
            }
        });

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btMenu.setText("Menu");
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        try {
            txfDateConst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txfHorasConst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbPacienteCon, 0, 135, Short.MAX_VALUE)
                                        .addComponent(cbDrCon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEspecialidadeCon, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfHorasConst, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(txfDateConst))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 406, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btMarcarCon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFechar)
                .addGap(20, 20, 20))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPacienteCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txfDateConst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbDrCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txfHorasConst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbEspecialidadeCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMarcarCon)
                    .addComponent(btFechar)
                    .addComponent(btMenu))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        TelaPrincipal view = new TelaPrincipal();
        view.setVisible(true);
    }//GEN-LAST:event_btMenuActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btMarcarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarcarConActionPerformed
        Consulta obj = getValor();
        medico = (Medic)cbDrCon.getSelectedItem();
        obj.setPacienteConsult(cbPacienteCon.getSelectedItem().toString());
        obj.setMedicConsult(cbDrCon.getSelectedItem().toString());
        obj.setId_medico(medico.getId());
        obj.setEscp(cbEspecialidadeCon.getSelectedItem().toString());
        obj.setObsConsult(txaObsCon.getText());
        obj.setHrConsult(txfHorasConst.getText());
        
        
        try{
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            obj.setDtConsult(formatter.parse(txfDateConst.getText()));
            
            //SimpleTimeZone formatterhor = new SimpleTimeZone(ABORT, ID),"hh:mm:ss");
            //obj.setHrConsult(formatterhor.parse(txfHorasConst.getText()));
                    
            setValor(obj);
            
            Fabrica<Consulta> fa = new ConsultaFabric();
            if(fa.salvar(obj)){
                JOptionPane.showMessageDialog(this, "Consulta foi marcada com Sucesso.");
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "A consulta não pode ser marcada.",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(this, "Data da Consutal invalida ou Horario invalido.",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
     
    }//GEN-LAST:event_btMarcarConActionPerformed

    private void cbDrConItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDrConItemStateChanged
        listarMedicExp((Medic) cbDrCon.getSelectedItem());
        
    }//GEN-LAST:event_cbDrConItemStateChanged

    private Consulta valor;
    
    public Consulta getValor(){
        return valor;
    }
    
    public void setValor(Consulta valor){
        this.valor = valor;
    }
            
   /* public void listarPaciente(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
             
        Fabrica<Paciente> fabrica = new PacienteFabrica();
        List<Paciente> ls = fabrica.listar();
        for (int i = 0; i < ls.size(); i++) {
            model.addElement(ls.get(i).getNome()); 
        }
      
        cbPacienteCon.setModel(model);
    } */
    
    public void listarPaciente(){
        DefaultComboBoxModel<Paciente> model = new DefaultComboBoxModel();
        
        
        Fabrica<Paciente> fabrica = new PacienteFabrica();
        List<Paciente> ls = fabrica.listar();
        for (int i = 0; i < ls.size(); i++) {
            model.addElement(ls.get(i)); 
            
        }
        
        cbPacienteCon.setModel(model);
    }
    
    public void listarMedic(){
        DefaultComboBoxModel<Medic> model = new DefaultComboBoxModel();
        
        
        Fabrica<Medic> fabrica = new MedicFabric();
        List<Medic> ls = fabrica.listar();
        for (int i = 0; i < ls.size(); i++) {
            model.addElement(ls.get(i)); 
            
        }
        
        cbDrCon.setModel(model);
    }
    
    public void listarMedicExp(Medic medico){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        String[] espec = medico.getEspecialidade().split("\\^");
        model.addAll(Arrays.asList(espec));
        
       
        
        cbEspecialidadeCon.setModel(model);
    } 
    
   
   
   
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
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMarcarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btMarcarCon;
    private javax.swing.JButton btMenu;
    private javax.swing.JComboBox<Medic> cbDrCon;
    private javax.swing.JComboBox<String> cbEspecialidadeCon;
    private javax.swing.JComboBox<Paciente> cbPacienteCon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txaObsCon;
    private javax.swing.JFormattedTextField txfDateConst;
    private javax.swing.JFormattedTextField txfHorasConst;
    // End of variables declaration//GEN-END:variables
}
