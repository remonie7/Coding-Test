import java.util.HashMap;

public class hast_test3 {
    public static int solution(String[][] clothes) {
    	HashMap<String, Integer> hash = new HashMap<String, Integer>();
    	for(int i=0; i<clothes.length; i++) {
    		hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 1)+1);
    	}
    	int answer = 1;
    	
    	for(String key :hash.keySet()) {
    		answer=answer*hash.get(key);
    	}    	
        return answer-1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}
	
}
