package com.example.carrental.repository;

import com.example.carrental.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {

    List<Sample> findByName(String name);

}
