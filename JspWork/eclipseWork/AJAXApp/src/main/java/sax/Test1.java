package sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//SAX를 처리할 수 있는 권한이 생긴다.
public class Test1 extends DefaultHandler{
	// DefaultHandler에 대해 다섯가지 method Override
	// 우리가 호출하는 것이 아닌 이벤트가 발생했을때 callback
	int cnt = 0;
	
	@Override
	public void startDocument() throws SAXException {
		// <students>다음
		System.out.println("문서의 시작");//한번만 발생
	}

	@Override
	public void endDocument() throws SAXException {
		// </students>다음
		System.out.println("문서의 끝");//한번만 발생
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// 시작 태그를 만났을 때 호출되는 매서드
		System.out.println(uri +", " + localName + ", " + qName + ", " + attributes);
		
		System.out.println(attributes.getValue("age") + ", " + attributes.getValue("addr"));
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// 끝 태그를 만났을 때 호출되는 매서드
		System.out.println(qName);
		
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("--------------------------");
		System.out.println(cnt++);
		System.out.println(start  + " : " + length );
		
		for(int i = start; i<start+length; i++){
			System.out.println(ch[i]);
		}
		System.out.println("--------------------------");
	}

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 공장 생성
		
		SAXParser parser = factory.newSAXParser();
		// 작업실 생성
		
		File f = new File("C:\\netsong7\\JspWork\\eclipseWork\\AJAXApp\\src\\main\\webapp\\sax\\test.xml");
		// 파일의 내용을 읽어오는 것이 아님
		
		Test1 test1 = new Test1();
		
		parser.parse(f, test1);
	}

}
