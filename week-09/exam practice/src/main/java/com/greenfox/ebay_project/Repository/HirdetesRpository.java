package com.greenfox.ebay_project.Repository;

import com.greenfox.ebay_project.Model.Hirdetes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HirdetesRpository extends CrudRepository<Hirdetes, Long> {

    Hirdetes findFirstById(Long id);
}
