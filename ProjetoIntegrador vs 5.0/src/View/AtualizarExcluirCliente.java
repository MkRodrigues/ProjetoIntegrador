/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AtualizarExcluirClienteController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mikael
 */
public final class AtualizarExcluirCliente extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    private String modoTela; //   "Criar/Editar"
    
    
    public AtualizarExcluirCliente() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();
        
    }
    
    public void LoadTable(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasClientes = AtualizarExcluirClienteController.getClientes();
        
        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");
        tblClientes.setModel(tmClientes);
        
        for(String[] c:linhasClientes)
        {
            tmClientes.addRow(c);
        }
        
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(150);
    }
    
    public void LimparFormulario()
    {
        txtIdCliente.setText("");
        txtNomeCliente.setText("");
        txtCPFCliente.setText("");
        
    }
    
    public void DesabilitarFormulario()
    {
        txtIdCliente.setEditable(false);
        txtNomeCliente.setEditable(false);
        txtCPFCliente.setEditable(false);
        
    }
    
    public void HabilitarFormulario()
    {
        txtIdCliente.setEditable(true);
        txtNomeCliente.setEditable(true);
        txtCPFCliente.setEditable(true);
        
        btnCadastrarCliente.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    private boolean ValidarFormulario() {
        
        if(this.txtNomeCliente.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um nome para o cliente!");
            return false;
        }
        
        if(this.txtCPFCliente.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um CPF para cliente!");
            return false;
        }
        
        return true;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeral = new javax.swing.JPanel();
        pnlCliente = new javax.swing.JPanel();
        lblIdCliente = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        btnProcurarCliente = new javax.swing.JButton();
        btnLimparPesquisa = new javax.swing.JButton();
        txtCPFCliente = new javax.swing.JTextField();
        lblCPFCliente = new javax.swing.JLabel();
        pnlFunções = new javax.swing.JPanel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnAtualizarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Cliente");

        pnlCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblIdCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIdCliente.setText("Id:");

        lblNomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNomeCliente.setText("Nome:");

        txtIdCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnProcurarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnProcurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/procurar(2).png"))); // NOI18N
        btnProcurarCliente.setText("Procurar");
        btnProcurarCliente.setBorder(null);
        btnProcurarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarClienteActionPerformed(evt);
            }
        });

        btnLimparPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimparPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpar(1).png"))); // NOI18N
        btnLimparPesquisa.setText("Limpar");
        btnLimparPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtCPFCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblCPFCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCPFCliente.setText("CPF:");

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeCliente)
                    .addComponent(lblIdCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addComponent(txtIdCliente)
                        .addGap(18, 18, 18)
                        .addComponent(lblCPFCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimparPesquisa)
                    .addComponent(btnProcurarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLimparPesquisa, btnProcurarCliente});

        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addComponent(btnProcurarCliente)
                        .addGap(8, 8, 8)
                        .addComponent(btnLimparPesquisa))
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdCliente)
                            .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPFCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeCliente)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLimparPesquisa, btnProcurarCliente});

        pnlFunções.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnCadastrarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add (5).png"))); // NOI18N
        btnCadastrarCliente.setText("Novo Cliente");
        btnCadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnAtualizarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atualizar(3).png"))); // NOI18N
        btnAtualizarCliente.setText("Atualizar");
        btnAtualizarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClienteActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sair.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFunçõesLayout = new javax.swing.GroupLayout(pnlFunções);
        pnlFunções.setLayout(pnlFunçõesLayout);
        pnlFunçõesLayout.setHorizontalGroup(
            pnlFunçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFunçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFunçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFunçõesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAtualizarCliente, btnCadastrarCliente, btnCancelar, btnExcluirCliente});

        pnlFunçõesLayout.setVerticalGroup(
            pnlFunçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFunçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarCliente)
                .addGap(13, 13, 13)
                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlFunçõesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAtualizarCliente, btnExcluirCliente});

        tblClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        tblClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFunções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFunções, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jMenu4.setText("Colaborador");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem1.setText("Cadastrar Colaborador");
        jMenu4.add(jMenuItem1);

        jMenuItem13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem13.setText("Pesquisar Colaborador");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Produto");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem2.setText("Cadastrar Produto");
        jMenu5.add(jMenuItem2);

        jMenuItem14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem14.setText("Pesquisar Produto");
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        
            CadastrarCliente form2 = new CadastrarCliente();  
            form2.setVisible(true);  
            dispose();
        
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClienteActionPerformed

        if(tblClientes.getRowCount()>0)
        {
            if(tblClientes.getSelectedRow()>=0)
            {
                HabilitarFormulario();
                
                modoTela = "Editar";

                txtIdCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 0).toString());
                txtNomeCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 1).toString());
                txtCPFCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 2).toString());
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Selecione um cliente para editar!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há clientes para editar!");
        }
    }//GEN-LAST:event_btnAtualizarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        if(tblClientes.getRowCount()>0)
        {
            int numeroLinha = tblClientes.getSelectedRow();
            if(AtualizarExcluirClienteController.Excluir(Integer.parseInt(tblClientes.getValueAt(numeroLinha,0).toString()) ) )
            {
                this.LoadTable();
                JOptionPane.showMessageDialog(this,"Cliente excluído da base de dados");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao excluir o cliente!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há clientes para excluir!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarClienteActionPerformed
        
    }//GEN-LAST:event_btnProcurarClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TelaPrincipal form2 = new TelaPrincipal();  
        form2.setVisible(true);  
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarExcluirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnLimparPesquisa;
    private javax.swing.JButton btnProcurarCliente;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlFunções;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCPFCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
