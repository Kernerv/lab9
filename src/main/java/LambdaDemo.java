interface IStringLenght {
    int task1(String s);
}
interface IgetFistChar{
    char task2(String s);
}
interface InotHaveProbel{
    boolean task3(String s);
}
interface IgetCountWords{
    int task4(String s);
}
interface IgetAge{
    int task5(Human human);
}
interface IsurnameEqual{
    boolean task6(Human human1, Human human2);
}
interface IgetFullName{
    String task7(Human human);
}
interface IPlusOneYearHuman{
    Human task8(Human human);
}
interface ICheckYoungerMaxAge{
    boolean task9(Human human1, Human human2, Human human3, int maxAge);
}
public class LambdaDemo {
    final static IStringLenght stringLenght = (s -> s.length());
    final static IgetFistChar getFirstChar = (s -> s.charAt(0));
    final static  InotHaveProbel notHaveProbel = (s -> !s.contains(" "));
    final static IgetCountWords getCountWords = (s -> s.split(" ").length);
    final static IgetAge getAge = ( human -> human.getAge());
    final static IsurnameEqual surnameEqual = ((human1, human2) -> human1.getSurname().equals(human2.getSurname()));
    final static IgetFullName getFullName = (human -> human.getSurname()+" "+human.getName()+" "+human.getMidleName());
    final static IPlusOneYearHuman PlusOneYearHumanan =
            (human -> new Human(human.getSurname(), human.getName(), human.getMidleName(), human.getAge()+1, human.getGender()));
    final static ICheckYoungerMaxAge CheckYoungerMaxAge =
            ((human1, human2, human3, maxAge) -> human1.getAge()<maxAge && human2.getAge()<maxAge && human3.getAge()<maxAge);

}

