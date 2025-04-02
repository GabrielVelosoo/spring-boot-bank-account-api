package io.github.gabrielvelosoo.bankaccountapi.repository;

import io.github.gabrielvelosoo.bankaccountapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
