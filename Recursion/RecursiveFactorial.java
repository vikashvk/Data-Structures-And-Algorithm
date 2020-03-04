class RecursiveFactorial{
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of "+n+" is "+ factorial(5));

    }
    public static int factorial(int num){
        if(num==0){
            return 1;            
        }
        return num* factorial(num-1);
    }
}