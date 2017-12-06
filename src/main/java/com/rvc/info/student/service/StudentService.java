package com.rvc.info.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.rvc.info.student.Student;

@Service
public class StudentService {
	private  List<Student> l=new ArrayList<Student>();
	public  void loadData() {
		
		l.add(new Student(1,"Ranjit","Chavan","rvcinfo9600@gmail.com","192168137150"));
		l.add(new Student(2,"Danny","Chavan","rvcinfo9600@gmail.com","192168137150"));
		l.add(new Student(3,"Dipak","Chavan","rvcinfo9600@gmail.com","192168137150"));
	
		
	}
	{
		loadData();
		
	}
	
	public  List<Student>getAllStudent() {
		
		return l;
	}
	
	public  Student getStudent(Integer id) {
		Student s=null;
		ListIterator<Student> listiter=l.listIterator();
		while(listiter.hasNext()) {
			s=(Student)listiter.next();
			System.out.println("id"+id);
			if(s.getId()==id) {
				System.out.println(s.getId());
				return s;
			}
			
		}
		
		return null;
	}
	
}
