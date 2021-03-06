package com.greenfox.fox_club.Repository;

import com.greenfox.fox_club.Model.Fox;
import com.greenfox.fox_club.Model.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {

    List<Fox> findAll();
    Fox findByFoxName(String foxName);
    List<Trick> findAllTrick();
}
