import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NonNull
    String name;
    int age;
    String address;
}
