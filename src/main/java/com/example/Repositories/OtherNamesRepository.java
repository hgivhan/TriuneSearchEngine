package com.example.Repositories;

import com.example.Models.OtherNames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherNamesRepository extends CrudRepository<OtherNames, Long> {
    OtherNames findByOtherName(String otherName);
    OtherNames findOtherNameById(Long otherNameId);
}
