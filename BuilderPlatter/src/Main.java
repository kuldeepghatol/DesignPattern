//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Student student = Student.builder()
            .id(1)
            .emailId("kuldeepghatol@gmail.com")
            .mobileNumber(1235)
            .build();

        System.out.println(student);


    }
}