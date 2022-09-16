package imtihon;

public class Cars {
        public static void main(String[]args){
                Factory fac1 = new Factory("Nissan company");
                Factory fac2 = new Factory("Ferrari company");
                Model model1 = new Model("Car1","Black");
                Model model2 = new Model("Car2","Yellow");
                Model model3 = new Model("Car3","Green");
                Model model4 = new Model("Car4","White");
                Factory.Car car1 = fac1.new Car(model1);
                Factory.Car car2 = fac1.new Car(model2);
                Factory.Car car3 = fac2.new Car(model3);
                car1.getInfo();
                car2.getInfo();
                car3.getInfo();
                fac1.setName("Mersedes Benz");
                car1.getInfo();
                car2.getInfo();
                car3.getInfo();
        }
}

class Factory{
        private String name;

        public Factory(String name) {
                this.name = name;
        }
        class Car{
                private Model model;
                public Car(Model model) {
                        this.model = model;
                }
                public void getInfo(){
                        System.out.println("Brand: " + model.getBrand());
                        System.out.println("Color: " + model.getColor());
                        System.out.println("Factory name: " + name);
                }
        }

        public void setName(String name) {
                this.name = name;
        }
}

class Model{
        private String brand;
        private String color;

        public Model(String brand, String color) {
                this.brand = brand;
                this.color = color;
        }

        public String getBrand() {
                return brand;
        }

        public String getColor() {
                return color;
        }
}

