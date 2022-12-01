package com.zebnitckii.spring_mvc_hibernate.service;

import com.zebnitckii.spring_mvc_hibernate.dao.PositionDAO;
import com.zebnitckii.spring_mvc_hibernate.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    private PositionDAO positionDAO;

    @Override
    @Transactional
    public List<Position> getPositions() {
        return positionDAO.getPositions();
    }

    @Override
    @Transactional
    public void deletePosition(int id) {
        positionDAO.deletePosition(id);
    }

    @Override
    @Transactional
    public void savePosition(Position position) {
        positionDAO.savePosition(position);
    }

    @Override
    @Transactional
    public Position getPosition(int id) {
        return positionDAO.getPosition(id);
    }
}
