class Pallindrome{
    public static void main(String[] args) {
        int n=121;
        int org=n;
        int rev=0;
        int sum=0;
        while (n>0) { 
            int digit=n%10;
            sum+=digit;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==org) {
            System.err.println("Pallindrome");
            System.out.println("sum of digits of pallindrome number is: "+sum);
        } else {
            System.err.println("Not pallindrome");
        }
    }
}