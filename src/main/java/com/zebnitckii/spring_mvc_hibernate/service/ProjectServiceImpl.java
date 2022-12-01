package com.zebnitckii.spring_mvc_hibernate.service;

import com.zebnitckii.spring_mvc_hibernate.dao.ProjectDAO;
import com.zebnitckii.spring_mvc_hibernate.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDAO projectDAO;

    @Override
    @Transactional
    public List<Project> getAllProjects() {
        return projectDAO.getAllProjects();
    }

    @Override
    @Transactional
    public Project getProject(int id) {
        return projectDAO.getProject(id);
    }

    @Override
    @Transactional
    public void saveProject(Project project) {
        projectDAO.saveProject(project);
    }

    @Override
    @Transactional
    public void deleteProject(int id) {
        projectDAO.deleteProject(id);
    }
}
