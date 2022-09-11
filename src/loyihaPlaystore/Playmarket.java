package loyihaPlaystore;

import java.util.ArrayList;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> loyihaPlaystore
 * Class Name -> Playmarket
 * Copyright © : 8/31/2022
 */
public class Playmarket {
    int size;
    private ArrayList<String> names;
    private ArrayList<Integer> sizes;
    private int currentMemory;


    public Playmarket(int size) {
        this.size=size;
        names = new ArrayList<>();
        sizes = new ArrayList<>();
        currentMemory = size;
            }
    public boolean addApp(App app){

        if (!(names.contains(app.getName())) && (currentMemory >= app.getSize())) {
            names.add(app.getName());
            sizes.add(app.getSize());
            currentMemory -= app.getSize();
            return true;
        }
        return false;
    }
    public void infoApp(){
        for (int i = 0; i < names.size(); i++) {
            System.out.println("=============================[" + (i + 1) + "]===========================");
            System.out.println("AppName: " + names.get(i));
            System.out.println("AppSize: " + sizes.get(i));
            System.out.println("=====================================================================");
        }    }
    public int infoCountApp(){
        return sizes.size();
    }
    public boolean removeApp(App app){

        if (names.contains(app.getName())) {
            int a = names.indexOf(app.getName());
            names.remove(a);
            currentMemory += sizes.get(a);
            return true;
        }
        return false;
    }
    public int infoMemory(){
        return currentMemory;
    }

}
