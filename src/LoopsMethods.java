public class LoopsMethods {


    public static int factorial(int n){
        if (n<0){
            return -1;
        }
        int j = 1;
        for (int i = 1; i <= n; ++i) {
            j *= i;
        }
        return j;
    }
    public static int howManyEven(int num){
        int c = 0;

        for (; num != 0; num/=10){
            if (num %2 == 0){
                c++;
            }
        }
        return c;
        }


        public static void main(String[] args){

            System.out.println(LoopsMethods.howManyEven(25643));
        }
    }
