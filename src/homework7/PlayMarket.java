package homework7;

import java.util.Objects;


class PlayMarket {
    App[] apps;
    int newSize;
    int countApp;
    private int marketSize;  // play market size;


    public PlayMarket(int marketSize) {
        this.marketSize = marketSize;
        apps = new App[marketSize];
        newSize = marketSize;
    }

    protected boolean addApp(App app) {
        if (newSize >= app.getAppSize() && !cheek(app)) {
            apps[countApp++] = app;
            newSize -= app.getAppSize();
            return true;
        }
        return false;
    }

    protected void infoApp() {
        for (int i = 0; i < countApp; i++) {
            if (this.apps[i] != null) {
                System.out.println("Name " + apps[i].getAppName() + " Size " + apps[i].getAppSize());
            }
        }
    }

    protected boolean removeApp(String s) {
        boolean mavjud = false;
        int index = 0;
        if (ceek2(s) != -1) {
            for (int i = 0; i < countApp; i++) {//i=1;
                if (Objects.equals(s, apps[i].getAppName())) {
                    mavjud = true;
                    index = i;
                    newSize+=apps[index].getAppSize();
                    break;
                }
            }
            if (mavjud) {
                for (int i = index; i <= countApp; i++) {
                    apps[i] = apps[i + 1];//2 3 4
                }
                apps[countApp - 1] = null;////
                countApp--;
                return true;
            }


        }

        return false;
    }

    protected void infoAppCount() {
        System.out.println(countApp + " - shuncha dastur bor ");
    }

    void infoMemory() {
        System.out.println(marketSize - newSize + " shuncha joy olgan ");
    }

    private boolean cheek(App app) {
        for (int i = 0; i < countApp; i++) {
            if (apps[i].getAppName().equals(app.getAppName())) {
                return true;
            }
        }
        return false;
    }

    int index = 0;

    private int ceek2(String s) {

        for (int i = 0; i < countApp; i++) {
            if (apps[i].getAppName().equals(s)) {

                index = i;
                return i;
            }
        }
        return -1;
    }
}