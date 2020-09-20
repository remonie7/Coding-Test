import java.util.Arrays;

public class test3 {
	public static int solution(int[] citations) {
        int answer = 0;
        int count=1;
        Arrays.sort(citations);
        for(int i=citations.length-1; i>=0; i--) {
        	if(citations[i]<=count) {
        		answer = Math.max(citations[i], count-1);
        		break;
        	}
        	else count++;
        }
        if(count>citations.length) answer=citations.length;
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {1, 5, 5, 5, 5};
		System.out.println(solution(numbers));
	}
}
