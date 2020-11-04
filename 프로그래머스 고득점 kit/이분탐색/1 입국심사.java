import java.util.Arrays;
public class test1 {
    public static long solution(int n, int[] times) {
    	Arrays.sort(times);
        long min=1; //���� �ּҽð� 1
        long max=(long)times[times.length-1]*n; //���� �ִ�ð� �����ɸ��� ����� ��ü�� ������
        long mid=0;
        long sum;
        long answer = max;
        while(min<=max){
            sum=0;
            mid=(min+max)/2;
            for(int time:times){
                sum+=mid/time; // mid �ð����� �ɻ�� �� ���� �� �ִ� �Ա��� ���� ��
            }
            if(sum>=n){ //�ð� ����
                if(mid<answer){
                    answer=mid;
                }
                max=mid-1;                
            }
            else{ //�ð� �ø�
                min=mid+1;
            }
        }
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int[] times= {1,2,2,2,100};
		System.out.println(solution(n, times));
	}
	

}
