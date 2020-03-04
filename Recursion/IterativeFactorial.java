
class IterativeFactorial{
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of "+n+" is "+ factorial(5));

    }
    public static int factorial(int num){
        if(num==0){
            return 1;            
        }
        int factNum=1;
        for(int i=1;i<=num;i++){
            factNum=factNum*(i);
        }
        return factNum;
    }
}