package com.graphql.java.news.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.java.news.model.Veicolo;
import com.graphql.java.news.service.VeicoloService;

@Component
public class VeicoloMutation implements GraphQLMutationResolver {

    @Autowired
    private VeicoloService veicoloService;

    public Veicolo creaVeicolo(final String type, final String modelCode, final String brandName,
	    final String launchDate) {
	return this.veicoloService.creaVeicolo(type, modelCode, brandName, launchDate);
    }
}
