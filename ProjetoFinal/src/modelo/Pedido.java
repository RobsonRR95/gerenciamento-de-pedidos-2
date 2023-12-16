/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import java.util.Objects;

public class Pedido {
    private int codPedido;
    private int codCliente;
    private float qtd_produto;
    private float valor_produtos;
    private Date entrega;
    private int pagamento;
    private Date data_pagamento;
    
    
     public Pedido() {
    }
     
     
    public Pedido(float qtd_produto, float valor_produtos, int codCliente) {
        this.qtd_produto = qtd_produto;
        this.valor_produtos = valor_produtos;
        this.codCliente = codCliente;
    }

    public Pedido(float qtd_produto, float valor_produtos, Date entrega, int pagamento, Date data_pagamento, int codCliente) {
        this.qtd_produto = qtd_produto;
        this.valor_produtos = valor_produtos;
        this.entrega = entrega;
        this.pagamento = pagamento;
        this.data_pagamento = data_pagamento;
        this.codCliente = codCliente;
    }
       
    
    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    
    public float getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(float qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public float getValor_produtos() {
        return valor_produtos;
    }

    public void setValor_produtos(float valor_produtos) {
        this.valor_produtos = valor_produtos;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codPedido;
        hash = 97 * hash + Float.floatToIntBits(this.qtd_produto);
        hash = 97 * hash + Float.floatToIntBits(this.valor_produtos);
        hash = 97 * hash + Objects.hashCode(this.entrega);
        hash = 97 * hash + this.pagamento;
        hash = 97 * hash + Objects.hashCode(this.data_pagamento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codPedido=" + codPedido + ", qtd_produto=" + qtd_produto + ", valor_produtos=" + valor_produtos + ", entrega=" + entrega + ", pagamento=" + pagamento + ", data_pagamento=" + data_pagamento + '}';
    }

    
    
}
