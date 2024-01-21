import javax.swing.SwingUtilities;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new WeatherGUI().setVisible(true);
                //System.out.println(WeatherAPI.getLocationData("Tokyo"));
                //System.out.println((WeatherAPI.getCurrentTime()));
            }
        });
    }
}
