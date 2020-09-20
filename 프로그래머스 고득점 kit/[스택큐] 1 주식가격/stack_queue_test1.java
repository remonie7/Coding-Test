
import java.util.Arrays;

public class stack_queue_test1 {
	
    public static int[] solution(int[] prices) {
    	int[] answer = new int[prices.length];
    	int count, arycount;
    	arycount=0;
    	
    	for(int i=0; i<prices.length-1; i++) {
    		count=0;
    		for(int j=i+1; j<prices.length; j++) {
    			count++;
    			if(prices[i]>prices[j]) break;
    		}
    		answer[arycount]=count;
    		arycount++;
    	}    
    	answer[arycount]=0;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(num)));		
	}
}
