import com.google.gson.annotations.SerializedName;

public class Person {
    @SerializedName("name")
    String fullName;

    @SerializedName("age")
    int age;

    @SerializedName("address")
    String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return fullName + " - " + age + " - " +address;
    }
}
