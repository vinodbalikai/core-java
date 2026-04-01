class Esp32Runner {
    public static void main(String[] args) {

        Esp32 esp = new Esp32();

        esp.setBoardName("ESP32 DevKit V1");
        System.out.println("Board Name: " + esp.getBoardName());

        esp.setWifiSupport("2.4GHz");
        System.out.println("WiFi: " + esp.getWifiSupport());

        esp.setBluetooth("BLE + Classic");
        System.out.println("Bluetooth: " + esp.getBluetooth());

        esp.setGpioPins(20);
        System.out.println("GPIO Pins: " + esp.getGpioPins());

        esp.setFlashSize(2);
        System.out.println("Flash Size: " + esp.getFlashSize());

        esp.setVoltage("3.3V");
        System.out.println("Voltage: " + esp.getVoltage());

        esp.setUsbSupported(true);
        System.out.println("USB Supported: " + esp.getUsbSupported());


        Esp32 esp1 = new Esp32();

        esp1.setBoardName("ESP32 WROOM");
        System.out.println("Board Name: " + esp1.getBoardName());

        esp1.setWifiSupport("2.4GHz");
        System.out.println("WiFi: " + esp1.getWifiSupport());

        esp1.setBluetooth("BLE");
        System.out.println("Bluetooth: " + esp1.getBluetooth());

        esp1.setGpioPins(18);
        System.out.println("GPIO Pins: " + esp1.getGpioPins());

        esp1.setFlashSize(3);
        System.out.println("Flash Size: " + esp1.getFlashSize());

        esp1.setVoltage("3.3V");
        System.out.println("Voltage: " + esp1.getVoltage());

        esp1.setUsbSupported(true);
        System.out.println("USB Supported: " + esp1.getUsbSupported());


        Esp32 esp2 = new Esp32();

        esp2.setBoardName("ESP32 S3");
        System.out.println("Board Name: " + esp2.getBoardName());

        esp2.setWifiSupport("WiFi 4");
        System.out.println("WiFi: " + esp2.getWifiSupport());

        esp2.setBluetooth("BLE 5");
        System.out.println("Bluetooth: " + esp2.getBluetooth());

        esp2.setGpioPins(35);
        System.out.println("GPIO Pins: " + esp2.getGpioPins());

        esp2.setFlashSize(12);
        System.out.println("Flash Size: " + esp2.getFlashSize());

        esp2.setVoltage("3.3V");
        System.out.println("Voltage: " + esp2.getVoltage());

        esp2.setUsbSupported(true);
        System.out.println("USB Supported: " + esp2.getUsbSupported());


        Esp32 esp3 = new Esp32();

        esp3.setBoardName("NodeMCU ESP32");
        System.out.println("Board Name: " + esp3.getBoardName());

        esp3.setWifiSupport("2.4GHz");
        System.out.println("WiFi: " + esp3.getWifiSupport());

        esp3.setBluetooth("Classic");
        System.out.println("Bluetooth: " + esp3.getBluetooth());

        esp3.setGpioPins(32);
        System.out.println("GPIO Pins: " + esp3.getGpioPins());

        esp3.setFlashSize(4);
        System.out.println("Flash Size: " + esp3.getFlashSize());

        esp3.setVoltage("3.3V");
        System.out.println("Voltage: " + esp3.getVoltage());

        esp3.setUsbSupported(true);
        System.out.println("USB Supported: " + esp3.getUsbSupported());


        Esp32 esp4 = new Esp32();

        esp4.setBoardName("ESP32 Pico");
        System.out.println("Board Name: " + esp4.getBoardName());

        esp4.setWifiSupport("WiFi");
        System.out.println("WiFi: " + esp4.getWifiSupport());

        esp4.setBluetooth("BLE");
        System.out.println("Bluetooth: " + esp4.getBluetooth());

        esp4.setGpioPins(64);
        System.out.println("GPIO Pins: " + esp4.getGpioPins());

        esp4.setFlashSize(3);
        System.out.println("Flash Size: " + esp4.getFlashSize());

        esp4.setVoltage("3.3V");
        System.out.println("Voltage: " + esp4.getVoltage());

        esp4.setUsbSupported(false);
        System.out.println("USB Supported: " + esp4.getUsbSupported());

    }
}