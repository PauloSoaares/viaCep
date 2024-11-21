import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um CEP: ");
        String busca = scanner.nextLine();
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        ConsultaAPI consultaAPI = new ConsultaAPI();

        try {
            Endereco endereco = consultaAPI.buscaEndereco(busca);
            System.out.println(endereco);
            geradorDeArquivo.geraArquivo(endereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }



    }
}
