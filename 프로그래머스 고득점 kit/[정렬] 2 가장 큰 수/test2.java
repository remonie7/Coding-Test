
import java.util.Arrays;
import java.util.Comparator;


public class test2 {
	
    public static String solution(int[] numbers) {
        String answer = "";        

        String[] numStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
        	numStr[i] = (String.valueOf(numbers[i]));
        }
        

        Arrays.sort(numStr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        answer=Arrays.toString(numStr).replace(", ","").replace("[","").replace("]","");
        if(answer.charAt(0)=='0') answer="0"; //배열 전부가 0인 케이스 ..
        return answer;
    }


	
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9, 0};
		System.out.println(solution(numbers));

		
		



        
        
	}
}
