class SecondClass{
    static public  void main(String ...arr){
        int sum  = 0;
        for(int i = 0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println("Sum is "+sum);
        /*int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = a + b;
        System.out.println("Sum is "+c);
        */
    }
}