/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ClienteDAO;
import DAO.PedidoDAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Pedido;

/**
 *
 * @author Marcio Almeida
 */
public class PedidoGUI extends javax.swing.JFrame {

    private final Cliente c;
    
        ArrayList<Pedido> lista = new ArrayList();
        float valor;
        float qtd;
        long codCli;
                
        ClienteDAO cliente = new ClienteDAO();
        PedidoDAO pedido = new PedidoDAO();
        ArrayList<Cliente> cad = cliente.list();

     public PedidoGUI(Cliente c) {
        this.c = c;
         
        initComponents();

         
         Pedido pedido = new Pedido();
         
         System.out.println("nome dentro do pedido " + c.getNome());
         tfNome.setText( c.getNome());
         tfTelefone.setText(String.valueOf(c.getTelefone()));
         tfEndereco.setText(c.getEndereco() + ", " + c.getNumero() + " - " + c.getBairro() + " - " + c.getCidade() );
         
         tbProdutos.setValueAt(1, 0, 0);
         tbProdutos.setValueAt("Basico", 0, 1);
         tbProdutos.setValueAt(10.00, 0, 2);
         tbProdutos.setValueAt("un", 0, 3);

        codCli = c.getCodCliente();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        btAdicionar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTotalG = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido");
        setMinimumSize(new java.awt.Dimension(940, 660));
        setSize(new java.awt.Dimension(940, 660));
        getContentPane().setLayout(null);

        jLabel20.setText("Telefone");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(610, 80, 60, 16);

        tfNome.setEditable(false);
        getContentPane().add(tfNome);
        tfNome.setBounds(100, 80, 450, 30);

        tfTelefone.setEditable(false);
        getContentPane().add(tfTelefone);
        tfTelefone.setBounds(680, 80, 230, 30);

        tfEndereco.setEditable(false);
        getContentPane().add(tfEndereco);
        tfEndereco.setBounds(100, 120, 810, 30);

        jLabel22.setText("Nome");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(30, 80, 60, 16);

        jLabel23.setText("Endereço");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 120, 70, 16);

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "COD", "Serviço", "Valor", "Unidade"
            }
        ));
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 380, 330);

        tbPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Cod", "Quantidade", "Total"
            }
        ));
        jScrollPane2.setViewportView(tbPedido);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 170, 370, 330);

        btAdicionar.setText("Adicionar >>");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btAdicionar);
        btAdicionar.setBounds(420, 270, 100, 40);

        jButton3.setText("Finalizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 320, 100, 40);

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 370, 100, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 220, 100, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PEDIDO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 190, 100, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NÚMERO DO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 170, 100, 20);

        tfTotalG.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tfTotalG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(tfTotalG);
        tfTotalG.setBounds(420, 450, 100, 70);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 420, 100, 20);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel24);
        jLabel24.setBounds(220, 620, 180, 0);
        getContentPane().add(jLabel25);
        jLabel25.setBounds(280, 620, 120, 0);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel26);
        jLabel26.setBounds(220, 560, 180, 0);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel27);
        jLabel27.setBounds(220, 590, 180, 0);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel28);
        jLabel28.setBounds(220, 530, 180, 0);
        getContentPane().add(jLabel29);
        jLabel29.setBounds(280, 530, 120, 0);
        getContentPane().add(jLabel30);
        jLabel30.setBounds(280, 560, 120, 0);
        getContentPane().add(jLabel31);
        jLabel31.setBounds(280, 590, 120, 0);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel32);
        jLabel32.setBounds(230, 620, 170, 0);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel33);
        jLabel33.setBounds(230, 560, 170, 0);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel34);
        jLabel34.setBounds(230, 590, 170, 0);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel35);
        jLabel35.setBounds(230, 530, 170, 0);

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel40);
        jLabel40.setBounds(220, 620, 180, 0);

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel41);
        jLabel41.setBounds(220, 560, 180, 0);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel42);
        jLabel42.setBounds(220, 590, 180, 0);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel43);
        jLabel43.setBounds(220, 530, 180, 0);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setText("Total do Pedido");
        getContentPane().add(jLabel51);
        jLabel51.setBounds(640, 530, 110, 16);

        tfTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(tfTotal);
        tfTotal.setBounds(750, 520, 160, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INGRESSO DE PEDIDO");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 20, 890, 36);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 10, 10);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 10, 10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked

        
        // Obtém o modelo de seleção de linha da JTable
        ListSelectionModel selectionModel = tbProdutos.getSelectionModel();

        // Adiciona um MouseListener para tratar o evento de clique
        
                
                Pedido pedido = new Pedido();
                
                int rowIndex = tbProdutos.rowAtPoint(evt.getPoint());
                // Verifica se o clique foi em uma linha válida
                if (rowIndex >= 0) {
                    // Define a linha clicada como a linha selecionada
                    selectionModel.setSelectionInterval(rowIndex, rowIndex);
                    float qtd = Integer.parseInt(JOptionPane.showInputDialog("Insira a Quantidade"));
                    pedido.setQtd_produto(qtd);
                    System.out.println(qtd*(pedido.getQtd_produto()));
                    
                    pedido.setValor_produtos(qtd*10);  
                    lista.add(pedido);
               } 
                
                System.out.println("criou o objeto");
           
       
            evt.consume();
        
    }//GEN-LAST:event_tbProdutosMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Pedido p = new Pedido();
       p.setPagamento((int) codCli);
       p.setValor_produtos(valor);
       p.setQtd_produto(qtd);
       
       pedido.inserir(p);
      JOptionPane.showMessageDialog(null, "Pedido Ingressado com Sucesso", "Pedido", JOptionPane.INFORMATION_MESSAGE);
       this.dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Cliente cliente) {
                       
                new PedidoGUI(cliente).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbPedido;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JLabel tfTotalG;
    // End of variables declaration//GEN-END:variables
}
