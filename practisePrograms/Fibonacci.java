
public class Fibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int seriesCount = 10;
		System.out.println(num1+" ");
		System.out.println(num2+" "); 
		int temp;
		for(int i =0;i<seriesCount;i++) {
			temp = num2;
			num2 = num1+num2;
			num1 = temp;
			System.out.println(num2+" ");
		}
				

	}

}
