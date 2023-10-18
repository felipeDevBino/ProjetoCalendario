public class Menu {
    
    //Instâncias importantes chamadas como estáticas para serem incluidas no método main e no método 'opcoes();'
    static Nota nota = new Nota();
    static CriaArquivoNota criaArquivoNota = new CriaArquivoNota();

    /**
     Método pricipal que executa todo o código do programa, incluindo um sistema de opção para o usuário escolher
     se quer visualizar ou não uma nota que foi criada

    @param args
    **/
    public static void main(String[] args) {

        nota.criaNota();
        System.out.println("\nDeseja visualizar alguma nota? Digite sim ou nao:"); String opcao = nota.scanner.nextLine();
        
        if(opcao.equals("sim")) {
            nota.imprimeNota();
        }else if(opcao.equals("nao")) {
            //...
        }else {
            System.out.println("Comando inválido!");
            return;
        }

        opcoes();

        nota.scanner.close();
    }

    /**
     Método para o programa enviar ao usuário a escolha de criar o arquivo .txt ou não
    **/
    public static void opcoes() {
        
        System.out.println("Deseja criar um arquivo .txt de sua(s) nota(s)? Digite sim ou nao: "); String escolha = nota.scanner.nextLine();
        
        if(escolha.equalsIgnoreCase("sim")) {
            criaArquivoNota.criaArquivoNota(nota);
        
        }else if(escolha.equalsIgnoreCase("nao")) {
            System.out.println("Programa terminado.");
            System.exit(0);
        
        }else {
            System.out.println("Comando inválido");
            opcoes();
        }
        
    }

}
