public class LambdaRunner {
    public static int getStringLenght(IStringLenght stringLenght, String s){
        return stringLenght.task1(s);
    }

    public static char getFirstChar(IgetFistChar getFistChar, String s){
        return getFistChar.task2(s);
    }

    public static boolean notHaveProbel(InotHaveProbel notHaveProbel, String s){
        return notHaveProbel.task3(s);
    }

    public static int getCountWord(IgetCountWords getCountWords, String s){
        return getCountWords.task4(s);
    }

    public static int getAge(IgetAge getAge, Human human){
        return getAge.task5(human);
    }

    public static boolean SurnameEqual(IsurnameEqual surnameEqual, Human human1, Human human2){
        return surnameEqual.task6(human1, human2);
    }

    public static String getFullName(IgetFullName getFullName, Human human){
        return getFullName.task7(human);
    }

    public static Human PlusOneYearHuman(IPlusOneYearHuman plusOneYearHuman, Human human){
        return plusOneYearHuman.task8(human);
    }

    public static boolean CheckYoungerMaxAge(ICheckYoungerMaxAge checkYoungerMaxAge, Human human1, Human human2, Human human3, int maxAge){
        return checkYoungerMaxAge.task9(human1, human2, human3, maxAge);
    }
}

