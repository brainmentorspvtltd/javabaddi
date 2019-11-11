import java.util.Scanner;

class MenuApp{
    public static void main(String[] args) {

        int x[] = {10,20,30,40,50};
        int []x1 = {10,20,30,40,50};
        int x2[] = new int[]{10,20,30,40,50};
        int x3[] = new int[5];
        for(int y : x){
            System.out.println(y);
        }
        int r[][] = new int[3][];
        r[0] = new int[10];
        r[1] = new int[20];
        r[2] = new int[30];
        r[0][3] = 1;
        for(int i = 0 ; i<r.length;i++){
            for(int j = 0;j<r[i].length; j++){
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }



        // break continue Labeled Loop
        mylabel:
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                    continue mylabel;
                }
                System.out.println("I is "+i+" and J is "+j);
            }
        }

        /*final int SUNDAY = 1;
        final int MONDAY = 2;
        int day = SUNDAY;
        switch(day){
            case SUNDAY:
                System.out.println("");
            case MONDAY:
            System.out.println("");

        }*/
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter the day");
        String ch = sb.next();
        switch(ch){
            case "Sunday":
                System.out.println("");
                break;
                case "Monday":
                System.out.println("");
                default:
        }

       
       
        while(true){
            System.out.println("1. Burger");
            System.out.println("2. Pizza");
            System.out.println("3. Quit");
            System.out.println("Press any other key to Continue");
            int choice = sb.nextInt();
            if(choice == 1){
                System.out.println("Burger Price is 100Rs");
            }
            else
            if(choice == 2){
                System.out.println("Pizza Price is 200Rs");
            }
            else
            if(choice == 3){
                break;
            }
        }
    }
}