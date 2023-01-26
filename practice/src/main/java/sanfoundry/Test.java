package sanfoundry;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        List<String> products = Arrays.asList("eggs", "milk", "cheese");
        List<Double> productPrices = Arrays.asList(2.89, 2.99, 3.29, 5.97);
        List<String> productsSold = Arrays.asList("reads", "eggs", "milk", "cheese");
        List<Double> sellingPrices = Arrays.asList(2.89, 2.99, 3.29, 5.97);
        System.out.println(priceCheck(products, productPrices, productsSold, sellingPrices));

    }

    public static int priceCheck(List<String> products, List<Double> productPrices, List<String> productSold, List<Double> sellingPrices) {
        HashMap<String, ArrayList<Double>> map = new HashMap<String, ArrayList<Double>>();

        for (int i = 0; i < productSold.size(); i++) {
            String pSold = productSold.get(i);
            if (map.containsKey(pSold)) {
                ArrayList<Double> list = map.get(pSold);

                list.add(sellingPrices.get(i));
                map.put(pSold, list);
            } else {
                ArrayList<Double> list = new ArrayList<>();
                list.add(sellingPrices.get(i));
                map.put(pSold, list);
            }
        }
        HashMap<String, Double> map2 = new HashMap<String, Double>();
        for (int i = 0; i < products.size(); i++) {
            map2.put(products.get(i), productPrices.get(i));

        }

        int error = 0;
        for (Map.Entry<String, Double> map3 : map2.entrySet()) {
            String pName = map3.getKey();
            Double pCost = map3.getValue();
            if (map.containsKey(pName)) {
                ArrayList<Double> price = map.get(pName);
                for (int i = 0; i < price.size(); i++) {
                    Double sCost = price.get(i);
                    if (pCost - sCost != 0.0)
                        error++;
                }
            }
        }
        return error;
    }
}
