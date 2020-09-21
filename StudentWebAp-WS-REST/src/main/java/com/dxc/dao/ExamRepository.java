package com.dxc.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer> {

	Optional<Exam> findById(String id);

}
