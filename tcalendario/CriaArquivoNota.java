import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CriaArquivoNota {
    
    /**
    Função que cria o arquivo .txt contendo as notas que foram criadas, inclusive outras 
    que forem inseridas posteriormente caso o programa seja reiniciado, este arquivo
    sempre será atualizado conforme a escolha do usuário em criar ou não o arquivo .txt
   
    @param nota  
    **/
    public void criaArquivoNota(Nota nota) {

        try {
            
        PrintStream arquivoNota = new PrintStream(new FileOutputStream("notasCriadas.txt", true));
     
            for(int n = 0; n < Nota.quantidadeDeDatas; n++) {
                arquivoNota.println("\nDia: " + nota.dia[n] + ", Mês: " + nota.mes[n] + ", Ano: " + nota.ano[n]);
                arquivoNota.println("\nConteúdo: " + nota.nota[n]);
            }
        System.out.println("\nArquivo criado com sucesso!");
        arquivoNota.close();

        }catch(FileNotFoundException e) {
            System.out.println("Não foi possível criar o arquivo .txt de sua(s) nota(s).");
        }

    }

}
