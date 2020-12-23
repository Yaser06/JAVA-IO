package com.yaser.xml.program;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.yaser.xml.domain.Student;

import nu.xom.Document;
import nu.xom.Element;

public class DriverStudent {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Yaser","Aktas"));
		students.add(new Student("Rutkay", "Serifoglu"));
		students.add(new Student("Bekir", "Derebey"));
		students.add(new Student("Ozkan","Yildirim"));
		System.out.println(students);
		
		Element root = new Element("students");
		Document document = new Document(root);
		
		for (Student student : students) {
			root.appendChild(student.getStudentXML());
		}
		
		try {
			Student.serializeInFormat(System.out, document);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Student.serializeInFormat(new BufferedOutputStream(new FileOutputStream(new File("students.xml"))), document);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
