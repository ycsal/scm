public class Gps {
    private float latitude, longitude;

    private static Gps instance;

    public static Gps getInstance() {
        if (instance == null){
            instance = new Gps();
        }
        return instance;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    private Gps(){

    }
}
