package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", TipoCliente.PESSOA_FiSICA);
        Cliente cliente2 = new Cliente("Gonzaga", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Rafael", TipoCliente.PESSOA_FiSICA);
        Cliente cliente4 = new Cliente("Donatello", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
