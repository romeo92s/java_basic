

public class CarTest2 {

    public static void main(String[] args) {
        Car2 Sorento = new Car2("MQ4", "White");

        System.out.println("내 차의 모델은" + Sorento.model + "이고 색상은 " + Sorento.color + "입니다.");
        Sorento.power();
        Sorento.accelerate();
        Sorento.stop();
    }
}

class Car2 {
    public String model;
    public String color;

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void power() {
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("엑셀을 밟았습니다.");
    }

    void stop() {
        System.out.println("브레이크를 밟았습니다.");
    }
}
