import java.util.HashSet;


public class brute_force_search_test2 {
	static HashSet<Integer> ary = new HashSet<>();
	
	public static void permutation(String[] chars, int depth, int r) { 
        if (depth == r) {
        	String result="";
            for (int i = 0; i < r; i++) {
            	result=result+chars[i];
            }
            int rst=Integer.parseInt(result);
            if(rst<2) return;
            for(int i=2; i<rst; i++) {
            	if(rst % i ==0) return;
            }
            ary.add(rst);
            return;
        }

        for (int i = depth; i < chars.length; i++) {
        	String tmp = chars[depth];
            chars[depth] = chars[i];
            chars[i] = tmp;

            permutation(chars, depth + 1, r);

            chars[i] = chars[depth];
            chars[depth] = tmp;
        }
    }
	
	
	
	
	
	
    public static int solution(String numbers) {      
    	
    	String[] num=numbers.split("");
    	
    	for(int i=1; i<=num.length; i++) {
    		permutation(num, 0, i);
    	}

        return ary.size();
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";

		System.out.println(solution(numbers));
	}
}
