package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCliente(ClienteDTO clienteDTO) {
        // Salva o cliente no banco de dados
        Cliente clienteSalvo = new Cliente();
        clienteSalvo.setNome(clienteDTO.getNomeCliente());
        clienteSalvo.setEmail(clienteSalvo.getEmail());
        clienteSalvo.setTelefone(clienteSalvo.getTelefone());

        // Retorna um DTO com os dados do cliente salvo
        return clienteRepository.save(clienteSalvo);
    }
}