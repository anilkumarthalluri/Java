public class String_Cases{
    public static void main(String[] rgs){
        String s1 = "hello";
        String s2 = "java";
        System.out.println((s1.length()+s2.length()));
        //System.out.println(s2.compareTo(s1));
        if(s1.compareTo(s2)>0){
            System.out.println("Yes");
        }
        else
        System.out.println("No");
        // String A = s1.substring(0,2);
        // String B = s2.substring(1);
        // System.out.println(A+" "+B);
        String A = s1.substring(0,1);
        String B = s2.substring(0,1);
        System.out.println(A.toUpperCase()+s1.substring(1)+" "+B.toUpperCase()+s2.substring(1));
    }
}