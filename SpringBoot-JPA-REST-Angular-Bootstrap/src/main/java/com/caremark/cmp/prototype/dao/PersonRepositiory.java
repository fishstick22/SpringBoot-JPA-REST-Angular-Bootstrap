package com.caremark.cmp.prototype.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.caremark.cmp.prototype.entity.Person;

public interface PersonRepositiory extends JpaRepository<Person, Integer> {

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN 'true' ELSE 'false' END FROM Person p WHERE p.name = ?1")
    public Boolean existsByName(String name);
}
