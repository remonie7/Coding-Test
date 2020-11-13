import java.util.HashSet;
import java.util.Set;

public class test2 {
    public static int solution(int n, int[][] computers) {
    	boolean[] tf=new boolean[n];
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<computers.length; i++) {
        	for(int k=0; k<n; k++) {
        		tf[k]=false;
        	}
        	int a=neighbor(computers, tf, i, i);
        	set.add(a);
        }
        return set.size();
    }
    
    public static int neighbor(int[][] computers, boolean[] tf, int i, int min) {
    	tf[i]=true;
    	int newmin;
    	for(int j=0; j<computers[0].length; j++) {
    		if(computers[i][j]==1 && j!=i) {
    			if(j<min) min=j;
    			if(tf[j]==false) {
    				newmin=neighbor(computers, tf, j, min);
        			if(min>newmin) min=newmin;
    			}    			
    		}
    	}
    	return min;
    }

	public static void main(String[] args) {
		int[][] computers= {{1,1,0},{1,1,0},{0,0,1}};
		int n=3;
		System.out.println(solution(n, computers));
	}
}
