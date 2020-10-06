import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class node implements Comparable<node>{
	private int man;
	private int num;
	node(int man, int num){
		this.man=man;
		this.num=num;		
	}
	public int getMan() {
		return man;
	}
	public int getNum() {
		return num;
	}
	@Override
	public int compareTo(node o) {
		if(this.getNum() < o.getNum()) return 1;
		else if(this.getNum()==o.getNum()) {
			if(this.getMan()>o.getMan()) return 1;
			else return -1;
		}
		else return -1;
	}  
}


public class brute_force_search_test1 {
	
    public static int[] solution(int[] answers) {
        int man1=0;
        int man2=0;
        int man3=0;
    	int[] a = {1,2,3,4,5};
    	int[] b = {2,1,2,3,2,4,2,5};
    	int[] c= {3,3,1,1,2,2,4,4,5,5};
    	for(int i=0; i<answers.length; i++) {
    		if(answers[i]==a[i%5]) man1++;
    		if(answers[i]==b[i%8]) man2++;
    		if(answers[i]==c[i%10]) man3++;
    	}
    	
    	ArrayList<node> answerList = new ArrayList<node>();
    	answerList.add(new node(1, man1));
    	answerList.add(new node(2, man2));
    	answerList.add(new node(3, man3));
    	Collections.sort(answerList);
    	

    	if(answerList.get(0).getNum()>answerList.get(1).getNum()) {
    		answerList.remove(1);
    		answerList.remove(1);
    	}
    	else {
    		if(answerList.get(1).getNum()>answerList.get(2).getNum()) answerList.remove(2);
    	}
    	
    	
    	
    	int[] answer= new int[answerList.size()];
    	for(int i=0; i<answerList.size(); i++) {
    		answer[i]=answerList.get(i).getMan();
    	}

        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers= {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(answers)));
	}

}
