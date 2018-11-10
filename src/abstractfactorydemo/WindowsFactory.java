package abstractfactorydemo;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        System.out.println("creando un botón de Windows");
        return new WindowsButton();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("creando un combobox para Windows");
        return new WindowsComboBox();
    }



}
