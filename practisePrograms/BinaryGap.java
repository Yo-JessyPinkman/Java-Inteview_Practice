
public class BinaryGap {

	// 529 has binary representation 1000010001
	public static void main(String[] args) {

		int N = 15;
		int reminder;
		int temp = 0;
		StringBuilder binaryValue = new StringBuilder();
		for (int i = 0; N != 1; i++) {
			reminder = N % 2;

			N = N / 2;
			binaryValue = binaryValue.append(reminder);
		}
		if (N == 1) {
			binaryValue.append(1);
		}

		binaryValue = binaryValue.reverse();
		
		int counter = 0;
		for (int i = 0; i < binaryValue.length(); i++) {

			if (binaryValue.charAt(i)=='1') {
				if (counter > temp) {
					temp = counter;
				}
				counter = 0;
			} else {
				counter++;
			}
		}
		 if(temp==0) {
			 System.out.println("No Binary space");
		 }else {
			 System.out.println("Binary space of given number is " + temp); 
		 }
		
	}

}
