package com.zebnitckii.spring_mvc_hibernate.dao;

import com.zebnitckii.spring_mvc_hibernate.entity.Position;

import java.util.List;

public interface PositionDAO {

    List<Position> getPositions();

    void deletePosition(int id);

    void savePosition(Position position);

    Position getPosition(int id);
}
