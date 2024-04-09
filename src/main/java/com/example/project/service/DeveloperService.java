package com.example.project.service;

import com.example.project.entity.DeveloperEntity;

import java.util.List;

public interface DeveloperService {

    DeveloperEntity saveDeveloper(DeveloperEntity developer);

    DeveloperEntity updateDeveloper(DeveloperEntity developer);

    DeveloperEntity getDeveloperById(Integer id);

    DeveloperEntity getDeveloperByEmail(String email);

    List<DeveloperEntity> getAllDevelopers();

    List<DeveloperEntity> getAllActiveDevelopers(String specialty);

    void softDeleteById(Integer id);

    void hardDeleteById(Integer id);
}
