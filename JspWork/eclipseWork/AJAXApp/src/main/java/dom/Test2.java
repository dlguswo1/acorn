package dom;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Test2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// DOM 방식으로 객체를 생성하는 클래스
		
		DocumentBuilder builder = factory.newDocumentBuilder();
		// 공장을 하나 생성
		
		Document doc = builder.parse("C:\\netsong7\\JspWork\\eclipseWork\\AJAXApp\\src\\main\\webapp\\dom\\test2.xml");
		// 실제 가져온 xml을 트리거에 올려놓은 걸 저장
		
		Element root = doc.getDocumentElement();
		
		for(Node n = root.getFirstChild(); n != null;
				n = n.getNextSibling()){
				// 공백 생각해서 다음자식 까지
			
			// student 태그에 address태그 추가
			if(n.getNodeType() == Node.ELEMENT_NODE) {
				// 1인지 아닌지 1대신 Node.ELEMENT_NODE라고 사용
				// n.getNodeName() == Node.equals("student")로 해도됨
				
				Element e = doc.createElement("address");
				Text t = doc.createTextNode("서울시 강남구");
				// 아직 "서울시 강남구"가 사이에 안들어감
				
				e.appendChild(t);
				n.appendChild(e);
				// 사이에 추가
			}
		}
		
		// 홍길동의 주소
		System.out.println(root.getFirstChild().getNextSibling().getLastChild().getTextContent());
		// 첫번째의 다음(태그)의 마지막의 내용
		
		// 수정한 내용을 실제 파일에 적용
		TransformerFactory transFactory = TransformerFactory.newInstance();
		// 공장
		Transformer trans = transFactory.newTransformer();
		// 작업실
		
		trans.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		trans.setOutputProperty(OutputKeys.INDENT, "yes");
		// 어떤속성, 지정
		// INDENT : 들여쓰기 여부 (공백이 생김)
		
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new FileOutputStream("C:\\netsong7\\JspWork\\eclipseWork\\AJAXApp\\src\\main\\webapp\\dom\\test2.xml"));
		// 준비
		
		trans.transform(source, result);
		// 저장
	}
}
