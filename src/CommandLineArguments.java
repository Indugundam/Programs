public class CommandLineArguments
{
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[1]);
        int arg2 = Integer.parseInt(args[3]);
        System.out.println(add(arg1, arg2));

    }
    public static int add(int arg1, int arg2) {
        return arg1 + arg2;
    }
}