package com.devhong.jenkins.devhong.repository;

import com.devhong.jenkins.devhong.vo.MainVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainRepository extends JpaRepository<MainVo, String> {
    List<MainVo> findAll();
    MainVo save(MainVo vo);
}
