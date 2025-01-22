package com.zup.pizzaria.services;
import org.springframework.stereotype.Service;
import com.zup.pizzaria.dtos.PedidoDTO;
import com.zup.pizzaria.models.Pedido;
import com.zup.pizzaria.repository.ClienteRepository;
import com.zup.pizzaria.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private Pedido pedido;

    public PedidoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
    }

    public PedidoDTO criarPedido(Pedido pedido) {
        this.pedido = pedido;
        Pedido pedidocliente = pedidoRepository.buscarPedidoPorCliente(1L)
                .orElseThrow("Cliente não encontrado");

        // Criar o pedido
        Pedido pedido1 = new Pedido();
        pedido.setClienteId(pedido1.getId());
        pedido.setDescricao(pedido1.getDescricao());

        // Salvo o pedido no repositório
        pedidoRepository.save(pedido1);

        // Retorno o DTO com os dados do cliente e do pedido
        return new PedidoDTO(pedido1.getDescricao(), pedido1.getClienteId(), String.valueOf(pedido1.getId()));
    }
}