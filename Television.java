class Television {
    String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channelName) {
        boolean isChannelAdded = false;

        if (channelName != null && !channelName.isEmpty()) {
            channelNames[index++] = channelName;
            isChannelAdded = true;
        } else {
            System.out.println("the channel name entered is invalid");
        }
        return isChannelAdded;
    }
    public void getChannelNames() {
        System.out.println("The channel names are:");
        for (String channel : channelNames) {
            System.out.println(channel);
        }
    }
}