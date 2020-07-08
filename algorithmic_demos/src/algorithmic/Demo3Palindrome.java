package algorithmic;

/**
 * @Classname Demo3Palindrome
 * @Description 回文数
 * @Date 2020/6/20 23:26
 * @Author 曹珂
 */
public class Demo3Palindrome {
    public boolean isPalindrome(int y) {
        if(y<0){
            return false;//如果负数，自然不是回文
        }
        int n = 0;
        int x = y;
        while(x!=0){
            n = n*10 + x%10;
            x = x/10;
        }
        return n==y;
        /*if(n==y){
            return true;
        }else{
            return false;
        }*/
    }

    public static void main(String[] args) {
        System.out.println(new Demo3Palindrome().isPalindrome(12321));
    }
    /* C语言
      bool isPalindrome(int x){
        long f=0;
        int temp=x;
        for(;x;f=f*10+x%10,x/=10);
        if(temp==f&&temp>=0)
            return true;
        else
            return false;
    }*/
}
