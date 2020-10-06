import java.util.Arrays;

public class hash_test1 {
    public static String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	for(int i=0; i<completion.length; i++) {
    		if(!completion[i].equals(participant[i])) return participant[i];
    	}	
    	return participant[participant.length-1];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant= {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution(participant, completion));
	}

}
