package com.graphql.java.news.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.java.news.model.Veicolo;
import com.graphql.java.news.service.VeicoloService;

@Component
public class VeicoloQuery implements GraphQLQueryResolver {

    @Autowired
    private VeicoloService veicoloService;

    public List<Veicolo> getVeicoli(final int count) {
	return this.veicoloService.getVeicoli(count);
    }

    public Optional<Veicolo> getVeicolo(final int id) {
	return this.veicoloService.getVeicolo(id);
    }

}
