import java.util.ArrayList;

public class stack_queue_test3 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        ArrayList<Integer> trucks = new ArrayList<Integer>();
        for(int i : truck_weights) trucks.add(i);       
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> times = new ArrayList<Integer>();
        int tempSum=0;
        while(true) {
        	answer+=1;
        	if(times.size()>0) {        		
        		for(int i=0; i<times.size(); i++) {
            		times.set(i, times.get(i)+1);
            	}
            	if(times.get(0)>=bridge_length) {
            		tempSum=tempSum-temp.remove(0);
            		times.remove(0);
            		if(times.size()==0 & trucks.size()==0) break;
            	}
        	}
        	if(trucks.size()>0 && (tempSum+trucks.get(0))<=weight) {
        		tempSum=tempSum+trucks.get(0);
        		temp.add(trucks.get(0));
        		trucks.remove(0);
        		times.add(0);
        	}
  /*확인 프린트      	
        	System.out.println("answer = "+answer);
        	System.out.print("temp 배열 = ");
            for (int i=0; i < temp.size(); i++)
            {
            	System.out.print(temp.get(i).intValue()+" ");
            } 
            System.out.println();
            System.out.println("tempSum = "+tempSum);
            System.out.print("time 배열 = ");
            for (int i=0; i < times.size(); i++)
            {
            	System.out.print(times.get(i).intValue()+" ");
            } 
            System.out.println();
            System.out.print("truck remain 배열 = ");
            for (int i=0; i < trucks.size(); i++)
            {
            	System.out.print(trucks.get(i).intValue()+" ");
            } 
            System.out.println();
            
  */
        }  
        return answer;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10, 10, 10, 10, 10, 10, 10, 10, 10};
		System.out.println(solution(bridge_length, weight, truck_weights));
	}

}
