import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        String [] vetor;
        int resposta;
        int tamanho;
        int buscar;
        int excluir;
        int prosseguir;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Esta é um programa para adicionar alunos a uma lista.");
        System.out.println("Informe o tamanho da lista: ");
        tamanho = scanner.nextInt();

        vetor = new String[tamanho];

        do {
            System.out.println("Lembrando que o termo 'null' significa que não há aluno naquele índice.");
            System.out.println("1. Inserir todos os alunos na lista.");
            System.out.println("2. Mostrar todos os alunos na lista.");
            System.out.println("3. Buscar um aluno da lista pelo seu índice.");
            System.out.println("4. Remover um aluno da lista pelo seu índice.");
            System.out.println("5. Finalizar programa.");
            System.out.println("Selecione o que deseja: ");
            resposta = scanner.nextInt();

            if (resposta==1) {
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Informe um aluno/a para ser inserido na posição " + i + " da lista:");
                    vetor[i] = scanner.next();
                }
            } else if (resposta==2) {
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Aluno[" + i + "] = " + vetor[i]);
                }
            } else if (resposta==3){
                System.out.println("Informe o índice do aluno que deseja buscar: ");
                buscar = scanner.nextInt();

                System.out.println("Este índice corresponde ao aluno " + vetor[buscar] + ".");

            } else if (resposta==4){
                System.out.println("Qual o índice do aluno que deseja remover?");
                excluir = scanner.nextInt();

                System.out.println("Você irá remover o aluno " + vetor[excluir] + ", deseja prosseguir? [1] Sim | [2] Não");
                prosseguir = scanner.nextInt();

                if (prosseguir==1) {
                    vetor[excluir] = null;
                    System.out.println("Aluno removido com sucesso.");
                } else if (prosseguir==2){
                    System.out.println("Aluno não removido.");
                }


            }
        } while (resposta!=5);
        System.out.println("Encerrando...");

    }
}