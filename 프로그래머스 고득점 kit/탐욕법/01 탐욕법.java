import java.util.Arrays;

public class test1 {
   
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] count=new int[n+1];
		Arrays.sort(lost);
		Arrays.sort(reserve);
		int lost_idx=lost.length-1;
		int reserve_idx=reserve.length-1;
		int answer=0;
		for(int i=n; i>=1; i--) {
			if(reserve_idx>=0 && reserve[reserve_idx]==i) {
				if(lost_idx>=0 && lost[lost_idx]==i) {
					count[i]=1;
					lost_idx--;
					reserve_idx--;
					continue;
				}
				else if(i<n && count[i+1]==0) {
					answer--;
					count[i]=1;
					reserve_idx--;
				}
				else {
					count[i]=2;
					reserve_idx--;
				}
			}
			else if(lost_idx>=0 && lost[lost_idx]==i) {
				if(i<n && count[i+1]==2) count[i]=1;
				else {
					count[i]=0; 
					answer++;
				}				
				lost_idx--;
			}
			else count[i]=1;
		}
		return n-answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lost= {2,4};
		int[] reserve = {3};
		int n = 5;
		System.out.println(solution(n, lost, reserve));
	}
}
