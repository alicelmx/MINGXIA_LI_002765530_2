/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author limingxia
 */
public class JsonFileUitls {

    public static <T> List<T> readJsonFileToModel(File file, Class<T> type) {
        List<T> result = null;

        try {
            String json = FileUtils.readFileToString(file, "utf-8");
            result = GsonUtils.parseJsonArrayWithGson(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void writeModeltoJsonfile(String content, File file) {
        // TODO 会清空吗？
        try {
            FileUtils.writeStringToFile(file, content, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
