package com.softmaq.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softmaq.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{
	
}
