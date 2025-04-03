package io.github.gabrielvelosoo.bankaccountapi.controller;

import io.github.gabrielvelosoo.bankaccountapi.model.Client;
import io.github.gabrielvelosoo.bankaccountapi.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(value = "/clients", produces = "application/json")
@RequiredArgsConstructor
public class ClientController implements GenericController {

    private final ClientService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id) {
        Client foundClient = service.findById(id);
        return ResponseEntity.ok(foundClient);
    }

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client client) {
        Client createdClient = service.create(client);
        URI location = generateLocation(createdClient.getId());
        return ResponseEntity.created(location).body(createdClient);
    }
}
