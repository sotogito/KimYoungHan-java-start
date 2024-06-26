package collection_1.set;

import java.util.HashSet;

public class HashSet_1 {
    HashSet<String> set = new HashSet<>();

    public static void main(String[] args){
        HashSet_1 hs = new HashSet_1();
        hs.mainController();

    }

    private void mainController(){
        add();
        printAll();
    }

    private void add(){
        set.add("꼬막");
        set.add("기름이");
    }

    private void remove(){
        set.remove("기름이");
    }

    //순서를 보장하지 않음
    private void printAll(){
        set.forEach(element -> {System.out.println(element);});
    }


}
