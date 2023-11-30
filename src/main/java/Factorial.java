public class Factorial {

    public int recursion(int i) {
        if (i == 1){
            return 1;
        }
        return i * recursion(i - 1);
    }
}
