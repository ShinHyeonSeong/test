package com.example.bpm.repository;

import com.example.bpm.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
//    ProjectEntity save (ProjectEntity projectEntity);
//
//    Optional<ProjectEntity> findById(Long id);
//
//    void deleteById(Long id);
}