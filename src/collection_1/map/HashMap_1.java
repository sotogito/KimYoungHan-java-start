package collection_1.map;

import java.util.*;

public class HashMap_1 {
    Map<String, Integer> map = new HashMap<>();



    public static void main(String[] args) {
        HashMap_1 hashMap1 = new HashMap_1();
        hashMap1.main();

    }

    private void main(){
        add();
        saveNotDuplication("수키피");

        printAllElements();
        printAllKeys();
        printAllValues();
        printAllElementsReverse();


    }

    //추가하기
    private void add(){
        map.put("수키피",0);
        map.put("꼬막이",1);
        map.put("마루",2);
        map.put("춘심이",3);
        map.put("춘심이1",3);
        map.put("춘심2",3);
    }

    //key 기준으로 삭제하기
    private void removeKey(){
        map.remove("꼬막이");
    }

    //value 기준으로 삭제하기
    private void removeValue(){
        map.values().remove(1);
    }

    //valur 기준으로 해당 값 모두 삭제하기
    private void removeValueAll(){
        map.values().removeAll(Arrays.asList(2,3));
    }

    //모든 데이터 삭제
    private void allClear(){
        map.clear();
    }


    //모든 key-value 출력하기
    private void printAllElements(){
        //System.out.println(map); //{수키피=0, 춘심2=3, 마루=2, 춘심이1=3, 춘심이=3, 꼬막이=1}

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

    //모든 key-value 반대로 출력하기
    /*
        1. HashMap을 엔트리 리스트로 넣기
        2. 리스트 뒤집기
        3. 출력하기
     */
    private void printAllElementsReverse(){
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.reverse(entryList);
        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    //key만 출력하기
    private void printAllKeys(){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
    //value만 출력하기
    private void printAllValues(){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    //중복된 key는 넣지 않기
    private void saveNotDuplication(String dogName){
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        if(!map.containsKey(dogName)){
            map.put(dogName, entryList.size());
        }
    }

}
