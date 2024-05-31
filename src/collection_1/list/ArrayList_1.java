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
        addElementAt(0);

        checkDuplication("춘심이");
        checkDuplication("마루");
        deleteElementAt(0);

        printElementAt(0);
        printAll();
        printAllReverse();
    }

    //리스트에 데이터 넣기
    private void add(){
        name.add("춘심이");
        name.add("꼬막이");
        name.add("구름이");

    }

    //특정 인덱스에 데이터 넣기
    private void addElementAt(int index){
        name.add(0,"코코");
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

    //전체 반대로 출력
    private void printAllReverse(){
        for(int i = name.size() - 1; i >= 0; i--){
            System.out.println(name.get(i));
        }
    }


    //중복되지 않는 값만 넣기
    private void checkDuplication(String dogName){
        if(!name.contains(dogName)){
            name.add(dogName);
        }
    }

    //데이터 삭제
    private void deleteElementAt(int index){
        int lastIndex = name.size()-1;
        name.remove(lastIndex);
    }


}
