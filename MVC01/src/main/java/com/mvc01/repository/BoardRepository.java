package com.mvc01.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {

    List<BoardEntity> getList();
}
