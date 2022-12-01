package com.zebnitckii.spring_mvc_hibernate.dao;

import com.zebnitckii.spring_mvc_hibernate.entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PositionDAOImpl implements PositionDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Position> getPositions() {

        Session session = sessionFactory.getCurrentSession();
        List<Position> positions = session.createQuery("from Position", Position.class).getResultList();

        return positions;
    }

    @Override
    public void deletePosition(int id) {

        Session session = sessionFactory.getCurrentSession();

        Query<Position> query = session.createQuery("delete from Position where id=:positionId");
        query.setParameter("positionId", id);
        query.executeUpdate();
    }

    @Override
    public void savePosition(Position position) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(position);
    }

    @Override
    public Position getPosition(int id) {

        Session session = sessionFactory.getCurrentSession();
        Position position = session.get(Position.class, id);

        return position;
    }
}
