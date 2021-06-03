package csv;

import java.io.*;
import java.util.*;
import java.io.FileReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;

import static java.util.stream.Collectors.toList;

public class ReadCSV {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Working" );
        String file = "/Users/hannamurai/Desktop/Product_catalog_Kristin.csv";

        List<Product> products = new CsvToBeanBuilder(new FileReader(file))
                .withType(Product.class)
                .build()
                .parse();
        List<Product> updated = products.stream().filter(p -> "Hair Topper".equals(p.getCategory())).collect(toList());

        //====================WORKING PART=================
        List<String[]> list = new ArrayList<>();
        for (Product product : updated) {
            String[] pr = {product.getId(), product.getTitle(), product.getCategory(), product.getAreaOfHairLoss(), product.getLength(), product.getPriceRange(), product.getStageHairLoss(), product.getTexture()};
            list.add(pr);
        }
        String[] pr1 = {"Id", "Title", "Category", "Area of Hair Loss", "Length", "Price Range", "Stage of Hair Loss", "Texture"};
        list.add(0, pr1);

        try (CSVWriter writer = new CSVWriter(new FileWriter("/Users/hannamurai/Desktop/toppers.csv"))) {
            writer.writeAll(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
//======================STREAM???====================
//        List<Product> newList = updated.stream().collect(toList());
//        List<String> list1 = updated.stream()
//                .map(object -> Objects.toString(object, null))
//                .collect(Collectors.toList());
//        String[] stringArray = list1.toArray(new String[0]);
//        System.out.println(stringArray);
//        List<String> myStringList = new ArrayList<String>(stringArray.length);
//        for (String s:stringArray) {
//            myStringList.add( s );
//        }
//        try (CSVWriter writer = new CSVWriter(new FileWriter("/Users/hannamurai/Desktop/toppers.csv"))) {
//            writer.writeAll(Collections.singleton(stringArray));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
   

    }


}
