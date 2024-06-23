class Lambda_Count_Words{
  public static void main(String[] args){
        String str = "Java Excercises and practising";
        System.out.println(str);
        A obj = new A(){
            public void show(String s){
                int count = 1;
                int len = s.length();
                for(int i = 0;i<len;i++){
                    if(s.charAt(i)==' '){
                        count++;
                    }
                }
                System.out.println("Total no.of words : "+count);
            }
        };
        obj.show(str);
    }
}

@FunctionalInterface
interface A{
     void show(String str);
}