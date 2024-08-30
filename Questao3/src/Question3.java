
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Question3 {

    public static void main(String[] args) {
        try {
            File inputFile = new File("F:\\xml\\xml.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();


            List<Double> valores = new ArrayList<>();


            NodeList diasList = doc.getElementsByTagName("Dia");
            for (int i = 0; i < diasList.getLength(); i++) {
                Node diaNode = diasList.item(i);

                if (diaNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element diaElement = (Element) diaNode;
                    double valor = Double.parseDouble(diaElement.getElementsByTagName("Valor").item(0).getTextContent());
                    if (valor > 0) {  //
                        valores.add(valor);
                    }
                }
            }


            double menorValor = valores.stream().min(Double::compare).orElse(0.0);
            double maiorValor = valores.stream().max(Double::compare).orElse(0.0);


            double mediaMensal = valores.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);


            long diasAcimaDaMedia = valores.stream().filter(valor -> valor > mediaMensal).count();


            System.out.println("Menor valor de faturamento: R$ " + menorValor);
            System.out.println("Maior valor de faturamento: R$ " + maiorValor);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}