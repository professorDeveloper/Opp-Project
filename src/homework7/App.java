package homework7;


class App {
    private String appName;  // bita dastur nomi
    private int appSize; // bita dastru hajmi

    public App(String appName, int appSize) {
        this.appName = appName;
        this.appSize = appSize;
    }

    public String getAppName() {
        return appName;
    }

    public int getAppSize() {
        return appSize;
    }
}

