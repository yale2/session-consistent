package com.yale.sessionconsistent.mapper;

import com.yale.sessionconsistent.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResumeMapper extends JpaRepository<Resume, Long>, JpaSpecificationExecutor<Resume> {
}
