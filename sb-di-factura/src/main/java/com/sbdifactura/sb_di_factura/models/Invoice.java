package com.sbdifactura.sb_di_factura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description}")
    private String description;

    @Autowired
    private List<Item> item;

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItem() {
        return item;
    }
    public void setItem(List<Item> item) {
        this.item = item;
    }

    public int getTotal(){
        int total = 0;
        for (Item item : item) {
            total += item.getImport();
        }

        return total;
    }

    
}
