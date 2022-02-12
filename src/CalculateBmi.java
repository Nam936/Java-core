public class CalculateBmi {
    //Kiểu double
    public  static double bmiCalcu(float v){
        double weight = 65;
        double height = 1.72;
        double result = weight + (height*height);
        return result;
    }
    //     Kiểu double và có truyền tham số
    public static double bmicalcu2 (double weight, double height){
        double resultbmi2 = weight + (height*height);
        return resultbmi2;
    }
}
