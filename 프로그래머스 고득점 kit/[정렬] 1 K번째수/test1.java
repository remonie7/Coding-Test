
public class test1 {

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start, last, k_th;
        int[] array_copy = new int[array.length];
        for(int x=0; x<array.length; x++) {
        	array_copy[x]=array[x];
        }
        for(int i=0; i<commands.length; i++) {
        	start = commands[i][0]-1;
        	last = commands[i][1]-1;
        	k_th = commands[i][2];
        	quick_sort(array_copy, start, last);
        	answer[i]=array_copy[start+k_th-1];
        	for(int j=start; j<=last; j++) {
        		array_copy[j]=array[j];
        	}
        }
        return answer;
    }
	
	public static void quick_sort(int[] data, int start, int last) {
		int middle = partition(data, start, last);
		if(start<middle-1) quick_sort(data, start, middle-1);
		if(middle+1<last) quick_sort(data, middle+1, last);
	}
	public static int partition(int[] data, int start, int last) {
		int x = data[last];
		int i = start-1;
		int j, temp;
		for(j=start; j<last; j++) {
			if(data[j]<x) {
				temp=data[++i];
				data[i]=data[j];
				data[j]=temp;
			}
		}
		data[last]=data[i+1];
		data[i+1]=x;
		return i+1;			
	}
	
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = solution(array, commands);
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i] + " ");
		}
	}
}
