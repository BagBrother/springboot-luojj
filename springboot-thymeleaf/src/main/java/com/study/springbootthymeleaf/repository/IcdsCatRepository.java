package com.study.springbootthymeleaf.repository;

import com.study.springbootthymeleaf.model.IcdsCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IcdsCatRepository extends JpaRepository<IcdsCat,Integer> {

    IcdsCat findByCatId(Integer catId);

}
