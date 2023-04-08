package com.example.demo.service;



import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl {

    List<Student> studentList=new ArrayList<>();


    public List<Student> getAllStudent() {
        studentList.add(new Student(1,"Ritik","Java","single",24,"Pune"));
        studentList.add(new Student(2,"Ritik","Java1","single1",25,"Mumbai"));
        studentList.add(new Student(3,"Ritik","Java2","single2",26,"Nagpur"));
        studentList.add(new Student(4,"Ritik","Java3","single3",27,"Panipat"));
        studentList.add(new Student(5,"Ritik","Java4","single4",28,"Shujalpur"));
        studentList.add(new Student(6,"Ritik","Java5","single5",29,"sarangpur"));
        studentList.add(new Student(7,"Ritik","Java6","single6",20,"raipur"));

        return studentList;
    }


    public Student getStudentById(long id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == (id)) {
                return studentList.get(i);
            }
        }
        return null;
    }

//    @Override
//    public void addStudent(Student student) {
//           studentDao.save(student);
//
//    }


    public void deleteStudent(long id) {
        studentList.removeIf(x -> x.getId() == (id));


    }
}
