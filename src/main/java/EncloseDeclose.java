public class EncloseDeclose {

    public static void main(String[] args) {
        String s= "(){}[]";
        int count=0;
       for(int x=0; x<s.length(); x++) {
           if (s.charAt(x)=='(' || s.charAt(x)=='{' || s.charAt(x)=='[')         {
               count++;
           }
           else{
               count--;
           }
       }
        System.out.println(count==0);
    }
}
