package io.client.api.clientrestapi.repository;

import io.client.api.clientrestapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByIdNumber(String idNumber);
    Client findByMobileNumber(String mobileNumber);
    Client findByFirstName(String firstName);
}
