
public class BmiElvira {

    public static void main(String[] args) {
        int beratbadan = 40;
        float tinggibadan = 1.47f;
        
        float bmi = (beratbadan / (tinggibadan * tinggibadan));

        System.out.println("BMI SAYA ADALAH\t: + bmi");

        if (bmi < 18.5) {
            System.out.println("Kurus");
        }
        if (bmi < 22.9) {
            System.out.println("Normal");
        }
        if (bmi < 29.9) {
            System.out.println("Gemuk");
        } else {
            System.out.println("Obesitas");
        }
    }

}
