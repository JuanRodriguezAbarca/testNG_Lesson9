package core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.xml.sax.SAXException;

import tests.SimpleTest;



public class Runner {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		
		TestNG testng = new TestNG();
		for(XmlSuite suite : new Parser("./testng.xml").parseToList()){
			testng.setCommandLineSuite(suite);
		}
		testng.run();
	}
	
	/**
	 * 		
	 * //create xml suite named 'Test Suite'
		XmlSuite suite = new XmlSuite();
		suite.setName("Test Suite Juan");
		
		//Create XmlTest
		XmlTest test = new XmlTest(suite);
		test.setName("Test");
		
		//form lit of classes to run
		ArrayList<XmlClass> xmlClasses = new ArrayList<XmlClass>();
		xmlClasses.add(new XmlClass(SimpleTest.class));
		
		//add classes to test
		test.setClasses(xmlClasses);
		
		//create TestNG instance
		TestNG testNG=new TestNG();
		testNG.setXmlSuites(Arrays.asList(suite));
		
		//add Listener
		testNG.addListener(new TestListenerAdapter());
		
		// run suite
		testNG.run();
	 */

}
