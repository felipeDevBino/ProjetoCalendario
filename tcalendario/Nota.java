import java.util.Scanner;

public class Nota {
    
    Scanner scanner = new Scanner(System.in);
    protected static int quantidadeDeDatas;
    protected int ano[], vAno = 1500;
    protected int dia[],vDia = 1;
    protected int mes[], vMes = 1;
    protected String nota[];

    /**
     Método para a definição de quantidade, escolha de data e criação da nota 
    **/
    public void criaNota() {

        try {
            System.out.println("Digite a quantidade de datas para criar suas notas: "); Nota.quantidadeDeDatas = Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException e) {
            System.out.println("Tipo de caracter inválido, procure utilizar números inteiros: (1, 10, 15)");
        }
        if(Nota.quantidadeDeDatas < 1) {
            System.out.println("Quantidade inválida!");
            criaNota();
        }

        ano = new int[Nota.quantidadeDeDatas];
        dia = new int[Nota.quantidadeDeDatas];
        mes = new int[Nota.quantidadeDeDatas];
        nota = new String[Nota.quantidadeDeDatas];

        for(int dd = 0; dd < Nota.quantidadeDeDatas; dd++) {
            try {
            System.out.println("\nDigite o ano para criar sua nota na posição: " + dd); ano[dd] = Integer.parseInt(scanner.nextLine());
            System.out.println("\nDigite o dia para criar sua nota na posição: " + dd); dia[dd] = Integer.parseInt(scanner.nextLine());
            System.out.println("\nDigite o mês para criar sua nota na posição: " + dd); mes[dd] = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e) {
                System.out.println("Tipo de caracter inválido, procure utilizar números inteiros: (1, 10, 15)");
                criaNota();
            }
        }

        for(int cn = 0; cn < Nota.quantidadeDeDatas; cn++) {
            System.out.println("\nDigite o conteúdo da nota na posição " + cn + ": "); nota[cn] = scanner.nextLine();
        }
        
    }
    
    /**
     Método que imprime uma nota de acordo com a data que o usuário digitar para confirmar sua posição, dentro do loop
     while, se a nota for correta em seus atributos e for coerente com uma nota que exista, a nota é encontrada e o
     programa sai do loop para a impressão da nota.
    **/
    public void imprimeNota() {

        boolean notaEncontrada = false;
        
        while(!notaEncontrada) {

            try {
                System.out.println("\nDigite o ano para visualizar sua nota: "); vAno = Integer.parseInt(scanner.nextLine());
                System.out.println("\nDigite o dia para visualizar sua nota: "); vDia = Integer.parseInt(scanner.nextLine());
                System.out.println("\nDigite o mês para visualizar sua nota: "); vMes = Integer.parseInt(scanner.nextLine());
                
                if(vDia < 1 || vDia > 31 || vMes < 1 || vMes > 12 || vAno < 1500 || vAno > 2023) {
                    System.out.println("Data inválida. Verifique os limites.");
                    imprimeNota();
                }else {
                    notaEncontrada = true;
                }
            }catch(NumberFormatException e) {
                System.out.println("Tipo de caracter inválido, procure utilizar números inteiros: (1, 10, 15)");
                imprimeNota();
                return;
            }
        }

        for(int vn = 0; vn < Nota.quantidadeDeDatas; vn++) {
            if(vAno == ano[vn] && vDia == dia[vn] && vMes == mes[vn]) {
                System.out.println("\nData válida, nota encontrada:\n");
                System.out.println("Dia: " + vDia + ", Mês: " + vMes + " e Ano: " + vAno);
                System.out.println("\nConteúdo: " + nota[vn] + "\n");
                notaEncontrada = true;
                break;
            }
        }
        if(!notaEncontrada) {
            System.out.println("\nAno/Dia/Mês incorreto/s!\n");
        }

    }

}
