package com.zebnitckii.spring_mvc_hibernate.dao;

import com.zebnitckii.spring_mvc_hibernate.entity.Project;

import java.util.List;

public interface ProjectDAO {

    List<Project> getAllProjects();

    Project getProject(int id);

    void saveProject(Project project);

    void deleteProject(int id);
}
