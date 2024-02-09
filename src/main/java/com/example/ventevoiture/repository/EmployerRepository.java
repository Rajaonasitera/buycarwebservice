package com.example.ventevoiture.repository;

import com.example.ventevoiture.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployerRepository extends JpaRepository<Employer,Integer> {
    Optional<Employer> findEmployerById(Long id);

    @Query("from employer  where  email = ?1")
    Optional<Employer> findEmployerByEmail(String email);

    @Query("select count(id) from employer where role != 'ADMIN'")
    public int count_utilisateur();
}
