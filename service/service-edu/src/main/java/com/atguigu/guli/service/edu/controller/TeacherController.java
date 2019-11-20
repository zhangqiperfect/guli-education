package com.atguigu.guli.service.edu.controller;


import com.atguigu.guli.service.edu.entity.Teacher;
import com.atguigu.guli.service.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author ZQ
 * @since 2019-11-20
 */
@RestController
@RequestMapping("admin/edu/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("list")
    public List<Teacher> listAll() {
        return teacherService.list(null);
    }
}

