package maratonaJava.T01_IntroducaoJava.EstruturasCondicionais;

public class EstruturasCondicionaisExercicioIfElse {
    public static void main(String[] args) {
        double anualSalary = 70000;
        double firtsPriceTax = 9.70 / 100;
        double secondPriceTax = 37.35 / 100;
        double thirdPriceTax = 49.50 / 100;
        double taxSalary;
        if (anualSalary <= 34712) {
            taxSalary = anualSalary * firtsPriceTax;
        } else if (anualSalary >= 34713 && anualSalary <= 68507) {
            taxSalary = anualSalary * secondPriceTax;
        } else {
            taxSalary = anualSalary * thirdPriceTax;
        }
        System.out.println("You will pay " + taxSalary + " Euros per year of salary");
    }
}


/*
* Operadores Lógicos - && (And) e || (Or)
*
&& (And)
* V && V = V
* V && F = F
* F && V = F
* F && F = F
*
|| (Or)
* V || V = V
* V || F = V
* F || V = V
* F || F = F
*/
