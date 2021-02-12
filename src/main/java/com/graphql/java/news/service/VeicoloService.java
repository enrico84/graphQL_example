package com.graphql.java.news.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.graphql.java.news.model.Veicolo;
import com.graphql.java.news.repository.VeicoloRepository;

@Service
public class VeicoloService {

    @Autowired
    private VeicoloRepository veicoloRepository;

    @Transactional
    public Veicolo creaVeicolo(final String type, final String modelCode, final String brandName,
	    final String launchDate) {

	Veicolo v = new Veicolo();
	v.setType(type);
	v.setModelCode(modelCode);
	v.setBrandName(brandName);
	v.setLaunchDate(LocalDate.parse(launchDate));

	return v;
    }

    @Transactional(readOnly = true)
    public List<Veicolo> getVeicoli(final int count) {
	return veicoloRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Veicolo> getVeicolo(final int id) {
	return veicoloRepository.findById(id);
    }
}
