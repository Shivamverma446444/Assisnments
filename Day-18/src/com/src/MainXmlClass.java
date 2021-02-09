package com.src;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MainXmlClass {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("employees.xml"));
			
			Element element = document.getDocumentElement();
			System.out.println(element.getNodeName());
			NodeList list  = element.getChildNodes();
			System.out.println(list.getLength());
			for(int i=0; i<list.getLength();i++) {
				Node node = list.item(i);
				System.out.println(node.getNodeName()+"-----"+node.getTextContent());
			}
		} catch (ParserConfigurationException |SAXException |IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
