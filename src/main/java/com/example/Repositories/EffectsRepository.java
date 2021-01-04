package com.example.Repositories;

import com.example.Models.Effects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EffectsRepository extends CrudRepository<Effects, Long> {

    Effects findEffectsByName(String effects);
    Effects findEffectsById(Long effectsId);
}
