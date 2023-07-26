public class Main
{
    public static void main(String[] args)
    {
        int a = 0, b = 1;
        for(int i = 0; i < 10; i++) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}