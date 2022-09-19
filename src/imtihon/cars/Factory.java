package imtihon.cars;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> imtihon.cars
 * Class Name -> Factor
 * Copyright © : 9/16/2022
 */
public class Factory {
    private String factoryName;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
    }

    public void setName(String factoryName) {
        this.factoryName = factoryName;
    }

    class Car {
        private Model model;

        public Car(Model model) {
            this.model = model;
        }
        public void  getInfo(){
            System.out.println("Factory name: "+factoryName);
            System.out.println("Brand Name: "+model.getModelName());
            System.out.println("Brand Color: "+model.getColor());
        }

       static class Model {
            private String modelName;
            private  String color;

            public Model(String modelName, String color) {
                this.modelName = modelName;
                this.color = color;
            }

            public String getModelName() {
                return modelName;
            }

            public String getColor() {
                return color;
            }
        }


    }


}


