package com.haisshuais.desafiocrud.repositories;

import com.haisshuais.desafiocrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
