import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;


public class heap_test3 {
    public static int[] solution(String[] operations) {
    	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    	int[] answer = new int[2];
    	String temp[];
    	int count=0;
    	int minDelCount=0;
    	for(String i:operations) {
    		temp=i.split(" ");
    		if(temp[0].equals("I")) {
    			count++;    			
    			maxHeap.add(Integer.parseInt(temp[1]));
    		}
    		else {
    			if(count>0) {
    				count--;
        			if(temp[1].equals("1")) {
        				maxHeap.poll();
        			}
        			else {
        				minDelCount++;
        			}
    			}
    		}
    	}
    	if(count==0) {
    		answer[0]=0;
    		answer[1]=0;
    	}
    	else if(count==1) {
    		answer[0]=maxHeap.peek();
    		answer[1]=maxHeap.peek();
    	}
    	else {
    		answer[0]=maxHeap.poll();
    		while(maxHeap.size()>(minDelCount+1)) maxHeap.poll();
    		answer[1]=maxHeap.peek();
    	}
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"I 16","D 1"};
		System.out.println(Arrays.toString(solution(a)));
	}

}
