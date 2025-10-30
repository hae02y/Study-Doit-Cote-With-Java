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

        while(true){
            String s =  br.readLine();
            if(s.equals("0")){
                break;
            }
            String[] split = s.split("");

            ArrayDeque<String> deque = new ArrayDeque<String>(Arrays.asList(split));
            int sig = 0;

            while(deque.size() >= 2){
                String s1 = deque.removeFirst();
                String s2 = deque.removeLast();
                if(!s1.equals(s2)){

                    System.out.println("no");
                    sig = 1;
                    break;
                }
            }
            if(sig == 0){
                System.out.println("yes");
            }
        }
    }
}
