public class GenerateSubsets {
    public static void main(String[] args) {
        subSets("ABC","",0);
      
    }

    static void subSets(String str, String current, int i) {
        if (i == str.length()) {
            System.out.println(current);
            return;
        }
        subSets(str,current,i+1);
        subSets(str,current+str.charAt(i),i+1);
       
    }
}
