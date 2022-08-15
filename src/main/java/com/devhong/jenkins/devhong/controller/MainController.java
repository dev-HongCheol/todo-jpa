package com.devhong.jenkins.devhong.controller;

import com.devhong.jenkins.devhong.service.MainService;
import com.devhong.jenkins.devhong.vo.MainVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    MainService ms;

    @GetMapping("todos")
    public List<MainVo> getTodo() {
        List<MainVo> mainList = null;
        try{
            mainList = ms.getMain();
        }catch(Exception e){
            e.printStackTrace();
        }

        return mainList;
    }

    @PostMapping("todos")
    public MainVo addTodo(@RequestBody MainVo mainVo) {
        MainVo resultVo = null;
        try{
            resultVo = ms.save(mainVo);
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultVo;
    }
}
