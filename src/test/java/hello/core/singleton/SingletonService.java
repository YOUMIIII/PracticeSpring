package hello.core.singleton;

public class SingletonService {
    //자기 자신을 private static으로 작성하면 클래스 레벨에 올라가기 때문에 하나만 작성이 가능함.
    private static final SingletonService instance = new SingletonService();

    //private 생성자 생성으로 외부에서 인스턴스 불가능.
    private SingletonService(){
    }

    //외부에서 인스턴스가 필요하면 아래 메소드로만 호출이 가능하고, 항상 같은 인스턴스를 반환하게됨.
    public static SingletonService getInstance(){
        return instance;
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
