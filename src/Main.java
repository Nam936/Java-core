public class Main {
    public static void main(String[] args){
        //Kiểu tra về void
            float weight = 63;
            float height = (float) 1.72;
            float resultbmi = weight + (height*height);
        System.out.println("ĐO chỉ số BMI của bạn");
            System.out.println("Chỉ số BMI của bạn là: "+ resultbmi);
        System.out.println("`````````````````````````````");
        System.out.println("`````````````````````````````");


        //Kiểu double
        double result = CalculateBmi.bmiCalcu(weight + (height*height));
        System.out.println("Chỉ số BMI của bạn là: "+result);
        System.out.println("`````````````````````````````");
        System.out.println("`````````````````````````````");


        //Kiểu double có tham số
        double bmi = CalculateBmi.bmicalcu2(66, 1.78);
        System.out.println("Chỉ số BMI của bạn là: " + bmi);


    }

}
