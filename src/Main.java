import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java dev");
        bootcamp.setDescricao("Descricao Bootcamp java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos victor" + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos victor" + devVictor.getConteudosInscritos());
        System.out.println("conteudos Concluidos victor" + devVictor.getConteudosConcluidos());
        System.out.println("XP:" + devVictor.calcularTotalXp());


        System.out.println("------------");

        Dev devMelissa = new Dev();
        devMelissa.setNome("Melissa");
        devMelissa.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Melissa" + devMelissa.getConteudosInscritos());
        devMelissa.progredir();
        devMelissa.progredir();
        devMelissa.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos Melissa" + devMelissa.getConteudosInscritos());
        System.out.println("conteudos Concluidos Melissa" + devMelissa.getConteudosConcluidos());
        System.out.println("XP:" + devMelissa.calcularTotalXp());


    }
}
