/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import model.Encounter;

/**
 *
 * @author limingxia
 */
public class GsonUtils {

    public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
        T result = null;

        Gson gson = new GsonBuilder().create();
        try {
            result = gson.fromJson(jsonData, type);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (gson != null) {
                gson = null;
            }
        }
        return result;
    }

    public static <T> List<T> parseJsonArrayWithGson(String jsonData, Class<T> type) {
        List<T> result = null;
        Gson gson = new GsonBuilder().create();
        try {
            JsonParser parser = new JsonParser();
            JsonArray Jarray = parser.parse(jsonData).getAsJsonArray();
            if (Jarray != null) {
                result = new ArrayList<>();
                for (JsonElement obj : Jarray) {
                    try {
                        T cse = gson.fromJson(obj, type);
                        result.add(cse);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (gson != null) {
                gson = null;
            }
        }

        return result;
    }
    
    public static <T> String toJsonWithSerializeNulls(T entity) {
        entity.getClass();
        Gson gson = new GsonBuilder().serializeNulls().create();
        String result = "";
        try {
            result = gson.toJson(entity);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (gson != null) {
                gson = null;
            }
        }
        return result;
    }

//    public static String listToJson(<T> entityList) {
//        
//        String result = "";
//        Gson gson = new GsonBuilder().serializeNulls().create();
//        try {
//            result = gson.toJson(entityList);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (gson != null) {
//                gson = null;
//            }
//        }
//        
//        return result;
//    }

}
