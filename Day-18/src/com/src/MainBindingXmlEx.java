package com.src;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class MainBindingXmlEx {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Shivam Verma");
		s1.setStudentAddress("Barabanki");
		
		Student s2 = new Student(); 
		s2.setStudentId(102);
		s2.setStudentName("Anshu Verma");
		s2.setStudentAddress("Sitapur");
		
		try {
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(s1, System.out);
		
		File file = new File("student.xml");
		marshaller.marshal(s1,file);
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
