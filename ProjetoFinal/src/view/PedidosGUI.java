package view;

import DAO.ClienteDAO;
import DAO.PedidoDAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Pedido;


public class PedidosGUI extends javax.swing.JFrame {

         //instancia um novo objeto ClienteDAO para dar acesso aos metodos dos clientes
    PedidoDAO pedido = new PedidoDAO();

    //recupera os dados do cadastro para dentro do ArrayList cad
    ArrayList<Pedido> cad = pedido.list();
    
    Cliente c;
        
    public PedidosGUI() {
        
        initComponents();
        
            ArrayList<Pedido> cad = pedido.list();
        
            if (cad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sem Pedidos");
            } else {

               for (int i = 0; i < cad.size(); i++) {
                DefaultTableModel model = (DefaultTableModel) tbPedidos.getModel();
                Object[] rowData = {""};
                model.addRow(rowData);
                tbPedidos.setValueAt(cad.get(i).getCodPedido(), i, 0);
                tbPedidos.setValueAt(cad.get(i).getQtd_produto(), i, 2);
                tbPedidos.setValueAt(cad.get(i).getValor_produtos(), i, 3);
                tbPedidos.setValueAt(cad.get(i).getData_pagamento(), i, 4);
            }
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPedidos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(920, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEDIDOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 740, 50));

        jLabel2.setText("*NOME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 61, 30));

        tfNome.setEnabled(false);
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 330, -1));

        jLabel7.setText("*ENDEREÇO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        tfEndereco.setEnabled(false);
        getContentPane().add(tfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 400, -1));

        tbPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome Cliente", "Qtd", "Total", "Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 890, 410));

        jPanel1.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecione o cliente na tabela abaixo.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(913, 182, 885, 16);

        jLabel8.setText("COD");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(600, 130, 40, 30);

        tfCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfCodigo.setEnabled(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(tfCodigo);
        tfCodigo.setBounds(652, 130, 110, 70);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SELECIONE O CLIENTE NA TABELA ABAIXO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(19, 182, 740, 16);

        tfCelular.setEnabled(false);
        jPanel1.add(tfCelular);
        tfCelular.setBounds(600, 90, 160, 22);

        jLabel5.setText("*CELULAR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(514, 90, 70, 26);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU PEDIDOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setLayout(null);

        jButton1.setText("NOVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 30, 100, 40);

        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 130, 100, 40);

        jButton3.setText("VISUALIZAR");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(10, 80, 100, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(790, 20, 120, 190);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tbPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPedidosMouseClicked

        // Obtém o modelo de seleção de linha da JTable
        ListSelectionModel selectionModel = tbPedidos.getSelectionModel();

        // Adiciona um MouseListener para tratar o evento de clique
        tbPedidos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtém o índice da linha clicada
                int rowIndex = tbPedidos.rowAtPoint(e.getPoint());
                // Verifica se o clique foi em uma linha válida
                
                Pedido p = new Pedido();
                
                if (rowIndex >= 0) {
                    // Define a linha clicada como a linha selecionada
                    selectionModel.setSelectionInterval(rowIndex, rowIndex);
                    //Cliente selecionado =  pedido.pesquisar(cad.get(rowIndex.getCpf()));
                    p.setCodPedido( cad.get(rowIndex).getCodPedido());
                    p.setQtd_produto(cad.get(rowIndex).getQtd_produto());
                    p.setValor_produtos(cad.get(rowIndex).getValor_produtos());
                    p.setEntrega(cad.get(rowIndex).getEntrega());
                    p.setPagamento(cad.get(rowIndex).getPagamento());
                    p.setData_pagamento(cad.get(rowIndex).getData_pagamento());               
                }              
            }
        });
    }//GEN-LAST:event_tbPedidosMouseClicked

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ClientesGUI().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PedidosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PedidosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPedidos;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
