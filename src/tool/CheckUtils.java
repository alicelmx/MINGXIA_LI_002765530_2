/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author limingxia
 */
public class CheckUtils {

    public static boolean checkPhoneNo(String phoneNo) {
        if (StringUtils.isBlank(phoneNo)) {
            return false;
        }

        String check = "^\\d{10}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(phoneNo);

        return matcher.matches();
    }

    public static boolean checkEmail(String email) {
        if (StringUtils.isBlank(email)) {
            return false;
        }

        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(email);

        return matcher.matches();
    }

    public static boolean checkZipCode(String zipCode) {
        if (StringUtils.isBlank(zipCode)) {
            return false;
        }

        String check = "^\\d{5}";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(zipCode);

        return matcher.matches();
    }

    public static boolean checkName(String name) {
        if (StringUtils.isBlank(name)) {
            return false;
        }

        Pattern pattern = Pattern.compile("[a-zA-Z]*");

        return pattern.matcher(name).matches();
    }

    public static Boolean checkUsername(String username) {
        if (StringUtils.isBlank(username)) {
            return false;
        }

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{6,12}$*");

        return pattern.matcher(username).matches();
    }

    // 至少8个字符，至少1个大写字母，1个小写字母和1个数字,不能包含特殊字符（非数字字母）
    public static boolean checkPassword(String password) {
        if (StringUtils.isBlank(password)) {
            return false;
        }

        String check = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(password);

        return matcher.matches();
    }
}
