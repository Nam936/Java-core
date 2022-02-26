public class Cau2 {
    public static int count(String s)
    {
        int i = 0, count = 1;
        char[] s1 = s.toCharArray();

        while(s1[i] == ' ')
        {
            i++;
        }
        for (int j = i; j < s1.length - 1; j++)
        {
            if(s1[j] == ' ' && s1[j + 1] != ' ')
            {
                count++;
            }
        }
        return count;
    }
//    public static int CountIndex(){
//        String s = "You only live once, but if you do it right, once is enough";
//        int len = s.length();
//        for (int i=0; i < len; i++){
//            //so sánh ký tự có index i với "o"
//            if ( s.indexOf('o',1)){
//                System.out.println("Các vị trí của ký tự o: ");
//            }
//        }
//
//        return 0;
//    }


    public static void main(String[] args)
    {

        System.out.println("Trong chuỗi có: " + count("You only live once, but if you do it right, once is enough")+" từ");
//        Cau2.CountIndex();
    }
}

