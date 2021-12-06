import java.util.Objects;

enum Gender{MAN, WOMEN};


public class Human {
    private Gender gender;
    private String surname, name, midleName;
    private int age;

    public Human(String surname, String name, String midleName, int age, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.midleName = midleName;
        this.age = age;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() &&
                getGender() == human.getGender() &&
                getSurname().equals(human.getSurname()) &&
                getName().equals(human.getName()) &&
                getMidleName().equals(human.getMidleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGender(), getSurname(), getName(), getMidleName(), getAge());
    }
}
