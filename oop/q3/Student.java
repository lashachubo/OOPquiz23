package oop.q3;

public class Student {
    public String name;
    public String surname;
    public String country;
    public String info;

    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student other) {
            return name.equals(other.name)
                    && surname.equals(other.surname)
                    && country.equals(other.country);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (name + surname + country).hashCode();
    }
}
