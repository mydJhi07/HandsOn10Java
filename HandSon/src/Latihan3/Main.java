package Latihan3;
interface Movable {
    void move();
}

interface EngineStartable {
    void startEngine();
}

interface Fuelable {
    void isiBahanBakar();
}

interface Rechargeable {
    void isiBaterai();
}

interface Pedalable {
    void kayuh();
}

class MobilBensin implements Movable, EngineStartable, Fuelable {

    public void move() {
        System.out.println("Mobil bensin berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bensin mobil.");
    }
}

class MobilListrik implements Movable, EngineStartable, Rechargeable {

    public void move() {
        System.out.println("Mobil listrik berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan motor listrik.");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}

class Sepeda implements Movable, Pedalable {

    public void move() {
        System.out.println("Sepeda sedang berjalan.");
    }

    public void kayuh() {
        System.out.println("Mengayuh pedal sepeda.");
    }
}

class MobilHybrid implements Movable, EngineStartable,
        Fuelable, Rechargeable {

    public void move() {
        System.out.println("Mobil hybrid berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan sistem mesin hybrid.");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bensin mobil hybrid.");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil hybrid.");
    }
}

class VehicleController {

    public void operate(Movable vehicle) {
        vehicle.move();
    }
}


public class Main {
    public static void main(String[] args) {

        VehicleController controller = new VehicleController();

        MobilBensin bensin = new MobilBensin();
        MobilListrik listrik = new MobilListrik();
        Sepeda sepeda = new Sepeda();
        MobilHybrid hybrid = new MobilHybrid();

        controller.operate(bensin);
        controller.operate(listrik);
        controller.operate(sepeda);
        controller.operate(hybrid);

        System.out.println("\n--- Kemampuan Khusus ---");

        bensin.startEngine();
        bensin.isiBahanBakar();

        listrik.startEngine();
        listrik.isiBaterai();

        sepeda.kayuh();

        hybrid.startEngine();
        hybrid.isiBahanBakar();
        hybrid.isiBaterai();
    }
}


