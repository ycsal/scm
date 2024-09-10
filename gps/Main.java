public class Main {
    public static void main(String[] args) {
        Gps gps = Gps.getInstance();
        gps.setLatitude(-26.94f);
        gps.setLongitude(-46.32f);

        System.out.printf("Coordenadas Fatec-RL: %.2f, %.2f", gps.getLatitude(), gps.getLongitude());

    }

}
