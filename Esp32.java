class Esp32 {

    private String boardName;
    private String wifiSupport;
    private String bluetooth;
    private int gpioPins;
    private int flashSize;
    private String voltage;
    private boolean usbSupported;

    public void setBoardName(String boardName){
        this.boardName = boardName;
    }
    public String getBoardName(){
        return this.boardName;
    }

    public void setWifiSupport(String wifiSupport){
        this.wifiSupport = wifiSupport;
    }
    public String getWifiSupport(){
        return this.wifiSupport;
    }

    public void setBluetooth(String bluetooth){
        this.bluetooth = bluetooth;
    }
    public String getBluetooth(){
        return this.bluetooth;
    }

    public void setGpioPins(int gpioPins){
        this.gpioPins = gpioPins;
    }
    public int getGpioPins(){
        return this.gpioPins;
    }

    public void setFlashSize(int flashSize){
        this.flashSize = flashSize;
    }
    public int getFlashSize(){
        return this.flashSize;
    }

    public void setVoltage(String voltage){
        this.voltage = voltage;
    }
    public String getVoltage(){
        return this.voltage;
    }

    public void setUsbSupported(boolean usbSupported){
        this.usbSupported = usbSupported;
    }
    public boolean getUsbSupported(){
        return this.usbSupported;
    }
}