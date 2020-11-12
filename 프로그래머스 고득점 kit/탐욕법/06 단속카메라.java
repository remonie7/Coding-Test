import java.util.Arrays;
import java.util.Comparator;

public class test6 {

	
    public static int solution(int[][] routes) {    	
    	int temp=0;
    	for(int i=0; i<routes.length; i++) {
    		if(routes[i][0]>routes[i][1]) {
    			temp=routes[i][1];
    			routes[i][1]=routes[i][0];
    			routes[i][0]=temp;
    		}
    	}
    	Arrays.sort(routes, new Comparator<int[]>() {
    	    @Override
    	    public int compare(int[] o1, int[] o2) {
    	    	return o1[0] - o2[0];
    	    }
    	});
    	int answer = 1;
    	int[][] loc=new int[routes.length][2];
    	int idx=0;
    	loc[idx][0]=routes[0][0];
    	loc[idx][1]=routes[0][1];
    	idx++;
    	boolean addin;
    	for(int i=1; i<routes.length; i++) {
    		addin=false;
    		for(int j=0; j<idx; j++) {
    			if(routes[i][0]<=loc[j][1]) {
    				loc[j][0]=routes[i][0];
    				if(routes[i][1]<loc[j][1]) loc[j][1]=routes[i][1];
    				addin=true;
    				break;
    			}
    		}
    		if(addin==false) {
    			answer++;
    			loc[idx][0]=routes[i][0];
    			loc[idx][1]=routes[i][1];
    			idx++;
    		}
    	}    	
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] routes={{-20,15},{-14,-5},{-18,-13},{-5,-3}};
		System.out.println(solution(routes));
	}
}
