package com.example.Repositories;

import com.example.Models.OtherNames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherNamesRepository extends CrudRepository<OtherNames, Long> {
    OtherNames findOtherNamesByName(String otherName);
    OtherNames findOtherNamesById(Long otherNameId);
}
