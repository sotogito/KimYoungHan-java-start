package collection_1.list;

import java.util.ArrayList;

public class ArrayList_1 {
    ArrayList<String> name = new ArrayList<>();


    public static void main(String[] args) {
        ArrayList_1 arrayList1 = new ArrayList_1();
        arrayList1.main();

    }

    private void main(){
        add();
        printElementAt(0);
        printAll();
    }

    private void add(){
        name.add("춘심이");
        name.add("꼬막이");
        name.add("구름이");

    }

    //특정 요소 값만 출력
    private void printElementAt(int num){
        System.out.println(name.get(num));
    }

    //전체 출력
    private void printAll(){
        for(String name : name){
            System.out.println(name);
        }
    }


}
