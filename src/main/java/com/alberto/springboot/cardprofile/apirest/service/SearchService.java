package com.alberto.springboot.cardprofile.apirest.service;

import java.util.List;

import com.alberto.springboot.cardprofile.apirest.entity.FeaturesCard;

public interface SearchService {
	public List<String> findCompatibleCards(FeaturesCard featuresCard);
}
