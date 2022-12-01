package com.zebnitckii.spring_mvc_hibernate.dao;

import com.zebnitckii.spring_mvc_hibernate.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectDAOImpl implements ProjectDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Project> getAllProjects() {

        Session session = sessionFactory.getCurrentSession();
        List<Project> projects = session.createQuery("from Project", Project.class).getResultList();

        return projects;
    }

    @Override
    public Project getProject(int id) {

        Session session = sessionFactory.getCurrentSession();
        Project project = session.get(Project.class, id);

        return project;
    }

    @Override
    public void saveProject(Project project) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(project);
    }

    @Override
    public void deleteProject(int id) {

        Session session = sessionFactory.getCurrentSession();
        Query<Project> query = session.createQuery("delete from Project where id=:projectId");
        query.setParameter("projectId", id);
        query.executeUpdate();
    }
}
