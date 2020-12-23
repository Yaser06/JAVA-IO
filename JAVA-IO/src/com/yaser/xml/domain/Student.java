package com.yaser.xml.domain;

import java.io.OutputStream;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

public class Student {
	private String firstName;
	private String lastName;
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public Student(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public Student(Element student) {
	}
	public Element getStudentXML() {
		Element studentNode =new Element("student");
		Element firstNameNode=new Element("firstName");
		Element lastNameNode=new Element("lastName");
		firstNameNode.appendChild(firstName);
		lastNameNode.appendChild(lastName);
		studentNode.appendChild(firstNameNode);
		studentNode.appendChild(lastNameNode);
		return studentNode;
	}
	public static void serializeInFormat(OutputStream out, Document document) throws Exception {
		Serializer serializer = new Serializer(out, "UTF-8");
		serializer.setIndent(4);
		serializer.setMaxLength(100);
		serializer.write(document);
		serializer.flush();
	}
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
