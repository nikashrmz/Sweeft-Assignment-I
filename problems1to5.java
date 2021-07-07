import java.util.Arrays;
import java.util.Stack;

public class problems1to5 {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String text){
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static int minSplit(int amount){
        if(amount < 0)
            return -1;
        int[] cns = new int[5];
        cns[0] = 50;
        cns[1] = 20;
        cns[2] = 10;
        cns[3] = 5;
        cns[4] = 1;
        int coins = 0;
        for(int i = 0; i < 5; i++){
            coins += amount / cns[i];
            amount = amount % cns[i];
        }
        return coins;
    }

    public static int notContains(int[] array){
        Arrays.sort(array);
        int n = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i] <= 0){
                continue;
            }
            if (array[i] <= n){
                n++;
                continue;
            }
        }
        return n;
    }

    public static boolean isProperly(String sequence){
        Stack<Character> stacc = new Stack<Character>();
        if (sequence.charAt(0) == ')')
            return false;
        stacc.push(sequence.charAt(0));
        for (int i = 1; i < sequence.length(); i++){
            if (sequence.charAt(i) == '('){
                stacc.push('(');
            } else {
                if(stacc.peek() == '('){
                    stacc.pop();
                }
            }
        }
        if(stacc.isEmpty())
            return true;
        return false;
    }

    public static int countVariants(int stairsCount){
        if (stairsCount == 2){
            return 2;
        }
        if(stairsCount == 1) return 1;
        int variants = 0;
        variants = variants + countVariants(stairsCount - 1) + countVariants(stairsCount - 2);
        return variants;
    }
}
