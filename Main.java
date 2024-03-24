//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int volume = 1200; // объем басика
    int fillingSpeed = 30; // плюс в минуту 30 литров
    int devastationSpeed = 10; // минус 10 литров в минуту
    int a = fillingSpeed - devastationSpeed;

    int countMinutes;

    while (volume>a){
        countMinutes = volume/a;
        System.out.println(countMinutes + "минут");
        break;

    }

    }
}