package com.yaser.xml.domain;

import java.io.File;
import java.util.ArrayList;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

public class Students extends ArrayList<Student>{
	public Students(File in) throws Exception{
		Document document = new Builder().build(in);
		Elements elements = document.getRootElement().getChildElements();
		for (Element element : elements) {
				add(new Student(element));
		}
	}	

}
