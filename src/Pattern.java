public class Pattern {
    public static void main(String[] args) {
        //1 Solid square pattern
//        int n = 9;
//        for(int row = 1; row <= n; row++){
//        for(int col =1; col <= n; col++){
//        System.out.print("* ");
//        }
//        System.out.println();
//        }

        //2 Solid rectangular pattern
//        int n = 6;
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= 5; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //3 solid right-angled triangle pattern
        int n = 9;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
