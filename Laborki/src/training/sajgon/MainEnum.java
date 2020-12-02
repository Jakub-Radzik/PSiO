package training.sajgon;

public class MainEnum {
        private Season ses;

    public MainEnum(Season ses) {
        this.ses = ses;
    }

    public Season getSes() {
        return ses;
    }

    public void setSes(Season ses) {
        this.ses = ses;
    }

    public static void main(String[] args) {
        MainEnum en = new MainEnum(Season.SPRING);
        System.out.println(en.getSes());

    }
}

enum Season{
    SPRING,
    SUMMER,
    FALL,
    WINTER
}
