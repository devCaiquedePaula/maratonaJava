package maratonaJava.T01_IntroducaoJava.EstruturasCondicionais;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DayOfWeek diaSemana = dataHoraAtual.getDayOfWeek();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatter);

        switch (diaSemana) {
            case MONDAY:
                System.out.println("Hoje é segunda-feira, " + dataHoraFormatada);
                break;
            case TUESDAY:
                System.out.println("Hoje é terça-feira, " + dataHoraFormatada);
                break;
            case WEDNESDAY:
                System.out.println("Hoje é quarta-feira, " + dataHoraFormatada);
                break;
            case THURSDAY:
                System.out.println("Hoje é quinta-feira, " + dataHoraFormatada);
                break;
            case FRIDAY:
                System.out.println("Hoje é sexta-feira, " + dataHoraFormatada);
                break;
            case SATURDAY:
                System.out.println("Hoje é sábado, " + dataHoraFormatada);
                break;
            case SUNDAY:
                System.out.println("Hoje é domingo, " + dataHoraFormatada);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
