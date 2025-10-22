package sparta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class 펠린드롬연결리스트 {

    /*
    * 팰린드롬 -> LinkedList로 문제 풀기
    * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while(true){
            String str = br.readLine();
            if(str.equals("0")){
                break;
            }
            list.add(str);
        }

        for(String str2 : list){
            String[] split = str2.split("");

            LinkedList<String> s = new LinkedList<>(Arrays.stream(split).toList());

            while(s.size() > 1){
                String s1 = s.removeFirst();
                String s2 = s.removeLast();

                if(!s1.equals(s2)){
                    System.out.println("no");
                    break;
                }
            }

            System.out.println("yes");
        }

        br.close();
    }
}
