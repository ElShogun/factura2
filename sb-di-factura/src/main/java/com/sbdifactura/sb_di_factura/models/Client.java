package com.sbdifactura.sb_di_factura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Client {

    @Value("${client.name}")
    private String name;

    @Value("${client.lastname}")
    private String lastname;

    public Client() {
        
    }

    @PostConstruct
    public void init(){
        //Trabajar con los atributos del objeto una vez inicializado
    }

    @PreDestroy
    public void preDestroy(){
        //hacer algo antes de destruir el objeto
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
