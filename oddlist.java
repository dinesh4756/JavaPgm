public class oddlist {
        public static void main(String[] args) {
                int limit = 50;
                System.out.println("Printing Odd numbers between 1 and " + limit);
                for(int i=1; i <= limit; i++)
                        if( i % 2 != 0){
                                System.out.print(i + " ");
                        }
                }
        }
}
