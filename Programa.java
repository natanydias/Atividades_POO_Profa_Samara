public class Programa {
    public static void main(String[] args) {

        Professor prof1 = new Professor("Samara Souza");
        Turma turma1 = new Turma("BCCMANHÃ");

        turma1.setProfessor(prof1);
        turma1.resumo();

        Professor prof2 = new Professor("Natâny Dias");
        turma1.setProfessor(prof2);
        turma1.resumo();
    }
}
