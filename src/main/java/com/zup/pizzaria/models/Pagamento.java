package com.zup.pizzaria.models;

import java.time.LocalDateTime;

public class Pagamento {

    public Long id;

    public Long pedidoId;

    public String formaPagamento;

    public double valorPago;

    public LocalDateTime dataHoraPagamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Pagamento (Long pedidoId, String formaPagamento, double valorPago, double valorTotalDoPedido, LocalDateTime dataHoraPagamento){
        this.pedidoId = pedidoId;
        this.formaPagamento = formaPagamento;
        this.valorPago = valorPago;
        this.dataHoraPagamento = dataHoraPagamento;

        if (valorPago < valorTotalDoPedido){
            throw new IllegalArgumentException("O valor do pagamento não pode ser menor que o valor total do pedido");
        }
    }
    public Pagamento(Long pedidoId){
    }
    public Pagamento(){
    }

}