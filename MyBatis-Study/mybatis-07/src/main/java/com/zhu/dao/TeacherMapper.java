package com.zhu.dao;

import com.zhu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {


    //获取老师
//    List<Teacher> getTeacher();

    //获取指定老师下的学生
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("id") int id);


}
