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
//        int n = 4;
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //4 solid rohmbus pattern
//        int n =5;
//        for(int row = 1; row <=n; row++){
//            //for space
//            for(int col = 1; col<= n - row; col++){
//                System.out.print("  ");
//            }
//            //for star
//            for(int col = 1; col <= n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //5 inverted right-angled triangle.
//        int n = 8;
//        for(int row = 1; row <=n; row++){
//            for(int col = 1; col <= n - row +1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //6 solid pyramid pattern
//        int n = 5;
//        for(int row = 1; row <= n; row++){
//                //for space
//            for(int col = 1; col <= n - row; col++){
//                System.out.print("  ");
//            }
//            //for star
//            for(int col = 1; col <= (2 * row) - 1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //7 inverted solid pyramid
//        int n = 5;
//        for(int row = 1; row <= n; row++){
//            //for space
//            for(int col = 1; col <= row -1; col++){
//                System.out.print("  ");
//            }
//            //for star
//            for(int col = 1; col <= 2 * n - 2 * row + 1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // 8 hollow rectangle pattern;
//        int n = 5;
//        //there is no variable column for each row so
//        for(int row = 1; row <= n; row++){
//            if(row == 1 || row == n){
//                for(int col = 1; col <= 9; col++){
//                    System.out.print("* ");
//                }
//            }
//            else {
//                for (int col = 1; col <= 9; col++) {
//                    if (col == 1 || col == 9) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }

        //9 hollow right-angled triangle
//        int n = 6;
//        for(int row = 1; row <= n; row++){
//            if( row == 1 || row == 2 || row ==n){
//                for(int col = 1; col <= row; col++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                    //for star
//                    System.out.print("* ");
//                    //for space
//                    for(int col = 1; col <= row - 2; col++){
//                        System.out.print("  ");
//                    }
//                    //for star
//                    System.out.print("* ");
//                }
//            System.out.println();
//            }
            //hollow pyramid
//            int n = 5;
//            for(int row = 1; row <= n; row++){
//                //for space
//                for(int col = 1; col <= n - row; col++){
//                    System.out.print("  ");
//                }
//                //for part2
//                if(row == 1 || row ==n){
//                    for(int col = 1; col <= 2*row - 1; col++){
//                        System.out.print("* ");
//                    }
//                }
//                else{
//                    System.out.print("* ");
//                    for(int col = 1; col <= 2 * row - 3; col++){
//                        System.out.print("  ");
//                    }
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

        //for diamond pattern
        //part 1
//        int n = 6;
//        for(int row = 1; row <= n; row++){
//            //for space
//            for(int col = 1; col <= n - row; col++){
//                System.out.print("  ");
//            }
//            //for star
//            for(int col = 1; col <= (2 * row) - 1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //part 2
//        for(int row = 1; row <= n; row++){
//            if(row == 1){
//                continue;
//            }
//            //for space
//            for(int col = 1; col <= row -1; col++){
//                System.out.print("  ");
//            }
//            //for star
//            for(int col = 1; col <= 2 * n - 2 * row + 1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        }

    }

