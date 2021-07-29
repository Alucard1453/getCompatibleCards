package com.alberto.springboot.cardprofile.apirest.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alberto.springboot.cardprofile.apirest.entity.FeaturesCard;
import com.alberto.springboot.cardprofile.apirest.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchRestController {
	@Autowired
	private SearchService searchservice;
	
	@GetMapping("/card")
	public List<String> searchCard(@RequestBody FeaturesCard request){
		List<String> response = new LinkedList<String>();
		response=searchservice.findCompatibleCards(request);
		return response;
	}
}
