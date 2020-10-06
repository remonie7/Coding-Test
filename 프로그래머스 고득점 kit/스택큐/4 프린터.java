import java.util.ArrayList;

class node{
	private int priority;
	private boolean isMine;	
	node(){
		isMine=false;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public boolean isMine() {
		return isMine;
	}
	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}	
}


public class stack_queue_test4 {
    public static int solution(int[] priorities, int location) {
        ArrayList<node> queue = new ArrayList<node>();
        
        for(int i=0; i<priorities.length; i++) {
        	queue.add(new node());
        	queue.get(i).setPriority(priorities[i]);
        	if(i==location) queue.get(i).setMine(true);
        }
    	int answer = 0;
    	boolean goBack=false;
    	while(queue.size()>0) {
    		goBack=false;
    		if(queue.size()==1) {
    			answer++;
    			break;
    		}
    		for(int i=1; i<queue.size(); i++) {
    			if(queue.get(0).getPriority()<queue.get(i).getPriority()) {
    				queue.add(queue.remove(0));
    				goBack=true;
    				break;
    			}
    		}
    		if(goBack==true) continue;
    		
    		answer++;
    		if(queue.get(0).isMine()==true) break;
    		queue.remove(0);    		
    	}    	
        return answer;
    }
    
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location=0;
		System.out.println(solution(priorities, location));
	}
}
