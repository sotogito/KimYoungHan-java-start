package extends_1.animals;

//추상화 클래스라 인스턴스 생성 못함
public abstract class Animal {
    public abstract void eat();

    public void sleep(){
        System.out.println("Sleeping...");
    }
}
