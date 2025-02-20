/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.viwer;

//import DAO.PacienteDAO;
import com.mycompany.mavenproject1.Controle.Paciente;
import com.mycompany.mavenproject1.Modelo.Fabrica;
import com.mycompany.mavenproject1.Modelo.PacienteFabrica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class TelaCadstro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadstro
     */
    public TelaCadstro() {
        initComponents();
       
        
        setValor(new Paciente());
    }
    
    public TelaCadstro(Paciente valor) {
        initComponents();
        
        setValor(valor);
        txtNomeCP.setText(valor.getNome());
        txtCpfCP.setText(valor.getCpf());
        txtEmailCP.setText(valor.getEmail());
        txtTelefoneCP.setText(valor.getTel());
        txtObsCP.setText(valor.getObs());
        cboxCidadeCP.setSelectedIndex(valor.getCidade());
        rbAlergConteCP.setActionCommand(valor.getAlerg());
        rbAlerNaoCP.setActionCommand(valor.getAlerg());
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        txtNascCP.setValue(formatter.format(valor.getDataNscP()));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrupAlergiaC = new javax.swing.ButtonGroup();
        bgrupDiabetes = new javax.swing.ButtonGroup();
        bgrupPrecaoAlta = new javax.swing.ButtonGroup();
        bgrupPrecaoBaixa = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeCP = new javax.swing.JTextField();
        txtCpfCP = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmailCP = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefoneCP = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cboxCidadeCP = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        rbAlergConteCP = new javax.swing.JRadioButton();
        rbAlerNaoCP = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rbDiabContemCP = new javax.swing.JRadioButton();
        rbDiabNaoCP = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        rbPreAltaContemCP = new javax.swing.JRadioButton();
        rbPreAltaNaoCP = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rbPreBaixaContemCP = new javax.swing.JRadioButton();
        rbPreBaixaNaoCP = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        btCadastrarCP = new javax.swing.JButton();
        btCancelarCP = new javax.swing.JToggleButton();
        btMenuCP = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNascCP = new javax.swing.JFormattedTextField();
        txtObsCP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(899, 487));
        setName("telaCadastroCP"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 487));
        setSize(new java.awt.Dimension(910, 487));

        jLabel1.setText("Cadastro do Paciente");

        jLabel2.setText("Nome:");

        jLabel3.setText("CFP:");

        jLabel4.setText("Data Nasc:");

        txtNomeCP.setText("Nome Do Paciente");

        try {
            txtCpfCP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("E-Mail:");

        txtEmailCP.setText("Email Paciente: ex@gmail.com");

        jLabel6.setText("Telefone:");

        try {
            txtTelefoneCP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(046)######-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneCP.setMaximumSize(new java.awt.Dimension(64, 22));

        jLabel7.setText("Cidade:");

        cboxCidadeCP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palmas", "Clevelandia", "Cor Dumingo Soars", "Manguerinha" }));

        jLabel8.setText("Alergia:");

        bgrupAlergiaC.add(rbAlergConteCP);
        rbAlergConteCP.setText("Contem");

        bgrupAlergiaC.add(rbAlerNaoCP);
        rbAlerNaoCP.setText("Não Contem");

        jLabel9.setText("Diabetes:");

        bgrupDiabetes.add(rbDiabContemCP);
        rbDiabContemCP.setText("Contem");

        bgrupDiabetes.add(rbDiabNaoCP);
        rbDiabNaoCP.setText("Não Contem");

        jLabel10.setText("Preção Alta:");

        bgrupPrecaoAlta.add(rbPreAltaContemCP);
        rbPreAltaContemCP.setText("Contem");

        bgrupPrecaoAlta.add(rbPreAltaNaoCP);
        rbPreAltaNaoCP.setText("Não Contem");

        jLabel11.setText("Preção Baixa:");

        bgrupPrecaoBaixa.add(rbPreBaixaContemCP);
        rbPreBaixaContemCP.setText("Contem");
        rbPreBaixaContemCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPreBaixaContemCPActionPerformed(evt);
            }
        });

        bgrupPrecaoBaixa.add(rbPreBaixaNaoCP);
        rbPreBaixaNaoCP.setText("Não Contem");

        jLabel12.setText("Observação:");

        btCadastrarCP.setText("Cadastrar");
        btCadastrarCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btCadastrarCPMouseReleased(evt);
            }
        });

        btCancelarCP.setText("Cancelar");
        btCancelarCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btCancelarCPMousePressed(evt);
            }
        });

        btMenuCP.setText("Menu");
        btMenuCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuCPActionPerformed(evt);
            }
        });

        try {
            txtNascCP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascCP.setText("DD /MM /NNNN  ");
        txtNascCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascCPActionPerformed(evt);
            }
        });

        txtObsCP.setText("Observacoes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxCidadeCP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefoneCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomeCP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpfCP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailCP)
                            .addComponent(txtNascCP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPreBaixaContemCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPreBaixaNaoCP)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbAlergConteCP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAlerNaoCP)
                                .addContainerGap())
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rbDiabContemCP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbDiabNaoCP)
                                    .addContainerGap())
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbPreAltaContemCP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbPreAltaNaoCP)
                                    .addGap(33, 33, 33)))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btMenuCP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadastrarCP)
                .addGap(12, 12, 12)
                .addComponent(btCancelarCP)
                .addGap(19, 19, 19))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtObsCP, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(rbAlergConteCP)
                    .addComponent(rbAlerNaoCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(rbDiabContemCP)
                    .addComponent(rbDiabNaoCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(rbPreAltaContemCP)
                    .addComponent(rbPreAltaNaoCP)
                    .addComponent(txtNascCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmailCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(rbPreBaixaContemCP)
                        .addComponent(rbPreBaixaNaoCP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboxCidadeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObsCP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarCP)
                    .addComponent(btCancelarCP)
                    .addComponent(btMenuCP))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuCPActionPerformed
        
        TelaPrincipal view = new TelaPrincipal();
        view.setVisible(true);
    }//GEN-LAST:event_btMenuCPActionPerformed

    private void btCadastrarCPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarCPMouseReleased
        
        Paciente obj = getValor();
        obj.setNome(txtNomeCP.getText());
        obj.setCpf(txtCpfCP.getText());
        obj.setEmail(txtEmailCP.getText());
        obj.setTel(txtTelefoneCP.getText());
        obj.setObs(txtObsCP.getText());
        obj.setCidade(cboxCidadeCP.getSelectedIndex());
        if(rbAlergConteCP.isSelected()){
            obj.setAlerg("Comtem");
            
        }else if(rbAlerNaoCP.isSelected()){
            obj.setAlerg("Não Contem");
        }
        
        if(rbDiabContemCP.isSelected()){
            obj.setDiabe("Comtem");
            
        }else if(rbDiabNaoCP.isSelected()){
            obj.setDiabe("Não Contem");
        }
        
        if(rbPreAltaContemCP.isSelected()){
            obj.setPrecaoAlti("Comtem");
            
        }else if(rbPreAltaNaoCP.isSelected()){
            obj.setPrecaoAlti("Não Contem");
        }
        
        if(rbPreBaixaContemCP.isSelected()){
            obj.setPrecaoBaixa("Comtem");
            
        }else if(rbPreBaixaNaoCP.isSelected()){
            obj.setPrecaoBaixa("Não Contem");
        }
        
        try{
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            obj.setDataNscP(formatter.parse(txtNascCP.getText()));
            
            setValor(obj);
            
            Fabrica<Paciente> fa = new PacienteFabrica();
            if(fa.salvar(obj)){
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "O Paciente não pode ser cadastrado.",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }    
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(this, "Data de nascimento invalida.",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
        
       
    }//GEN-LAST:event_btCadastrarCPMouseReleased
    
    private Paciente valor;
    
    public Paciente getValor(){
        return valor;
    }
    
    public void setValor(Paciente valor){
        this.valor = valor;
    }
    
    private void rbPreBaixaContemCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPreBaixaContemCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPreBaixaContemCPActionPerformed

    private void txtNascCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascCPActionPerformed

    private void btCancelarCPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarCPMousePressed
        dispose();
    }//GEN-LAST:event_btCancelarCPMousePressed

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
            java.util.logging.Logger.getLogger(TelaCadstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadstro().setVisible(true);
            }
        });
    }
    
    
    
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrupAlergiaC;
    private javax.swing.ButtonGroup bgrupDiabetes;
    private javax.swing.ButtonGroup bgrupPrecaoAlta;
    private javax.swing.ButtonGroup bgrupPrecaoBaixa;
    private javax.swing.JButton btCadastrarCP;
    private javax.swing.JToggleButton btCancelarCP;
    private javax.swing.JToggleButton btMenuCP;
    private javax.swing.JComboBox<String> cboxCidadeCP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbAlerNaoCP;
    private javax.swing.JRadioButton rbAlergConteCP;
    private javax.swing.JRadioButton rbDiabContemCP;
    private javax.swing.JRadioButton rbDiabNaoCP;
    private javax.swing.JRadioButton rbPreAltaContemCP;
    private javax.swing.JRadioButton rbPreAltaNaoCP;
    private javax.swing.JRadioButton rbPreBaixaContemCP;
    private javax.swing.JRadioButton rbPreBaixaNaoCP;
    private javax.swing.JFormattedTextField txtCpfCP;
    private javax.swing.JFormattedTextField txtEmailCP;
    private javax.swing.JFormattedTextField txtNascCP;
    private javax.swing.JTextField txtNomeCP;
    private javax.swing.JTextField txtObsCP;
    private javax.swing.JFormattedTextField txtTelefoneCP;
    // End of variables declaration//GEN-END:variables
}
