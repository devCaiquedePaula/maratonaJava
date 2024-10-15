package maratonaJava.T01_IntroducaoJava.EstruturasCondicionais;

public class EstruturasCondicionaisIfElse {
    public static void main(String[] args) {
        int age = 15;
        String categoria;

        if (age < 15) {
            categoria = "Infaltil";
        } else if (age >= 15 && age < 18) {
            categoria = "Adolescente";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}


/*
* Operadores Ternarios - (condicion) ? true : false
*
* double salary = 6000
* string donate = "I will donate 500"
* string notDonation = "Unfortunately i cant donate"
* string result = salary > 5000 ? donate : notDonation
*
* */