import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;

class node implements Comparable<node>{
	private int num;

	private int count;
	
	node(int num, int count) {
		this.num=num;
		this.count=count;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	

	@Override
	public int compareTo(node o) {
		if(this.getCount() < o.getCount()) return 1;
		else if(this.getCount() == o.getCount()) {
			if(this.getNum() < o.getNum()) return 1;
			else return -1;
		}
		else return -1;
	}  
}


public class hash_test4 {
	 public static int[] solution(String[] genres, int[] plays) {
	    	HashMap<String, PriorityQueue<node>> hash = new HashMap<String, PriorityQueue<node>>();
	    	HashMap<String, Integer> sumHash = new HashMap<String, Integer>();
	    	for(int i=0; i<genres.length; i++) {
	    		if(hash.get(genres[i])==null) {
	    			PriorityQueue<node> heap = new PriorityQueue<node>();
	    			heap.add(new node(i, plays[i]));
	    			hash.put(genres[i], heap);
	    			sumHash.put(genres[i], plays[i]);
	    			
	    		}
	    		else {
	    			PriorityQueue<node> heap = new PriorityQueue<node>();
	    			heap=hash.get(genres[i]);
	    			heap.add(new node(i, plays[i]));
	    			hash.replace(genres[i], heap);    			
	    			sumHash.replace(genres[i], sumHash.get(genres[i])+plays[i]);
	    		}
	    		
	    	}
	    	
	    	ArrayList<Integer> answerList = new ArrayList<Integer>();
	    	
	    	// Map.Entry 리스트 작성
			List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(sumHash.entrySet());

			// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
			Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
				// compare로 값을 비교
				public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
				{
					// 내림 차순으로 정렬
					return obj2.getValue().compareTo(obj1.getValue());
				}
			});

			for(Entry<String, Integer> entry : list_entries.subList(0, 2)) {
				
				answerList.add(hash.get(entry.getKey()).poll().getNum());
				if(hash.get(entry.getKey()).peek()!=null) answerList.add(hash.get(entry.getKey()).poll().getNum());
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
