
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
        	
        	
        	
        	
        	
        	System.out.println("�����ε�����:"+nowidx);
        	compareNum="A".compareTo(ary[nowidx]);
        	if(compareNum==0) {
        		System.out.println("�����ε����� a�� ����");        		
        		int idx=nowidx;
        		cnt=0;
        		if(direction==true) {
        			System.out.println("������ ������");
        			while(idx<ary.length && "A".compareTo(ary[idx])==0) {
            			idx++;
            			cnt++;
            		}
        			System.out.println("�����ؼ� ���� A�� ������ "+cnt);        			
            		if((cnt+1)>(ary.length/2)) {
            			System.out.println("���� �ٲ�");
            			if(count!=0) answer--;
            			direction=false;
            			if(count==0) answer=answer+count+1;
            			else answer=answer+count;
            			nowidx=ary.length-count+nowidx-1;
            			System.out.println("������ �� �ε��� : "+nowidx);
            			System.out.println("�� �ε����� ���� �󸶳� �̵�? "+ (count));            			
            		}
            		else {
            			System.out.println("���� �ȹٲ�");
            			nowidx=idx;
            			answer=answer+cnt;
            			System.out.println("������ �� �ε��� : "+nowidx);
            			System.out.println("�� �ε����� ���� �󸶳� �̵�? "+ (cnt));
            		}
        		} 
        		else {
        			while("A".compareTo(ary[idx])==0) {
            			idx--;
            			cnt++;
            		}
        			System.out.println("�����ؼ� ���� A�� ������ "+cnt);
        			System.out.println("�Ϸ�� ���� : " + count);
            		if((cnt+1)>(ary.length/2)) {
            			System.out.println("���� �ٲ�");
            			if(count!=0) answer--;
            			direction=true;
            			answer=answer+count+1;
            			nowidx=count-(ary.length-nowidx-1);
            		}
            		else {
            			System.out.println("���� �ȹٲ�");
            			nowidx=idx;
            			answer=answer+cnt;
            			System.out.println("������ �� �ε��� : "+nowidx);
            			System.out.println("�� �ε����� ���� �󸶳� �̵�? "+ cnt);
            		}
        		}
        		count=count+cnt;
    			System.out.println("�Ϸ�� ���� : " + count);
    			System.out.println("���� asnwer : " + answer);
        		System.out.println("�� �ε��� ��!!!");
        		System.out.println();        		
        	}
        	else if(compareNum>-14) {
        		System.out.println("�����ε����� ���� �̵�");
        		answer=answer-compareNum;
        		if(direction==true) nowidx++;
        		else nowidx--;
        		count++;
        		if(count<ary.length) answer++;
        		System.out.println("�߰��� answer : "+(-compareNum));
        		System.out.println("�̵��� �ε��� : " + nowidx);
        		System.out.println("�Ϸ�� ���� : " + count);
        		System.out.println("���� answer : "+ answer);
        		System.out.println("�� �ε��� ��!!!");
        		System.out.println();        		
        	}
        	else {
        		System.out.println("�����ε����� �Ʒ��� �̵�");
        		answer=answer+compareNum+26;
        		if(direction==true) nowidx++;
        		else nowidx--;
        		count++;
        		if(count<ary.length) answer++;
        		System.out.println("�߰��� answer : "+(compareNum+26));
        		System.out.println("�̵��� �ε��� : " + nowidx);
        		System.out.println("�Ϸ�� ���� : " + count);
        		System.out.println("���� answer : "+ answer);
        		System.out.println("�� �ε��� ��!!!");
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
