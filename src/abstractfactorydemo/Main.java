package abstractfactorydemo;

public class Main {

    public static void main(String[] args) {
        Client cliente;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            factory = new WindowsFactory();
            cliente = new Client(factory);
        } else {
            factory = new MacFactory();
            cliente = new Client(factory);
        }
    }
    
}
