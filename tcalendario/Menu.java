public class Menu {
    
    static Nota nota = new Nota();
    static CriaArquivoNota criaArquivoNota = new CriaArquivoNota();

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
