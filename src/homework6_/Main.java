package homework6_;

public class Main {
    public static void main(String[] args) {
        Device device = new Device(80);
        Capacity capacity = new Capacity(20);
        Ticket ticket = new Ticket(1500);
        Bus bus = new Bus(capacity, ticket);
    }
}

class App {
    private String name;
    private int volume;

    public App(String _name, int _volume) {
        name = _name;
        volume = _volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}

class Device {
    private App[] appList;
    private int haveVolume;
    private int appNumber;

    public Device(int _volumeDevice) {
        appList = new App[_volumeDevice];
    }

    boolean install(App app) {
        boolean isHave = true;
        for (int i = 0; i < appNumber; i++) {
            if (app.getName().equalsIgnoreCase(appList[i].getName())) {
                System.out.println("Bunday App mavjud;");
                isHave = false;
            }
        }
        if (app.getVolume() > appList.length - haveVolume) {
            System.out.println("Qurilmada joy yetarli emas;");
            isHave = false;
        }
        if (isHave) {
            appList[appNumber++] = app;
            haveVolume += app.getVolume();
        }
        return isHave;

    }

    void showApps() {
        for (int i = 0; i < appNumber; i++) {
            System.out.println(appList[i].getName() + " " + appList[i].getVolume());
        }
    }

    boolean uninstall(String appName) {
        boolean isHave = false;
        for (int i = 0; i < appNumber; i++) {
            if (appList[i].getName() == appName) {
                isHave = true;
                appNumber--;
            }
            if (isHave) {
                appList[i] = appList[i + 1];
            }
        }
        return isHave;
    }

    void run(String appName) {
        for (int i = 0; i < appNumber; i++) {
            if (appList[i].getName() == appName) {
                System.out.println(appList[i].getName() + " : " + appList[i].getVolume());
                return;
            }
        }
        System.out.println("Qurilmada bunday app yoq");
    }

    void info() {
        System.out.print("Qurilmadagi applar soni " + appNumber + " ta Ular : [");
        for (int i = 0; i < appNumber; i++) {
            System.out.print(appList[i].getName() + " " + appList[i].getVolume() + "; ");
        }
        System.out.print("\b\b]");
    }
}

class Capacity {
    private int sigimi;
    int yolovchilar;

    public Capacity(int _sigimi) {
        sigimi = _sigimi;
    }

    public int getSigimi() {
        return sigimi;
    }

}

class Ticket {
    private int narxi;

    public Ticket(int _narxi) {
        narxi = _narxi;
    }

    public int getNarxi() {
        return narxi;
    }
}

class Bus {
    private Capacity capacity;
    private Ticket ticket;

    public Bus(Capacity _capacity, Ticket _ticket) {
        capacity = _capacity;
        ticket = _ticket;
    }

    public int inPassager(int passager) {
        if (capacity.getSigimi() - capacity.yolovchilar >= passager) {
            capacity.yolovchilar += passager;
            return passager;
        } else {
            capacity.yolovchilar = capacity.getSigimi();
            return capacity.getSigimi() - capacity.yolovchilar;
        }
    }

    public int outPassager(int passager) {
        if (capacity.yolovchilar >= passager) {
            capacity.yolovchilar -= passager;

        } else {
            passager = capacity.yolovchilar;
            capacity.yolovchilar = 0;
        }
        return passager;
    }

    public int getBalance() {
        return capacity.yolovchilar * ticket.getNarxi();
    }

    public boolean isFull() {
        if (capacity.getSigimi() == capacity.yolovchilar) {
            return true;
        } else return false;
    }

    public boolean isEmpty() {
        if (capacity.yolovchilar == 0) {
            return true;
        } else return false;
    }
}