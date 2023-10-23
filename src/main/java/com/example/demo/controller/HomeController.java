package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String home() {
        return "20192681 박순용 /instructor /teaches /student /takes 테이블 조회 가능 ";
    }

    @GetMapping("/instructor")
    public List<Map<String, Object>> instructor() {
        return jdbcTemplate.queryForList("select * from instructor");
    }

    @GetMapping("/student")
    public List<Map<String, Object>> student() {
        return jdbcTemplate.queryForList("select * from student");
    }

    @GetMapping("/takes")
    public List<Map<String, Object>> takes() {
        return jdbcTemplate.queryForList("select * from takes");
    }

    @GetMapping("/teaches")
    public List<Map<String, Object>> teaches() {
        return jdbcTemplate.queryForList("select * from teaches");
    }
}
