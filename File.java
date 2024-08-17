import java.util.Scanner;

class HealthMonitor {
    private double temperature;
    private int heartRate;
    private int systolicPressure;
    private int diastolicPressure;

    public HealthMonitor(double temperature, int heartRate, int systolicPressure, int diastolicPressure) {
        this.temperature = temperature;
        this.heartRate = heartRate;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
    }

    public void displayHealthMetrics() {
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + systolicPressure + "/" + diastolicPressure + " mmHg");
    }

    public void checkHealthStatus() {
        if (temperature < 36.1 || temperature > 37.2) {
            System.out.println("Temperature is abnormal!");
        } else {
            System.out.println("Temperature is normal.");
        }

        if (heartRate < 60 || heartRate > 100) {
            System.out.println("Heart rate is abnormal!");
        } else {
            System.out.println("Heart rate is normal.");
        }

        if (systolicPressure < 90 || systolicPressure > 120 || diastolicPressure < 60 || diastolicPressure > 80) {
            System.out.println("Blood pressure is abnormal!");
        } else {
            System.out.println("Blood pressure is normal.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in °C: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter heart rate in bpm: ");
        int heartRate = scanner.nextInt();

        System.out.print("Enter systolic pressure in mmHg: ");
        int systolicPressure = scanner.nextInt();

        System.out.print("Enter diastolic pressure in mmHg: ");
        int diastolicPressure = scanner.nextInt();

        HealthMonitor monitor = new HealthMonitor(temperature, heartRate, systolicPressure, diastolicPressure);
        monitor.displayHealthMetrics();
        monitor.checkHealthStatus();
    }
}
