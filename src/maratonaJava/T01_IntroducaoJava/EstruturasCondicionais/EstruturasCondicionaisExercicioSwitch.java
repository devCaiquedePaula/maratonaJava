package maratonaJava.T01_IntroducaoJava.EstruturasCondicionais;

public class EstruturasCondicionaisExercicioSwitch {
    public static void main(String[] args) {
        int dia = 1; //

        switch (dia) {
            case 1: // Domingo
            case 7: // Sábado
                System.out.println("Final de semana");
                break;
            case 2: // Segunda-feira
            case 3: // Terça-feira
            case 4: // Quarta-feira
            case 5: // Quinta-feira
            case 6: // Sexta-feira
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Valor inválido. Digite um número de 1 a 7.");
                break;
        }
    }
}
