package com.bizImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.biz.IStudentBiz;
import com.mapper.IStudentMapper;
import com.po.Clazz;
import com.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Transactional
@Service(version="1.0",interfaceClass = IStudentBiz.class)
public class StudentBiz implements IStudentBiz {
    @Autowired
    public IStudentMapper iStudentMapper;

    public IStudentMapper getiStudentMapper() {
        return iStudentMapper;
    }

    public void setiStudentMapper(IStudentMapper iStudentMapper) {
        this.iStudentMapper = iStudentMapper;
    }

    @Override
    public int save(Student student) {
        return iStudentMapper.save(student);
    }

    @Override
    public int update(Student student) {
        return iStudentMapper.update(student);
    }

    @Override
    public int delById(Integer integer) {
        return iStudentMapper.delById(integer);
    }

    @Override
    public Student findByid(Integer integer) {
        return iStudentMapper.findByid(integer);
    }

    @Override
    public List<Student> findPageAll(int page, int rows) {
        if (page<1){
            page=1;
        }
        if (rows<1){
            rows=5;
        }
        Map<String,Object> param=new HashMap<>();
        param.put("page", page);
        param.put("rows", rows);
        return iStudentMapper.findPageAll(param);
    }

    @Override
    public int findmaxPage(int rows) {
        int maxpage=1;
        int maxrows=0;
        maxrows=iStudentMapper.findmaxPage(rows);
        if (maxrows>0){
            maxpage=maxrows%rows==0?maxrows/rows:maxpage/rows+1;
        }
        return maxpage;
    }

    @Override
    public List<Clazz> doinit() {
        return iStudentMapper.doinit();
    }
}
