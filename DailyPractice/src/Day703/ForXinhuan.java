package Day703;

public class ForXinhuan {
    public static void main(String[] args) {
//        int a=0;
        for (int i = 1; i <10; i++) {
            for (int b = 1; b <= i; b++) {
                System.out.print(i+"X"+b+"="+i*b+"    ");
                if(b==i){
                    System.out.println();
                }
            }
//            System.out.println(i*b);
        }
//        System.out.println(a);
    }
}
