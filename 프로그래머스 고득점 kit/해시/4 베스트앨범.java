import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class hash_test4 {
	 public static int[] solution(String[] genres, int[] plays) {
	    	HashMap<String, int[][]> hash = new HashMap<String, int[][]>();

	    	for(int i=0; i<genres.length; i++) {
	    		if(hash.get(genres[i])==null) {
	    	    	int[][] init=new int[3][2];
	    	    	init[0][0]=plays[i];
	    	    	init[1][0]=i;
	    	    	init[1][1]=plays[i];
	    	    	init[2][0]=-1; 
	    	    	init[2][1]=-1;
	    			hash.put(genres[i], init);	    			
	    		}
	    		else {
	    			int[][] temp=new int[3][2];
	    			temp=hash.get(genres[i]);
	    			temp[0][0]+=plays[i];
	    			if(temp[1][1]<plays[i]) {
	    				temp[2][0]=temp[1][0];
	    				temp[2][1]=temp[1][1];
	    				temp[1][0]=i;
	    				temp[1][1]=plays[i];
	    			}
	    			else if(temp[2][1]<plays[i]) {
	    				temp[2][0]=i;
	    				temp[2][1]=plays[i];
	    			}
	    			hash.replace(genres[i], temp);    			
	    		}
	    		
	    	}
	    	ArrayList<int[][]> valList = new ArrayList<int[][]>();
	    	for(Map.Entry<String, int[][]> map : hash.entrySet()) {
	    		valList.add(map.getValue());
	    	}
	    	
	    	Collections.sort(valList, new Comparator<int[][]>() {
	    		@Override
	    		public int compare(int[][] o1, int[][] o2) {
	    			return o2[0][0] - o1[0][0];
	    		}
	    	});
	    	
	    	ArrayList<Integer> answerList = new ArrayList<Integer>();
	    	for(int i=0; i<valList.size(); i++) {
	    		if(valList.get(i)[1][0]>-1) answerList.add(valList.get(i)[1][0]);
	    		if(valList.get(i)[2][0]>-1) answerList.add(valList.get(i)[2][0]);
	    	}

    	
	    	int[] answer = new int[answerList.size()];
	    	int size=0;
	    	for(int temp : answerList) answer[size++]=temp;
	    	
	        return answer;
	    }
    
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays= {500,600,150,800,2500};
		System.out.println(Arrays.toString(solution(genres, plays)) );
		
	}

}
