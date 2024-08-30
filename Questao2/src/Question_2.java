
public class Question_2 {
    public static void main(String[] args) {

        int escolha = 233; // Preferi deixar o número previamente definido porém
        // funciona com qualquer valor ou até mesmo com um input do usuário que seria
        // o valor da variável escolha

        String result = Fibonacci(escolha);
        System.out.println(result);

    }

    public static String Fibonacci (int escolha){
        int x = 0;
        int y = 1;
        int n = escolha;

        for (int i = 0; i < n; i++){
            y = x + y;
            x = y - x;

            if (x == escolha){
                return "O número pertence a sequência de Fibonacci e está na posição " + (i + 1) + " da sequência" ;
            }
        }
        return "O número não pertence a sequência de Fibonacci";
    }
}
