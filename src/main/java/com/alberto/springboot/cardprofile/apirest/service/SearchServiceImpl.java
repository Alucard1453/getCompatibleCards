package com.alberto.springboot.cardprofile.apirest.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alberto.springboot.cardprofile.apirest.entity.FeaturesCard;
import com.alberto.springboot.cardprofile.apirest.entity.Relation;
import com.alberto.springboot.cardprofile.apirest.repository.RelationRepository;

@Service
public class SearchServiceImpl implements SearchService{
	@Autowired
    private RelationRepository relationRepository;
	private List<Relation> data = new LinkedList<Relation>();
	private List<String> response = new LinkedList<String>();
	
	@Override
	public List<String> findCompatibleCards(FeaturesCard featuresCard) {
		response.clear();
		data=(List<Relation>) relationRepository.findAll();
		data.stream().forEach((Relation relation)->{
			if(relation.getPassion().getNamePassion().equals(featuresCard.getPassion()) && (relation.getAgeFrom() <= featuresCard.getAge()) && (relation.getAgeTo() >= featuresCard.getAge()) && (relation.getSalaryFrom() <= featuresCard.getSalary()) && (relation.getSalaryTo() >= featuresCard.getSalary()) )
				response.add(relation.getCreditCard().getNameCard());
		});
		return response;
	}
}
