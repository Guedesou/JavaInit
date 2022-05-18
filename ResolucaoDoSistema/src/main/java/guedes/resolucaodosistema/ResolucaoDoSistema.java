package guedes.resolucaodosistema;
import java.awt.Dimension;
import java.awt.Toolkit;
public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("Screen width = " + d.width + " and ");
        System.out.println("Screen height = " + d.height);
    }
}
