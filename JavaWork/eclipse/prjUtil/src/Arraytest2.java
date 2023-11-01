public class Arraytest2{
	public static void main(String[] args)throws java.io.IOException{
		char[] data = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		System.out.println("찾고자 하는 문자 입력: ");
		char search = (char)System.in.read();
		
		boolean flag = false;
		int i =0;
		for(; i<data.length; i++){
			if(search == data[i]){
				flag = true;
				break;
			}else{
				flag = false;
			}
		}
		
		if (flag == true)
			System.out.println("찾았다"+ (i+1) + "번째 있다.");
		else
			System.out.println("못찾았다");
		
		// 이진 검색
		
		flag = false;
        int start = 0, end = data.length;

        while (start < end) {
            System.out.println(start + "~" + end);
            if (search == data[(start + end) / 2]) {
                flag = true;
                break;
            } else if (search > data[(start + end) / 2]) {
                start = ((start + end) / 2) + 1;
            } else {
                end = ((start + end) / 2);
            }
        }

        if (flag) {
            System.out.println("찾았다. index = " + (start + end) / 2);
        } else {
            System.out.println("못 찾았다.");
        }
	}
}