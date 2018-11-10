package abstractfactorydemo;

public class WindowsButton  implements Button {
    @Override
    public void paint() {
        System.out.println("Ha creado un botón de Windows");
    }
}

