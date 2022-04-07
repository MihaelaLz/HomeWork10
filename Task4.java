public class Task4 {
    public static void main(String[] args) {
        System.out.println("***Printing the pattern***");
      for (int i = 0; i < 6; i++){
          int space = i;
          for ( int j = 6; j > i; j--){
              while (space>0){
                  System.out.print(" ");
                  space--;
              }
              System.out.print("# ");
          }
          System.out.println();
      }
    }

}
