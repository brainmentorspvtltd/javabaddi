class StringDemo{
    public static void main(String[] args) {
        String name = "Amit".intern(); // String Literal
        String name2 = "Amit".intern();
        String name3 = new String("Amit").intern();
        name2 = "Ram";
         System.out.println(name==name2);
         System.out.println(name==name3);
        //StringBuilder sb = new StringBuilder("Hello");
         StringBuffer sb = new StringBuffer("Hello");
         System.out.println(sb.capacity());
         System.out.println(sb.length());
         sb.append("hgdskjghdkjghjjghdkjghdjkhgdfhgkhdfjkghjkdfhgjkhdfjkghjkdfhgkjdfhkjghdkjfhkhgdh");
         System.out.println(sb.capacity());
         System.out.println(sb.length());


         


    }
}