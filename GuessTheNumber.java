import java.util.Scanner;
//import java.util.Math;


class Main {
    public static void main(String[] args) {
        
      int ranNum=(int)(Math.random()*100);
      System.out.println("Hello Player!");
      
      System.out.println(ranNum);
      System.out.println("Guess any number between 0 and 100.");
      Scanner sc=new Scanner(System.in);
      int UserNum;

      do{
        
        UserNum=sc.nextInt();
        if(UserNum==ranNum) {
            System.out.println("Congratulations Player!");
            break;
        }
        
        
        
        else if(UserNum<ranNum) {
            System.out.println("Your guess is too low.TRY AGAIN!");
        }
        
        else if(UserNum>ranNum) {
            System.out.println("Your guess is too high.TRY AGAIN!");
        }


      }while(UserNum>=0);


      System.out.println("Thank You!For playing.");
  
    }
  }