package io.client.api.clientrestapi.service;

import io.client.api.clientrestapi.api.exception.BadRequestException;
import io.client.api.clientrestapi.api.requests.ClientRequest;
import io.client.api.clientrestapi.model.Client;
import io.client.api.clientrestapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ClientService {

    ClientRepository clientRepository;

    @Value("${saIdNumberRegex}")
    private String saIdNumberRegex;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Client getClient (ClientRequest clientRequest) {
        Client client = null;

        if (!clientRequest.getIdNumber().equals(null) && validateSAIdNumber(clientRequest.getIdNumber())){
            client = clientRepository.findByIdNumber(clientRequest.getIdNumber());
        }

        else if (!clientRequest.getMobileNumber().equals(null)){
            client = clientRepository.findByMobileNumber(clientRequest.getMobileNumber());
        }

        else if (!clientRequest.getFirstName().equals(null)){
            client = clientRepository.findByFirstName(clientRequest.getFirstName());
        }
        else {
            throw new BadRequestException("Client request must either by Id Number, Mobile Number or First Name");
        }

        return client;
    }

    public Client postClient (Client client) {
        if(validateSAIdNumber(client.getIdNumber())){
            throw new BadRequestException("Client Id Number must be a valid South African ID Number");
        }
        return clientRepository.saveAndFlush(client);
    }

    public void deleteClient (Client client) {
        clientRepository.delete(client);
    }

    private boolean validateSAIdNumber(String idNumber){
        Pattern p = Pattern.compile(saIdNumberRegex);//. represents SA ID Number
        Matcher m = p.matcher(idNumber);
        return m.matches();
    }

}
