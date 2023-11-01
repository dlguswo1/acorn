
public class CurrentTimetest {

	public static void main(String[] args) {
		// TODO 시간 차이 구하기 : System.currentTimeMillis()
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i =0; i<100000000000L; i++) {
			sum +=1;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("걸린시간 : " + ((end-start)/1000));

	}

}
