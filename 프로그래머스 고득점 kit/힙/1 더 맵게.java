import java.util.PriorityQueue;

public class heap_test1 {
    public static int solution(int[] scoville, int K) {
    	PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
    	for(int i:scoville) {
    		heap.add(i);
    	}
        int answer = 0;
        int first, second;
        while(heap.peek()<K) {
        	if(heap.size()<2) {
        		answer=-1;
        		break;
        	}
        	first=heap.poll();
        	second=heap.poll();
        	if(first==0 & second==0) {
        		answer=-1;
        		break;
        	}
        	heap.add(first+(second*2));
        	answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K=7;
		System.out.println(solution(scoville, K));
	}
}
