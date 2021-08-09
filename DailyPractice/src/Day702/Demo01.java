package Day702;

public class Demo01 {
    public static void main(String[] args) {
        Demo01ext M = new Demo01ext();
        M.Demo1();
        int D = Demo();
        int Max = M.a > M.b ? (M.a > M.c ? M.a : M.c) : (M.b > M.c ? M.b : M.c);
        System.out.println(D + Max);
    }

    public static int Demo() {
        System.out.print("结果：");
        return 0;
    }
}
