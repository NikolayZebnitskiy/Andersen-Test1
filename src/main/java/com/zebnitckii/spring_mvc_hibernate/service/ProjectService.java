package com.zebnitckii.spring_mvc_hibernate.service;

import com.zebnitckii.spring_mvc_hibernate.entity.Project;

import java.util.List;

public interface ProjectService {

    List<Project> getAllProjects();

    Project getProject(int id);

    void saveProject(Project project);

    void deleteProject(int id);
}
