
public class ConstructorExample {
    public static void main(String[] args){
       Mar c = new Mar("Model MQ4","흰색",250);
        System.out.println("제 차는 "+c.getModelName()+"이고,컬러는" +c.getColor()+"이고 최대속도는 "+c.getMaxSpeed()+"입니다.");
    }
}
class Mar{
    private String modelName;
    private String color;
    private int maxSpeed;

    public Mar(String modelName, String color, int maxSpeed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName(){
        return modelName;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }


}
