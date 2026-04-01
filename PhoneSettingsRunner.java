class PhoneSettingsExecutor {
    public static void main(String[] args) {

        PhoneSettings ps1 = new PhoneSettings();

        ps1.setRingtone("Beep Beep");
        System.out.println("Ringtone: " + ps1.getRingtone());

        ps1.setBrightness(70);
        System.out.println("Brightness: " + ps1.getBrightness());

        ps1.setWifiEnabled(true);
        System.out.println("WiFi Enabled: " + ps1.isWifiEnabled());

        ps1.setWallpaper("Sunset");
        System.out.println("Wallpaper: " + ps1.getWallpaper());

        ps1.setBluetoothEnabled(false);
        System.out.println("Bluetooth Enabled: " + ps1.isBluetoothEnabled());

        ps1.setVolumeLevel(50);
        System.out.println("Volume Level: " + ps1.getVolumeLevel());

        ps1.setLanguage("English");
        System.out.println("Language: " + ps1.getLanguage());

        PhoneSettings ps2 = new PhoneSettings();

        ps2.setRingtone("Classic Tone");
        System.out.println("Ringtone: " + ps2.getRingtone());

        ps2.setBrightness(40);
        System.out.println("Brightness: " + ps2.getBrightness());

        ps2.setWifiEnabled(false);
        System.out.println("WiFi Enabled: " + ps2.isWifiEnabled());

        ps2.setWallpaper("Mountain View");
        System.out.println("Wallpaper: " + ps2.getWallpaper());

        ps2.setBluetoothEnabled(true);
        System.out.println("Bluetooth Enabled: " + ps2.isBluetoothEnabled());

        ps2.setVolumeLevel(30);
        System.out.println("Volume Level: " + ps2.getVolumeLevel());

        ps2.setLanguage("Spanish");
        System.out.println("Language: " + ps2.getLanguage());

        PhoneSettings ps3 = new PhoneSettings();

        ps3.setRingtone("Pop Tone");
        System.out.println("Ringtone: " + ps3.getRingtone());

        ps3.setBrightness(90);
        System.out.println("Brightness: " + ps3.getBrightness());

        ps3.setWifiEnabled(true);
        System.out.println("WiFi Enabled: " + ps3.isWifiEnabled());

        ps3.setWallpaper("Ocean Waves");
        System.out.println("Wallpaper: " + ps3.getWallpaper());

        ps3.setBluetoothEnabled(true);
        System.out.println("Bluetooth Enabled: " + ps3.isBluetoothEnabled());

        ps3.setVolumeLevel(75);
        System.out.println("Volume Level: " + ps3.getVolumeLevel());

        ps3.setLanguage("French");
        System.out.println("Language: " + ps3.getLanguage());

        PhoneSettings ps4 = new PhoneSettings();

        ps4.setRingtone("Chinese");
        System.out.println("Ringtone: " + ps4.getRingtone());

        ps4.setBrightness(55);
        System.out.println("Brightness: " + ps4.getBrightness());

        ps4.setWifiEnabled(false);
        System.out.println("WiFi Enabled: " + ps4.isWifiEnabled());

        ps4.setWallpaper("City Lights");
        System.out.println("Wallpaper: " + ps4.getWallpaper());

        ps4.setBluetoothEnabled(false);
        System.out.println("Bluetooth Enabled: " + ps4.isBluetoothEnabled());

        ps4.setVolumeLevel(60);
        System.out.println("Volume Level: " + ps4.getVolumeLevel());

        ps4.setLanguage("German");
        System.out.println("Language: " + ps4.getLanguage());

        PhoneSettings ps5 = new PhoneSettings();

        ps5.setRingtone("Jazz Tune");
        System.out.println("Ringtone: " + ps5.getRingtone());

        ps5.setBrightness(80);
        System.out.println("Brightness: " + ps5.getBrightness());

        ps5.setWifiEnabled(true);
        System.out.println("WiFi Enabled: " + ps5.isWifiEnabled());

        ps5.setWallpaper("Forest Trail");
        System.out.println("Wallpaper: " + ps5.getWallpaper());

        ps5.setBluetoothEnabled(true);
        System.out.println("Bluetooth Enabled: " + ps5.isBluetoothEnabled());

        ps5.setVolumeLevel(45);
        System.out.println("Volume Level: " + ps5.getVolumeLevel());

        ps5.setLanguage("Hindi");
        System.out.println("Language: " + ps5.getLanguage());

    }
}