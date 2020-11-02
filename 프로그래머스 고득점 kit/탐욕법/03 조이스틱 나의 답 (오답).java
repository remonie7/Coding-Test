
public class test2 {

	
    public static int solution(String name) {
        String[] ary = name.split("");
        int answer = 0;
        int count=0;
        int compareNum=0;
        int nowidx=0;
        int cnt=0;        
        boolean direction=true;
        while(count<ary.length) {
        	
        	
        	
        	
        	
        	System.out.println("현재인덱스는:"+nowidx);
        	compareNum="A".compareTo(ary[nowidx]);
        	if(compareNum==0) {
        		System.out.println("현재인덱스는 a와 같다");        		
        		int idx=nowidx;
        		cnt=0;
        		if(direction==true) {
        			System.out.println("방향은 오른쪽");
        			while(idx<ary.length && "A".compareTo(ary[idx])==0) {
            			idx++;
            			cnt++;
            		}
        			System.out.println("연속해서 나온 A의 갯수는 "+cnt);        			
            		if((cnt+1)>(ary.length/2)) {
            			System.out.println("방향 바꿈");
            			if(count!=0) answer--;
            			direction=false;
            			if(count==0) answer=answer+count+1;
            			else answer=answer+count;
            			nowidx=ary.length-count+nowidx-1;
            			System.out.println("앞으로 갈 인덱스 : "+nowidx);
            			System.out.println("그 인덱스를 향해 얼마나 이동? "+ (count));            			
            		}
            		else {
            			System.out.println("방향 안바꿈");
            			nowidx=idx;
            			answer=answer+cnt;
            			System.out.println("앞으로 갈 인덱스 : "+nowidx);
            			System.out.println("그 인덱스를 향해 얼마나 이동? "+ (cnt));
            		}
        		} 
        		else {
        			while("A".compareTo(ary[idx])==0) {
            			idx--;
            			cnt++;
            		}
        			System.out.println("연속해서 나온 A의 갯수는 "+cnt);
        			System.out.println("완료된 갯수 : " + count);
            		if((cnt+1)>(ary.length/2)) {
            			System.out.println("방향 바꿈");
            			if(count!=0) answer--;
            			direction=true;
            			answer=answer+count+1;
            			nowidx=count-(ary.length-nowidx-1);
            		}
            		else {
            			System.out.println("방향 안바꿈");
            			nowidx=idx;
            			answer=answer+cnt;
            			System.out.println("앞으로 갈 인덱스 : "+nowidx);
            			System.out.println("그 인덱스를 향해 얼마나 이동? "+ cnt);
            		}
        		}
        		count=count+cnt;
    			System.out.println("완료된 갯수 : " + count);
    			System.out.println("누적 asnwer : " + answer);
        		System.out.println("이 인덱스 끝!!!");
        		System.out.println();        		
        	}
        	else if(compareNum>-14) {
        		System.out.println("현재인덱스는 위로 이동");
        		answer=answer-compareNum;
        		if(direction==true) nowidx++;
        		else nowidx--;
        		count++;
        		if(count<ary.length) answer++;
        		System.out.println("추가된 answer : "+(-compareNum));
        		System.out.println("이동할 인덱스 : " + nowidx);
        		System.out.println("완료된 갯수 : " + count);
        		System.out.println("누적 answer : "+ answer);
        		System.out.println("이 인덱스 끝!!!");
        		System.out.println();        		
        	}
        	else {
        		System.out.println("현재인덱스는 아래로 이동");
        		answer=answer+compareNum+26;
        		if(direction==true) nowidx++;
        		else nowidx--;
        		count++;
        		if(count<ary.length) answer++;
        		System.out.println("추가된 answer : "+(compareNum+26));
        		System.out.println("이동할 인덱스 : " + nowidx);
        		System.out.println("완료된 갯수 : " + count);
        		System.out.println("누적 answer : "+ answer);
        		System.out.println("이 인덱스 끝!!!");
        		System.out.println();
        	}        	
        }    	
   	
        return answer;


    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("BBBBAAAABA"));

	}

}
