import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava {
	public static void main(String[] args) {
		String[] names = { "Nancy", "Jinchi", "Fujibayashi", "Momochi", "Ishikawa" };
		String[] namesFiveChar = ShufflePrintReturnNames(names);
		int[] nums = {3,5,1,2,7,9,8,13,25,32};
		AphabletShuffle();
		System.out.println(PrintSumArray(nums));
		System.out.println(ReturnOver10Array(nums));
		
	}

	public static int PrintSumArray(int[] nums) {
		int arraySum = 0;
		for(int counter : nums){
			arraySum = arraySum + counter;
		}
		return arraySum;
	}

	public static ArrayList ReturnOver10Array(int[] nums) {
		ArrayList<Integer> over10array = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > 9){
				over10array.add(i);
			}
		}
		return over10array;
	}

	public static String[] ShufflePrintReturnNames(ArrayList<String> array) {
		Collections.shuffle(array);
        System.out.println(array);
        ArrayList<String> listReturn = new ArrayList<String>();
        for (int i = 0; i < array.size(); i++){
            String check = array.get(i);
            if (check.length() > 5){
                listReturn.add(array.get(i));
	}

	public static String AphabletShuffle() {
		String first = "";
		String last = "";
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		ArrayList<Character> charList = new ArrayList<Character>();
		for(char ch : alphabet){
			charList.add(ch);
		}
		System.out.println(charList);
		Collections.shuffle(charList);
		first += charList.get(0);
		last += charList.get(25);

		return first + " " + last;
	}

	public static int GenerateRandom() {
		Random rand = new Random();
		int randomNum = rand.nextInt((100 - 55) + 1) + 55;

		return randomNum;
	}

	public static int[] Generate10() {
		int[] numArray = new int[10];
		for(int i = 0; i < numArray.length; i++){
			numArray[i] = GenerateRandom();
		}
		
		return numArray;
	}

	public static int[] RandomIntArray(int lowerBound, int upperBound) {
        int[] arr = new int[10];
        int offset = upperBound - lowerBound;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(offset) + lowerBound;
        }
        Arrays.sort(arr);
        return arr; 
    }
    public static String[] RandomStringArr() {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = StringManipulator.RandomString(5);
        return arr;
	}

	public String trimAndConcat(String firstString, String secondString) {
		firstString = firstString.trim();
		secondString = secondString.trim();
			return firstString.concat(secondString);
        }

	public Integer getIndexOrNull(String string1, char letter1){
		int query = string1.indexOf(letter1);
			if (query >= 0){
				return query;
			}
			else {
				return null;
			}
		}
		
	public String concatSubstring(String str1, int c, int d, String str2){
		str1 = str1.substring(c, d);
		return str1.concat(str2);
}



}