public class Iphone extends Phone{
    private String name;

    public Iphone(String name) {
        this.name=name;
    }

    @Override
    public void purchase() {
        System.out.println(name+"님이 애플폰을 구매했습니다.");
    }

    @Override
    public void turnOn() {
        System.out.println(name+"님이 애플폰을 켰습니다.");
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
