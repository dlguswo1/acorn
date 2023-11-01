package dom;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Test1 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// DOM 방식으로 객체를 생성하는 클래스
		
		DocumentBuilder builder = factory.newDocumentBuilder();
		// 공장을 하나 생성
		
		FileInputStream xmlFile =  new FileInputStream("C:\\netsong7\\JspWork\\eclipseWork\\AJAXApp\\src\\main\\webapp\\dom\\test.xml");
		// 파일 불러오기
		
		Document doc =  builder.parse(xmlFile);
		// 실제 가져온 xml을 트리거에 올려놓은 걸 저장

		Element root = doc.getDocumentElement();
		// 가장 꼭대리 정보를 Element로 넘겨 받겠다.
		
		System.out.println(root.getNodeName());
		System.out.println(root.getNodeValue());
		System.out.println(root.getNodeType());
		
		System.out.println("-----------------------------------");
		
		Node n1 = root.getFirstChild();
		System.out.println(n1.getNodeName());
		System.out.println(n1.getNodeValue());
		System.out.println(n1.getNodeType());
		// 애는 앞에 공백도 영향받음, 머리 다음부분
		
		Node n2 = root.getLastChild();
		System.out.println(n2.getNodeName());
		System.out.println(n2.getNodeValue());
		System.out.println(n2.getNodeType());
		// 1: Element, 3: 공백, 텍스트
		
		// 홍길동의 이름과 나이 출력
		System.out.println(n1.getFirstChild().getFirstChild().getNodeValue());
		
		xmlFile.close();
		// 파일 닫아주기
	}

}
