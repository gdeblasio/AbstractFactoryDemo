package abstractfactorydemo;

public class Client {
    private final Button button;
    private final ComboBox combobox;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        combobox = factory.createComboBox();
    }

    public void paint() {
        button.paint();
        combobox.paint();
    }
}
