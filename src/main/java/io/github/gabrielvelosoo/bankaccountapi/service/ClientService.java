package io.github.gabrielvelosoo.bankaccountapi.service;

import io.github.gabrielvelosoo.bankaccountapi.model.Client;
import io.github.gabrielvelosoo.bankaccountapi.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository repository;

    public Client findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Client create(Client client) {
        if(client.getId() != null && repository.existsById(client.getId())) {
            throw new NoSuchElementException("Client with id " + client.getId() + " already exists");
        }
        return repository.save(client);
    }
}
