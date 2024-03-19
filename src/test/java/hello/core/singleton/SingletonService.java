package hello.core.singleton;

public class SingletonService {

    // 스프링 실행될 때, static으로 선언되어 있어 자기 자신을 생성해서 인스턴스 참조를 넣어둠
    private static final SingletonService instance = new SingletonService();

    // 다른 곳에서 사용하기 위해서는 오직 getInstance()만 가능함
    // 이 메서드 호출 시 항상 같은 인스턴스를 반환함
    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){
        
    }

    public static void main(String[] args){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
