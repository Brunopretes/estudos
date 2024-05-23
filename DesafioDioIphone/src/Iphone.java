import java.util.Random;
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
    Scanner scanner = new Scanner(System.in);

    public void ligar(String nome) {
        System.out.println("Ligando...");
        do {          
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("Bom dia, " + nome + "!!!" + " Tudo bem?");
    }

    public void atender() {
        String contatos[] = {"Bruno", "Thays", "Jorge", "Rafael", "Maria", "Julia", "Raul"};
        Random contatoSelecionado = new Random();
        System.out.println("Olá Bruno! É o/a " + contatos[contatoSelecionado.nextInt(contatos.length)] + " te liguei pois,...!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Sua mensagem será gravada após o sinal!");
    }

    public void tocar(String musica) {
        System.out.println();
        System.out.println("Iniciando a musica: " + musica);
        System.out.println();
        System.out.print("Deseja parar a reprodução? ( S - Sim ou N - Não ) ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        if (opcao == 'S') {
            pausar(musica);
        } else {
            tocar(musica);
        }    }

    public void pausar(String musica) {
        System.out.println("Musica " + musica + " está pausada.");
    }

    public String selecionarMusica() {

        String musicas[] = {"Evidencias", "Boi soberano", "The trooper", "The one Furgiven", "Cheia de manias", "Mulher chorona"};
        System.out.println("Lista de músicas:");
        for (int i = 0; i < musicas.length; i++) {
            System.out.printf("%d - %s\n", i + 1, musicas[i]);
        }
        int opcaoDesejada;
        System.out.println();
        do{
            System.out.print("Digite a opção desejada: ");
            opcaoDesejada = scanner.nextInt();
        }while (opcaoDesejada<=0 || opcaoDesejada>6);

        String musicaDesejada = null;
        for (int i = 0; i < musicas.length; i++) {
            if ((opcaoDesejada - 1) == i) {
                musicaDesejada = musicas[i];
            }
        }
        tocar(musicaDesejada);
        scanner.close();
        return musicaDesejada;
    }

    public void exibirPagina(String nomeDaPagina) {
        System.out.println("Exibindo a pagina : " + nomeDaPagina);
        System.out.print("Deseja adicionar nova aba? ( S - Sim ou N - Não ) ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        if (opcao == 'S') {
            adicionarNovaAba();
        } else {
            System.out.print("Você gostaria de atualizar a página? ( S - Sim ou N - Não ) ");
            char atualizarpagina = scanner.next().toUpperCase().charAt(0);
            if (atualizarpagina == 'S') {
                atualizarPagina(nomeDaPagina);
            } else {
                System.out.println("Saindo do navegador!");
            }
        }
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
        System.out.print("Deseja entrar em uma nova pagina? ( S - Sim ou N - Não ) ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        if (opcao == 'S') {
            scanner.nextLine();
            System.out.println("Digite o nome da página para navegar: ");
            String nomeDaPagina = scanner.nextLine();
            exibirPagina(nomeDaPagina);
        } else {
            System.out.println("Saindo do navegador!");
        }
    }

    public void atualizarPagina(String nomeDaPagina) {
        System.out.println("Atualizando a página!");

        exibirPagina(guardarNomePagina(nomeDaPagina));
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return !atendeu;
    }

    private static String guardarNomePagina(String nomePagina) {
        return nomePagina;
    }
}