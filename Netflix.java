class Netflix {
    String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String seriesName) {
        boolean isSeriesAdded = false;

        if (seriesName != null && !seriesName.isEmpty()) {
            webSeries[index++] = seriesName;
            isSeriesAdded = true;
        } else {
            System.out.println("the series name entered is invalid");
        }

        return isSeriesAdded;
    }

    public void getWebSeries() {
        System.out.println("The web series are:");
        for (String series : webSeries) {
            System.out.println(series);
        }
    }
}