package com.alberto.springboot.cardprofile.apirest.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

import com.alberto.springboot.cardprofile.apirest.entity.Relation;

@Repository
public interface RelationRepository extends CrudRepository<Relation, Integer> {

}
