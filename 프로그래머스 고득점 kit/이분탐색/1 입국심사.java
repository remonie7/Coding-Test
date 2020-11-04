import java.util.Arrays;
public class test1 {
    public static long solution(int n, int[] times) {
    	Arrays.sort(times);
        long min=1; //가장 최소시간 1
        long max=(long)times[times.length-1]*n; //가장 최대시간 오래걸리는 사람이 전체를 맡을때
        long mid=0;
        long sum;
        long answer = max;
        while(min<=max){
            sum=0;
            mid=(min+max)/2;
            for(int time:times){
                sum+=mid/time; // mid 시간동안 심사관 당 맡을 수 있는 입국자 수의 합
            }
            if(sum>=n){ //시간 줄임
                if(mid<answer){
                    answer=mid;
                }
                max=mid-1;                
            }
            else{ //시간 늘림
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
