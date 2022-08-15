package com.devhong.jenkins.devhong.service;

import com.devhong.jenkins.devhong.repository.MainRepository;
import com.devhong.jenkins.devhong.vo.MainVo;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    MainRepository mr;

    public List<MainVo> getMain(){
        List<MainVo> mainList = null;

        try {
            mainList = mr.findAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return mainList;
    }

    public MainVo save(MainVo mainVo){
        MainVo resultVo = null;
        try{
            resultVo = mr.save(mainVo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultVo;
    }
}
