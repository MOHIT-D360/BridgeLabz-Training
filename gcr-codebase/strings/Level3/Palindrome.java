import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindromeLogic1(String name){
        int start =0;
        int end = name.length()-1;
        
        boolean pailnd = true;
        while(start<end){
            if(name.charAt(start)!= name.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return pailnd;
    }
    public static boolean isPlaindromeLogic2(String name,int start,int end){
        if(start>=end){
            return true;
        }
        if(name.charAt(start) != name.charAt(end)){
			return false;
		}
		
		return isPlaindromeLogic2( name,start+1,end-1);

    }
	public static boolean isPalindromeLogic3(String name){
		char[] tempArr = name.toCharArray();
		// reverse
		int lastIndex = tempArr.length -1;
		for(int i=0;i<tempArr.length/2;i++){
			char temp = tempArr[i];
			tempArr[i] = tempArr[lastIndex];
			tempArr[lastIndex] = temp;
			lastIndex--;
		}
		for(int i=0;i<tempArr.length;i++){
			if(tempArr[i] != name.charAt(i)){
				return false;
			}
		}
		
		return true;
		
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int start =0;
        int end = name.length()-1;

        boolean plaindrome1 = isPalindromeLogic1(name);
        boolean plaindrome2 = isPlaindromeLogic2(name,start,end);
        boolean plaindrome3 = isPalindromeLogic3(name);
		System.out.println(plaindrome1);
		System.out.println(plaindrome2);
		System.out.println(plaindrome3);
    }
}
