package academy.devjava.maratonajava.introducao;

public class PrimitiveTypesExercices {

    public static void main(String[] args){

        String nome = "Ernesto";
        String endereco = "Rua dos bobos";
        double salario = 2000.0;
        String data = "10/10/2020";

        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o salario de R$ %.2f, na data %s. ",
            nome, endereco, salario, data
        );
    }

}
