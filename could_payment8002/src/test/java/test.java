import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.*;

public class test {
    public static void main(String[] args) {
//        int[] list={0,15,3,1,4,5,4,5,16,1,6,14,9,8,17,6,5,21,5,999};
//        for (int i : list) {
//          new Thread(()->{
//              try {
//                  Thread.sleep(i);
//              } catch (InterruptedException e) {
//                  e.printStackTrace();
//              }
//              System.out.println(i);
//          }).start();
//        }
//        Arrays.stream(list).forEach(i->{
//            System.out.println(i+"?");
//        });
        System.out.println((2 << 30) - 1);
        BigInteger bigInteger = BigInteger.valueOf((long) Math.pow(2, 31));
        System.out.println(bigInteger.intValue());
//        HashMap<String, Integer> list=new HashMap();
//        list.put("苹果",12);
//        list.put("草莓",20);
//        list.forEach((s, integer) -> {
//            System.out.println(s);
//            System.out.println(integer);
//        });

    }
}
