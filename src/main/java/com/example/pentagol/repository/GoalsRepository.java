package com.example.pentagol.repository;

import com.example.pentagol.dto.GoalsDto;
import com.example.pentagol.model.Goals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalsRepository extends JpaRepository<Goals, GoalsDto> {
}
