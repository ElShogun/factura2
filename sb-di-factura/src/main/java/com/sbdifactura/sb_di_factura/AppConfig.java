package com.sbdifactura.sb_di_factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.sbdifactura.sb_di_factura.models.Item;
import com.sbdifactura.sb_di_factura.models.Product;

@Configuration
@PropertySource("classpath:text.properties")
public class AppConfig {

    @Bean
    List<Item> invoItems(){
        Product product = new Product();
        product.setName("Camara sony");
        product.setPrice(333);
        
        Product product2 = new Product("Portatil asus", 33333);

        List<Item> items = Arrays.asList(new Item(product, 2), new Item(product2,4));

        return items;
    }

    @Bean
    @Primary
    List<Item> invoOfiiceItems(){
        Product product1 = new Product("Monitor 1", 300);
        Product product2 = new Product("Monitor 2", 400);
        Product product3 = new Product("Monitor 3", 500);
        Product product4 = new Product("Monitor 4", 600);
        Product product5 = new Product("Portatil asus", 33333);

        List<Item> items = Arrays.asList(new Item(product1, 2), new Item(product2,3),
        new Item(product3,4), new Item(product4, 5), new Item(product5,6));

        return items;
    }
}
