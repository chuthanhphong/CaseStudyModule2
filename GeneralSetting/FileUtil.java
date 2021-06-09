package GeneralSetting;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String path;

    public static void writeFile(String[] content) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(StringUtils.comcat(content, StringUtils.COMMA));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile() {
        List<String> arrayContent = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayContent.add(line);

            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayContent;
    }

    public static void setFullPathFile(String filename) {
        FileUtil.path = (filename+".csv").toString();
    }
}
