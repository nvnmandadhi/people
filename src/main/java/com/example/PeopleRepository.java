package com.example;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface PeopleRepository extends DatastoreRepository<Person, Long> {
}
