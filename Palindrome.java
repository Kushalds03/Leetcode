public class Palindrome{
    public static void main(String[] args) {
         System.out.println(isPalindrome(101));
        
    }
    public  static boolean isPalindrome(int x){
        int ori = x;
        int rev = 0;
        if(x<=0){
            return false;

        }
        while(x>0){
            int digit  = x%10;
            rev = rev*10 +digit;
            x = x/10;
        }
        if(ori == rev){
            return true;
        }else{
            return false;
        }


    }

}