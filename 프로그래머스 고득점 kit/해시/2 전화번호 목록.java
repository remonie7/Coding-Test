import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class hash_test2 {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		return o2.length() - o1.length();
        	}
        });
    	
        HashMap<String, ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<String>();
        for(String i:phone_book) {
        	String key = i.substring(0, 1);
        	if(hash.containsKey(key)) {
        		temp=hash.get(key);
        		for(int idx=0; idx<temp.size(); idx++) {
        			if(i.equals(temp.get(idx).substring(0, i.length()))) {
        				return false;
        			}
        		}
        		hash.get(key).add(i);
        	}
        	else {
        		ArrayList<String> newList = new ArrayList<String>();
        		newList.add(i);
        		hash.put(key, newList);
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119","97674223","1195524421"};
		System.out.println(solution(phone_book));
	}
}
