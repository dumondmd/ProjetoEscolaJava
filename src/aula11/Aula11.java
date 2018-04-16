package aula11;

public class Aula11 {

    public static void main(String[] args) {
//        Visitante v1 = new Visitante();
//        v1.setNome("Juvenal");
//        v1.setIdade(22);
//        v1.setSexo("M");
//
//        System.out.println(v1.toString());

    Aluno a1 = new Aluno();
    a1.setIdade(22);
    a1.setNome("Dumon");
    a1.setMatricula(1111);
    a1.setCurso("Informatica");
    a1.pagarMensalidade();
    Bolsista b1 = new Bolsista();
    b1.pagarMensalidade();
    b1.setNome("Diogo");
    b1.setBolsa((float)260.0);
    b1.setSexo("M");
    b1.pagarMensalidade();
    }

}
