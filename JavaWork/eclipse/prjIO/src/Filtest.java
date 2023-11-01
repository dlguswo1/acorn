import java.io.File;
import java.util.Date;

public class Filtest {
	public static void main(String[] args) {
		// TODO File 클래스

		File f  = new File("C:\\netsong7\\JavaWork//emp.dat");
		
		if(f.exists()) {//exists : 존재하는지
			System.out.println("파일의 이름 : " + f.getName());
			System.out.println("상대 경로 : " + f.getPath());
			System.out.println("정대 경로 : " + f.getAbsolutePath());
			System.out.println("크키 : " + f.length() + "byte");
			System.out.println("마지막 수정일자 : " + new Date(f.lastModified()));
		}
		else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		f.delete();
	}

}
