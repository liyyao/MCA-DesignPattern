package builder.v2;

public class Main {

    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                .basicInfo(1, "lisi", 20)
                .score(20)
                .weight(100)
                .loc("bj", "2")
                .build();
        System.out.println(p);
    }
}
