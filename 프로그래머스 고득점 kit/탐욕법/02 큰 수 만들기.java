
public class test2 {

	public static int remove(String[] number, int start, int k) {
		int max=start;
		for(int i=start; i<=start+k; i++) {
			if(number[i].equals("9")) return i;
			else {
				if(number[i].compareTo(number[max])>0) max=i;
			}
		}
		return max;
		
	}
	
	
    public static String solution(String number, int k) {
    	String[] numary = number.split("");
        int start=0;
        int remain=k;
        int max=0;
        StringBuilder answer = new StringBuilder("");
        int result=number.length()-k;
        while(true) {
        	max=remove(numary, start, remain);
        	remain=remain-(max-start);
        	start=max+1;
        	answer.append(numary[max]);
        	if(answer.length()==result) break;
        	if(remain==0) {
        		for(int i=start; i<numary.length; i++) answer.append(numary[i]);
        		break;
        	}        	
        }    	
        return answer.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("777777777", 3));


	}

}
