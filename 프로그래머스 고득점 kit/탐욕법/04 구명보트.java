import java.util.Arrays;

public class test4 {

	
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int start=0;
        int last=people.length-1;
        int sum=0;
        Arrays.sort(people);
        while(start<=last) {
        	if(start==last) {    
        		System.out.println(people[start]+"Å»Ãâ");
        		start++;
        		last--;
        		answer++;
        		break;
        	}
        	sum=people[last];
        	System.out.print(people[last]+"Å»Ãâ ");
        	while(true) {
        		if(sum+people[start]<=limit) {
        			sum+=people[start];        			
        			System.out.print(people[start]+"Å»Ãâ ");
        			start++;        			
        		}
        		else break;        		
        	}
        	last--;
        	answer++;
        	System.out.println(start+" , " +last);
        	System.out.println();
        }
        
        
        
        
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people= {70,50,80,50};
		int limit=100;
		System.out.println(solution(people, limit));

	}

}
