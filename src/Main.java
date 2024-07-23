import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Linguagem de programação orientada a objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Curso de Javascript para web");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria para a linguagem Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        
        Dev dev1 = new Dev();
        System.out.println("Digite o nome do desenvolvedor: ");
        dev1.setNome(entrada.nextLine());
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ dev1.getNome() + ":\n" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + ":\n " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev1.getNome() + ":\n " + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        System.out.println("Digite o nome do desenvolvedor: ");
        dev2.setNome(entrada.nextLine());
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
        entrada.close();

    }

}
