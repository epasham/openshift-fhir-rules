package com.vizuri.fhir.repository;

import java.util.List;

import org.hl7.fhir.dstu3.model.Observation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservationRepository extends MongoRepository<Observation, String> {
	List<Observation>findBySubjectReference(String subject);
}
