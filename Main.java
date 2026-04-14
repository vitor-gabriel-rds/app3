import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto(); 
        int op = -1;

        while (op != 0) {
            try {
                System.out.println("\n1-Cadastrar 2-Ver 3-Add 4-Remover 0-Sair");
                op = sc.nextInt();

                if (op == 1) {
                    System.out.print("Nome: "); String n = sc.next();
                    System.out.print("Preco: "); double pr = sc.nextDouble();
                    System.out.print("Qtd: "); int q = sc.nextInt();
                    p = new Produto(n, pr, q, "Geral");
                } 
                else if (op == 2) {
                    System.out.println(p.toString());
                } 
                else if (op == 3) {
                    System.out.print("Qtd para adicionar: ");
                    p.adicionarEstoque(sc.nextInt());
                } 
                else if (op == 4) {
                    System.out.print("Qtd para remover: ");
                    int qtdRemover = sc.nextInt();
                    p.removerEstoque(qtdRemover); // Agora ele usa o valor que você digitar
                }
            } catch (Exception e) {
                System.out.println("ERRO: Digite apenas numeros no preco/quantidade!");
                sc.nextLine(); // Limpa o erro para o menu voltar a funcionar
                op = -1; 
            }
        }
        sc.close();
    }
}
