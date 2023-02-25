public class operadores {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 6;

        boolean simNao = n1 == n2;
        System.out.println("Os números são iguas? " + simNao);
        
        simNao = n1 > n2;
        System.out.println("O primeiro é maior que o segundo? " + simNao);

        simNao = n1 < n2;
        System.out.println("O primeiro é menor que o seguno? " + simNao);

        simNao = n1 != n2;
        System.out.println("Os números são diferentes? " + simNao);

        boolean cond1 = true;
        boolean cond2 = false;
        if(cond1 && cond2){
            System.out.println("Não são verdadeiras");
        } else{
            System.out.println("Uma das duas é falsa");
        }
        if(cond1 || cond2){
            System.out.println("Um das duas é verdadeira");
        }

    }
}
