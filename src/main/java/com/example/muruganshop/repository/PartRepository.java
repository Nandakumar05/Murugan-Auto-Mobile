package com.example.muruganshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.muruganshop.entity.Part;

public interface PartRepository extends JpaRepository<Part, Long> {

}