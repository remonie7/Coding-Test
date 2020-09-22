import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> rest = new ArrayList<Integer>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        for(int i=0; i<progresses.length; i++) {
    		if((100-progresses[i])%speeds[i]==0) rest.add((100-progresses[i])/speeds[i]);
    		else rest.add(((100-progresses[i])/speeds[i])+1);
    	}
        if(rest.size()==0) answerList.add(0);
        else if(rest.size()==1) answerList.add(1);
        else {
        	int temp, count;
        	while(rest.size()>0) {
        		if(rest.size()==1) {
        			answerList.add(1);
        			break;
        		}
        		else {
        			temp=rest.remove(0);
        			count=1;
        			while(rest.size()>0) {
        				if(temp>=rest.get(0)) {
        					count++;
        					rest.remove(0);
        				}
        				else break;
        			}
        			answerList.add(count);
        		}
        	}
        }
        int[] answerAry = new int[answerList.size()];
        for (int i=0; i < answerAry.length; i++)
        {
        	answerAry[i] = answerList.get(i).intValue();
        }    	
        return answerAry;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}

}
