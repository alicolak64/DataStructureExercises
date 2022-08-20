import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ali Çolak
 * 17.12.2021
 */

public class Main {

    public static void main(String[] args) {

        String str = readFile("a.txt");
        HashMap<Character,Integer> frag = findFrag(str);

        Huffman huffman = new Huffman(frag.size());
        huffman.creatTree(frag);
        huffman.constructorCoding(huffman.root,"");

        System.out.println(replace(str,huffman.encoder));

    }

    public static String replace (String str,HashMap<Character,String> encoder) {

        String replaced = str;

        for (Map.Entry<Character,String> entry : encoder.entrySet()) {
            replaced = replaced.replaceAll(String.valueOf(entry.getKey()),entry.getValue());
        }

        return replaced;

    }

    public static String convert (String str) {
        String converted = str;
        int byte_length = converted.length()/8;
        return converted;

    }

    public static void printMap (HashMap<Character,Integer> frag) {
        for (Map.Entry<Character,Integer> entry : frag.entrySet()) {
            System.out.println(entry.getKey() + " - "+entry.getValue());
        }
    }

    public static HashMap <Character,Integer> findFrag (String str) {
        HashMap<Character,Integer> tempMap = new HashMap<>();
        for (char c:str.toCharArray()) {
            if (tempMap.containsKey(c))
                tempMap.put(c,tempMap.get(c)+1);
            else
                tempMap.put(c,1);
        }
        return tempMap;
    }

    public static String readFile (String path) {

        String res = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            res = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
