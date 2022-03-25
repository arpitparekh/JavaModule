package jan07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapCollcetion {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("first",12);
        map.put("second",13);
        map.put("third",177);
        map.put("fourth",1276);

        System.out.println(map);

        HashMap<String,String> map2 = new HashMap<>();

        map2.put("first_name","arpit");
        map2.put("last_name","parekh");
        map2.put("phoneNo.","123455");

        System.out.println(map2);

//        for(HashMap<String,String> hashMap : map2)

        for(String data : map2.values()){
            System.out.println(data);
        }

        for(String data : map2.keySet()){
            System.out.println(data);
        }

        for(Map.Entry<String,String> map4 : map2.entrySet()){

            System.out.println(map4.getValue()+" "+map4.getKey());

        }


    }
}
