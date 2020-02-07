package com.mapper;

import com.po.Clazz;
import com.po.Student;

import java.util.List;
import java.util.Map;

public interface IStudentMapper {
    public int save(Student st);
    public int update(Student st);
    public int delById(Integer sid);
    public Student findByid(Integer sid);
    public List<Student> findPageAll(Map<String,Object> param);
    public int findmaxPage(int rows);
    public List<Clazz> doinit();
}
