import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        char[] mas =  {'I',' ', 'L','o','v','e',' ','N','u','O','R','D','E','R','!'};
        System.out.println(mas);
        String s= new String(mas);
        char symbol=s.charAt(s.length()-1);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
        String sNew1 = list.get(list.size()-1);
        StringBuffer sBuffer1 = new StringBuffer(sNew1);
        sBuffer1.deleteCharAt(sBuffer1.length()-1);
        list.set( list.size()-1, sBuffer1.toString());
        for(int i=0; i<list.size(); i++) {
            String sNew = list.get(i);
            StringBuffer sBuffer = new StringBuffer(sNew);
            sBuffer.reverse();
            System.out.print(sBuffer+" ");
        }
        System.out.println(symbol);
        }
    }

