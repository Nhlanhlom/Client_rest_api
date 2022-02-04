package io.client.api.clientrestapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PhysicalAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String streetNumber;
    private String streetName;
    private String complex;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String country;

    @JsonIgnore
    @OneToOne(mappedBy = "address")
    private Client client;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date date;
}
