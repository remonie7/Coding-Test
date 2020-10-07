import java.util.Arrays;

public class brute_force_search_test2 {
    public static int[] solution(int brown, int yellow) {
    	int brown_row_col_half = (brown-4)/2;
        int[] answer = new int[2];
    	for(int i=1; i<=(brown_row_col_half/2); i++) {
    		if(i*(brown_row_col_half-i) == yellow) {
    			answer[0]=brown_row_col_half-i +2;
    			answer[1]=i+2;
    			break;
    		}
    	}
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown = 10;
		int yellow = 2;
		System.out.println(Arrays.toString(solution(brown, yellow)));
	}
}
