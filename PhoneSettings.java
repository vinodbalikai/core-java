class PhoneSettings {

    private String ringtone;
    private boolean wifiEnabled;
    private int brightness;
    private String wallpaper;
    private boolean bluetoothEnabled;
    private int volumeLevel;
    private String language;

    public void setRingtone(String ringtone){
        this.ringtone = ringtone;
    }
    public String getRingtone(){
        return this.ringtone;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    public int getBrightness(){
        return this.brightness;
    }

    public void setWifiEnabled(boolean wifiEnabled){
        this.wifiEnabled = wifiEnabled;
    }
    public boolean isWifiEnabled(){
        return this.wifiEnabled;
    }

    public void setWallpaper(String wallpaper){
        this.wallpaper = wallpaper;
    }
    public String getWallpaper(){
        return this.wallpaper;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled){
        this.bluetoothEnabled = bluetoothEnabled;
    }
    public boolean isBluetoothEnabled(){
        return this.bluetoothEnabled;
    }

    public void setVolumeLevel(int volumeLevel){
        this.volumeLevel = volumeLevel;
    }
    public int getVolumeLevel(){
        return this.volumeLevel;
    }

    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }

}