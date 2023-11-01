public class Scannertest{
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("이름 입력:");
		String name = scan.next();
		System.out.println("당신의 이름은 "+ name + "이다.");
		
		System.out.println("나이 입력:");
		int age = scan.nextInt();
		System.out.println("당신의 나이는" + age + "이다.");
		
		System.out.println("점수 입력:");
		double point = scan.nextDouble();
		System.out.println("당신의 점수는" + point + "이다.");
		
	}
}