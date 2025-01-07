public abstract class Person implements Payable {
    private static int ID = 1 ;
    private String name;
    private int id ;
    private String surname;
    Person() {
        this.id = ID++ ;
    }
    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ID++;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public abstract String getPosition();
    @Override
    public String toString() {
        return  id + ". " +
                name + ' ' +
                surname;
    }
}