
public class jacob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(6, 13 ,new int[] {100,63,1,6,2,13,1,2,3,4,4,13}));
	}

	static int solution(int X, int Y,int[] A ) {
		//int[] A = {4,4,6,13,6,0};
		int N = A.length;
		int result = -1;
		int nX = 0;
		int nY = 0;
		
		for (int i = 0; i < N; i++) {
			if (A[i] == X)
				nX += 1;
			else if (A[i] == Y)
				nY += 1;
			if (nX !=0 && nY!=0 && nX == nY) // Change 1
				result = i;
		}
		return result;
	}

}
