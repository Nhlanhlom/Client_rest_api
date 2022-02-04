package io.client.api.clientrestapi.api;

import io.client.api.clientrestapi.api.requests.ClientRequest;
import io.client.api.clientrestapi.model.Client;
import io.client.api.clientrestapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/client")
public class ClientApi {

    private ClientService clientService;

    @Autowired
    public ClientApi(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<?> getClient (ClientRequest clientRequest){
        Client client = clientService.getClient(clientRequest);
        return ResponseEntity.ok(client);
    }

    @PostMapping
    public ResponseEntity<?> createClient(@RequestBody Client client) {
        Client createdClient = clientService.postClient(client);
        return ResponseEntity.ok(createdClient);
    }

    @PutMapping
    public ResponseEntity<?> updateClient(@RequestBody Client client) {
        Client createdClient = clientService.postClient(client);
        return ResponseEntity.ok(createdClient);
    }

    @DeleteMapping
    public void deleteClient(@RequestBody Client client) {
        clientService.deleteClient(client);
    }
}
