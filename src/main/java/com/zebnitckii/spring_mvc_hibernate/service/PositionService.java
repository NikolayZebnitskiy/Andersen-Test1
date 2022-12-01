package com.zebnitckii.spring_mvc_hibernate.service;

import com.zebnitckii.spring_mvc_hibernate.entity.Position;

import java.util.List;

public interface PositionService {

    List<Position> getPositions();

    void deletePosition(int id);

    void savePosition(Position position);

    Position getPosition(int id);
}
