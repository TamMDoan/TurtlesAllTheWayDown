public class GCD {
    public int recursion(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return recursion(num2, num1 % num2);
    }
}
