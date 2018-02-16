package com.ahuja.sumit.id.repository;

import com.ahuja.sumit.id.domain.Identifier;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "id_service")
public interface IdentifierRepository extends CouchbaseRepository<Identifier,String> {
}
