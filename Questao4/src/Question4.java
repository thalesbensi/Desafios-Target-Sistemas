
public class Question4 {
    public static void main(String[] args) {

        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

       double sum = SP + RJ + MG + ES + Outros;

        System.out.println("");
        System.out.println(" -----------------------------------------");

       double SPPercent = calculoPercentual(SP, sum);
        System.out.printf("São Paulo representa %.1f%% do faturamento geral", SPPercent);

        System.out.println("");
        System.out.println(" -----------------------------------------");

        double RJPercent = calculoPercentual(RJ, sum);
        System.out.printf("Rio de Janeiro representa %.1f%% do faturamento geral",
                RJPercent);

        System.out.println("");
        System.out.println(" -----------------------------------------");

        double MGPercent = calculoPercentual(MG, sum);
        System.out.printf("Minas Gerais representa %.1f%% do faturamento geral",
                MGPercent);

        System.out.println("");
        System.out.println(" -----------------------------------------");

        double ESPercent = calculoPercentual(SP, sum);
        System.out.printf("Espírito Santo representa %.1f%% do faturamento geral",
                ESPercent);

        System.out.println("");
        System.out.println(" ----------------------------------------- ");

        double OtherPercent = calculoPercentual(Outros, sum);
        System.out.printf("Outros representa %.1f%% do faturamento geral", OtherPercent);

        System.out.println("");
        System.out.println(" -----------------------------------------");

    }
    public static double calculoPercentual(double estado, double sum ){

        double percent = (estado * 100) / sum;



        return percent;


    }


}