import br.com.dominio.Bootcamp;
import br.com.dominio.Curso;
import br.com.dominio.Dev;
import br.com.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        System.out.println("----------------------");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);
        System.out.println("----------------------");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


      /*  System.out.println(curso1);
        System.out.println("----------------------");
        System.out.println(curso2);
        System.out.println("----------------------");
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bruno "+devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Bruno "+devBruno.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Bruno "+devBruno.getConteudosConcluidos());
        System.out.println("XP: "+devBruno.calcularTotalXp());

        System.out.println("---------");

        Dev devThays = new Dev();
        devThays.setNome("Thays");
        devThays.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Thays "+devThays.getConteudosInscritos());
        devThays.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Thays "+devThays.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Thays "+devThays.getConteudosConcluidos());
        System.out.println("XP: "+devThays.calcularTotalXp());

    }
}