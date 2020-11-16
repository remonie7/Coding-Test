
public class test2 {

    public static int solution(int[][] triangle) {    	
    	int[][] df=new int[triangle.length][triangle.length];
    	df[0][0]=triangle[0][0];
    	for(int i=0; i<df.length-1; i++) {
    		for(int j=0; j<=i; j++) {
    			if(df[i+1][j]<df[i][j]+triangle[i+1][j]) df[i+1][j]=df[i][j]+triangle[i+1][j];
    			if(df[i+1][j+1]<df[i][j]+triangle[i+1][j+1]) df[i+1][j+1]=df[i][j]+triangle[i+1][j+1];
    		}
    	}  	    	
        int answer = 0;
        for(int i=0; i<df[df.length-1].length; i++) {
        	if(answer<df[df.length-1][i]) answer=df[df.length-1][i];
        }
        return answer;
    }
    
	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(solution(triangle));
	}
}
