package com.yale.sessionconsistent.service;


import com.yale.sessionconsistent.entity.Resume;
import com.yale.sessionconsistent.mapper.ResumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;

    public List<Resume> findAll() {
        return resumeMapper.findAll();
    }

    public void saveOrUpdate(Resume user) {
        resumeMapper.save(user);
    }

    public void deleteById(Long id) {
        resumeMapper.deleteById(id);
    }

    public Resume findById(Long id) {
        return resumeMapper.findById(id).get();
    }
}
