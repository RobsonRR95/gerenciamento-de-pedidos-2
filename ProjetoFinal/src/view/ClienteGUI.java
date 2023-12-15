package view;

import DAO.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import util.*;
import javax.swing.*;


public class ClienteGUI extends javax.swing.JFrame {

    //instancia um novo objeto ClienteDAO para dar acesso aos metodos dos clientes
    ClienteDAO cliente = new ClienteDAO();

    //recupera os dados do cadastro para dentro do ArrayList cad
    ArrayList<Cliente> cad = cliente.list();
    
    //sinaliza a bandeira
    int operacao = 1;

    
    /**
     * Creates new form ClienteGUI
     */
    public ClienteGUI() {
       
        
        initComponents();
        
        

        /* aqui gera os primeiros clientes pra não começar em branco
	fizemos um for bem simples, somente para ter dados no inicio
        
        for (int i = 0; i < 5; i++) {
            Cliente novo = new Cliente("Cliente " + i, 00 + i);
            novo.setEnderco("rua " + i * 2);
            novo.setTelefone(519703838);
            novo.setNumero(i + 5);
            novo.setBairro("Centro");
            novo.setCidade("Osório");
            novo.setAtivo(true);

            cliente.inserir(novo);
            novo.gerarCod(cad);
        }*/

        // aqui verifica se o ArrayList não esta vazio, caso não esteja já popula a jtable
         ArrayList<Cliente> cad = cliente.list();
         
         if (cad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cadastro vazio");
        } else {
            for (int i = 0; i < cad.size(); i++) {
                DefaultTableModel model = (DefaultTableModel) tbClientes.getModel();
                Object[] rowData = {""};
                model.addRow(rowData);
                tbClientes.setValueAt(cad.get(i).getNome(), i, 0);
                tbClientes.setValueAt(cad.get(i).getTelefone(), i, 1);
                tbClientes.setValueAt(cad.get(i).getEnderco(), i, 2);
                tbClientes.setValueAt(cad.get(i).getNumero(), i, 3);
                tbClientes.setValueAt(cad.get(i).getBairro(), i, 4);
                tbClientes.setValueAt(cad.get(i).getCidade(), i, 5);
            }
        }

        //desabilita os botoes 
        btSalvar.setEnabled(false);
        btCancelar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        tfRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfObservacao = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tfNumero = new javax.swing.JTextField();
        tfApto = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        tfCep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbPublicidade = new javax.swing.JComboBox<>();
        cbPontos = new javax.swing.JComboBox<>();
        cbTabela = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btDesabilitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tfCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        cadastroClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cadastroClientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 50));

        jLabel2.setText("*NOME");
        cadastroClientes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 61, 30));

        tfNome.setEnabled(false);
        cadastroClientes.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 330, -1));

        tfCpf.setEditable(false);
        tfCpf.setEnabled(false);
        cadastroClientes.add(tfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, -1));

        tfCelular.setEnabled(false);
        cadastroClientes.add(tfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 150, -1));

        tfRg.setEnabled(false);
        cadastroClientes.add(tfRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 250, -1));

        jLabel4.setText("*CPF");
        cadastroClientes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 61, 30));

        jLabel5.setText("*CELULAR");
        cadastroClientes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, 26));

        jLabel6.setText("RG");
        cadastroClientes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 30, 30));

        jLabel7.setText("*ENDEREÇO");
        cadastroClientes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 80, 30));

        jLabel8.setText("*N°");
        cadastroClientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 20, 30));

        jLabel9.setText("*BAIRRO/PRAIA");
        cadastroClientes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));

        tfObservacao.setEnabled(false);
        cadastroClientes.add(tfObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 270, -1));

        tfEndereco.setEnabled(false);
        cadastroClientes.add(tfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 280, -1));

        jLabel10.setText("APTO");
        cadastroClientes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, 30));

        jLabel11.setText("*CIDADE");
        cadastroClientes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 30));

        jLabel12.setText("CEP");
        cadastroClientes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, 30));

        jLabel13.setText("ESTADO");
        cadastroClientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, 30));

        jLabel16.setText("ACEITA PUBLICIDADE");
        cadastroClientes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel17.setText("HABILITAR PROGRAMA DE PONTOS");
        cadastroClientes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, -1));

        jLabel18.setText("TABELA DE PREÇOS");
        cadastroClientes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));
        cadastroClientes.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        tfNumero.setEnabled(false);
        cadastroClientes.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 70, -1));

        tfApto.setEnabled(false);
        cadastroClientes.add(tfApto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 70, -1));

        tfBairro.setEnabled(false);
        cadastroClientes.add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 190, -1));

        tfEstado.setEnabled(false);
        cadastroClientes.add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 130, -1));

        tfCep.setEnabled(false);
        cadastroClientes.add(tfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 70, -1));

        jLabel14.setText("OBS");
        cadastroClientes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 230, 30, 30));

        cbPublicidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPublicidade.setEnabled(false);
        cadastroClientes.add(cbPublicidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 50, 30));

        cbPontos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPontos.setEnabled(false);
        cadastroClientes.add(cbPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 70, 30));

        cbTabela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTabela.setEnabled(false);
        cadastroClientes.add(cbTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU CLIENTE"));
        jPanel2.setLayout(null);
        cadastroClientes.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 120, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setLayout(null);

        btNovo.setText("NOVO");
        btNovo.setToolTipText("");
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel3.add(btNovo);
        btNovo.setBounds(10, 20, 98, 50);

        btEditar.setText("EDITAR");
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btEditar);
        btEditar.setBounds(10, 80, 98, 50);

        btDesabilitar.setText("DESABILITAR");
        btDesabilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDesabilitar.setEnabled(false);
        btDesabilitar.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btDesabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesabilitarActionPerformed(evt);
            }
        });
        jPanel3.add(btDesabilitar);
        btDesabilitar.setBounds(10, 140, 100, 50);

        cadastroClientes.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 120, 200));

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço", "Número", "Bairro", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbClientes.getColumnModel().getColumn(4).setPreferredWidth(2);
        }

        cadastroClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 910, 280));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfCodigo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CÓDIGO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        cadastroClientes.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 120, 70));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menino2.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroClientes.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 180));

        btSalvar.setText("SALVAR");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        cadastroClientes.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 140, 50));

        btCancelar.setText("CANCELAR");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        cadastroClientes.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 130, 50));

        jLabel19.setText("* Campos Obrigatórios.");
        cadastroClientes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jComboBox1.setModel(new CidadesComboBoxModel());
        cadastroClientes.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(cadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        // bandeira para usar o mesmo botao de salvar 
        operacao = 0;

        Cliente cliente1 = new Cliente("a", 1);

        cliente1.gerarCod(cad);
        int codigo = cliente1.getCodCliente() + 1;
        
        // habilita e desabilita os botoes
        btNovo.setEnabled(false);
        btEditar.setEnabled(false);
        btDesabilitar.setEnabled(false);
        btSalvar.setEnabled(true);
        btCancelar.setEnabled(true);
        tfCodigo.setText("" + codigo);
        tfNome.requestFocus();
        tbClientes.setVisible(false);
        
        
        // limpas e ativa os campos
        Util.EditarFrame.limparDados(this);
        Util.EditarFrame.ativaCampos(this);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String nome = "";
        long cpf;

        // esses metodos fazem algumas consistencias nos dados antes de salvar no objeto
        //verifica se o campo tfNome não esta vazio
            if (!"".equals(tfNome.getText())) {
                //verifica se o campo tfNome não é numerico
                if(!Util.isNumeric(tfNome.getText())){
                    nome = tfNome.getText();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro no campo NOME, não é permitido inserir número nesse campo.");
                    return;
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "O campo NOME é OBRIGATÓRIO!!");
                return;
            }
            
        // aqui foi feito com bloco try catch em conjunto com if verificando campo abrigatorio e se é numerico pela exceção
        try {
            if (!"".equals(tfCpf.getText())) {
                cpf = Long.parseLong(tfCpf.getText());
            } else {
                JOptionPane.showMessageDialog(null, "O campo CPF é OBRIGATÓRIO!!");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O campo CPF deve ser numérico!!");
            return;
        }
        
        //criado objeto CLiente para polular com os dados e psterior ingresso do objeto no ArrayList
        Cliente c = new Cliente(nome, cpf);
        
        //daqui para baixo foram feitas coonsistencias identicas as verificadas acima
        if (!"".equals(tfCelular.getText())) {
            try {
                c.setTelefone(Long.parseLong(tfCelular.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro no campo celular, valor não é numérico." + "e");
                return;
            }
        }

        if (!"".equals(tfEndereco.getText())) {
            c.setEndereco(tfEndereco.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O campo ENDEREÇO é OBRIGATÓRIO!!");
            return;
        }

        if (!"".equals(tfBairro.getText())) {
            c.setBairro(tfBairro.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O campo BAIRRO é OBRIGATÓRIO!!");
            return;
        }
        
        /*if (!"".equals(tfCidade.getText())) {
            c.setCidade(tfCidade.getText());
        } else {
                JOptionPane.showMessageDialog(null, "O campo CIDADE é OBRIGATÓRIO!!");
                return;
        }*/

        if (!"".equals(tfApto.getText())) {
            try {
                c.setApto(Integer.parseInt(tfApto.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro no campo apto, valor não é numérico.");
                return;
            }
        }
        
        if (!"".equals(tfCep.getText())) {
            try {
                c.setCep(Long.parseLong(tfCep.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro no campo CEP, valor não é numérico, insira somente números.");
                return;
            }
        }

        if (!"".equals(tfNumero.getText())) {
            try {
                c.setNumero(Integer.parseInt(tfNumero.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro no campo número, valor não é numérico.");
                return;
            }
        } else {
                JOptionPane.showMessageDialog(null, "O campo NÚMERO é OBRIGATÓRIO!!");
                return;
        }
        
        if (!"".equals(tfEstado.getText())){
            if(!Util.isNumeric(tfEstado.getText())){
                c.setEstado(tfEstado.getText());
            }else{
                JOptionPane.showMessageDialog(null, "Erro no campo estado, não é permitido inserir numero neste campo.");
                return;
            }
        }

        if (!"".equals(tfRg.getText())) {
            try {
                c.setRg(Long.parseLong(tfRg.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro no campo RG, valor não é numérico.");
                return;
            }
        }

        c.setObs(tfObservacao.getText());

        //aqui é verificada qual o botão e chamado o metodo correspondente, 0 inserir, 1 editar ou 2 excluir
        if (operacao == 0) {
            if (cliente.inserir(c)) {
                JOptionPane.showMessageDialog(null, "Inserido com sucesso!!");
                c.gerarCod(cad);
            } else {
                JOptionPane.showMessageDialog(null, "Erro na inserção do Cliente!!");
            }
        } else if (operacao == 1) {
            //c.setCodCliente(Integer.parseInt(tfCodigo.getText()));
            if (cliente.editar(c)) {
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar o Cliente!!");
            }
        } else if (operacao == 2) {
            c.setCodCliente(Integer.parseInt(tfCodigo.getText()));
            String texto = JOptionPane.showInputDialog(null, "Tem certeza que deseja DESABILITAR o cliente???\nIngresse o motivo da desabilitação.");
            c.setObs(texto);

	//o metodo excluir, na verdade não exclui oo objeto, ele apenas marco o atributo Ativo como false.
            if (cliente.excluir(c)) {
                JOptionPane.showMessageDialog(null, "Desabilitado com Sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Desabilitar o Cliente!!");
            }
        }

        //manipulação dos botões
        btNovo.setEnabled(true);
        btEditar.setEnabled(true);
        btDesabilitar.setEnabled(true);
        btSalvar.setEnabled(false);
        btCancelar.setEnabled(false);
        tfNome.requestFocus();

        //aqui ele verifica se o ArrayList não é vazio
        if (cad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cadastro vazio");
        } else {
           //captura o modelo da tabela, cria nova linha e aplica o modelo 
           if(operacao == 0){
            DefaultTableModel model = (DefaultTableModel) tbClientes.getModel();
            Object[] rowData = {""};
            model.addRow(rowData);
           }
           //seta os valores dos atributos do cliente nas colunas da tabela
            cad = cliente.list();
            for (int i = 0; i <cad.size() ; i++) {
                
                tbClientes.setValueAt(cad.get(i).getNome(), i, 0);
                tbClientes.setValueAt(cad.get(i).getTelefone(), i, 1);
                tbClientes.setValueAt(cad.get(i).getEnderco(), i, 2);
                tbClientes.setValueAt(cad.get(i).getNumero(), i, 3);
                tbClientes.setValueAt(cad.get(i).getBairro(), i, 4);
                tbClientes.setValueAt(cad.get(i).getCidade(), i, 5);
                }
            }
        
        //limpa e desativa os campos
        Util.EditarFrame.limparDados(this);
        Util.EditarFrame.desativaCampos(this);
        
        //manipula os botoes
        tfCodigo.setText("");
        btEditar.setEnabled(false);
        btDesabilitar.setEnabled(false);
        btSalvar.setText("SALVAR");
        btSalvar.setEnabled(false);
        tbClientes.setVisible(true);
        operacao = 1;
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        Util.EditarFrame.limparDados(this);
        Util.EditarFrame.desativaCampos(this);
        btNovo.setEnabled(true);
        btEditar.setEnabled(false);
        btDesabilitar.setEnabled(false);
        btSalvar.setEnabled(false);
        btCancelar.setEnabled(false);
        tfCodigo.setText("");
        tbClientes.setVisible(true);
        tfNome.requestFocus();
        operacao = 1;
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
    
            // Obtém o modelo de seleção de linha da JTable
            ListSelectionModel selectionModel = tbClientes.getSelectionModel();

            // Adiciona um MouseListener para tratar o evento de clique
            tbClientes.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Obtém o índice da linha clicada
                    int rowIndex = tbClientes.rowAtPoint(e.getPoint());
                    // Verifica se o clique foi em uma linha válida
                    if (rowIndex >= 0) {
                        // Define a linha clicada como a linha selecionada
                        selectionModel.setSelectionInterval(rowIndex, rowIndex);
                        //Cliente selecionado = (Cliente) cliente.pesquisar(rowIndex);
                        tfCodigo.setText(String.valueOf(rowIndex));
                        tfNome.setText( cad.get(rowIndex).getNome());
                        tfCelular.setText(String.valueOf(cad.get(rowIndex).getTelefone()));
                        tfCpf.setText(String.valueOf(cad.get(rowIndex).getCpf()));
                        tfRg.setText(String.valueOf(cad.get(rowIndex).getRg()));
                        tfEndereco.setText(cad.get(rowIndex+1).getEndereco());
                        tfNumero.setText(String.valueOf(cad.get(rowIndex).getNumero()));
                        tfApto.setText(String.valueOf(cad.get(rowIndex).getApto()));
                        tfBairro.setText(cad.get(rowIndex).getBairro());
                        tfEstado.setText(cad.get(rowIndex).getEstado());
                        tfCep.setText(String.valueOf(cad.get(rowIndex).getCep()));
                        //tfCidade.setText(cad.get(rowIndex).getCidade());
                        tfObservacao.setText(cad.get(rowIndex).getObs());
                    }
                    //manipula os botões
                    btNovo.setEnabled(false);
                    btEditar.setEnabled(true);
                    btDesabilitar.setEnabled(true);
                    btCancelar.setEnabled(true);
                }
            });
    }//GEN-LAST:event_tbClientesMouseClicked
    //este botão apenas ativa ps campos, manipula os botoes e muda a bandeira para 1 editar
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        util.Util.EditarFrame.ativaCampos(this);
        btSalvar.setEnabled(true);
        btEditar.setEnabled(false);
        btDesabilitar.setEnabled(false);
        operacao = 1;
    }//GEN-LAST:event_btEditarActionPerformed

    //este botão apenas ativa ps campos, manipula os botoes e muda a bandeira para 2 excluir
    private void btDesabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesabilitarActionPerformed
        util.Util.EditarFrame.ativaCampos(this);
        btSalvar.setText("DESABILITAR");
        btSalvar.setEnabled(true);
        btEditar.setEnabled(false);
        btDesabilitar.setEnabled(false);
        operacao = 2;
    }//GEN-LAST:event_btDesabilitarActionPerformed

   //o metodo main basicamente chama a view ClienteGUI
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Cria e mostra o form */
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDesabilitar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel cadastroClientes;
    private javax.swing.JComboBox<String> cbPontos;
    private javax.swing.JComboBox<String> cbPublicidade;
    private javax.swing.JComboBox<String> cbTabela;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField tfApto;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCep;
    private javax.swing.JLabel tfCodigo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfObservacao;
    private javax.swing.JTextField tfRg;
    // End of variables declaration//GEN-END:variables
}
