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

    public static final String REG_NUMBER = ".*\\d+.*";
    public static final String REG_UPPERCASE = ".*[A-Z]+.*";
    public static final String REG_LOWERCASE = ".*[a-z]+.*";
    public static final String REG_SYMBOL = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";

    public static boolean checkPhoneNo(String phoneNo) {
        if (StringUtils.isBlank(phoneNo)) {
            return false;
        }

        Pattern pattern = Pattern.compile("[0-9]*");

        return pattern.matcher(phoneNo).matches();
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

    public static String checkPassword(String password) {

        if (StringUtils.isBlank(password) || password.length() < 6 || password.length() > 10) {
            return "Password: Longer Than 6, Shorter Than 10 charater!";
        }

        int i = 0;
        if (password.matches(REG_NUMBER)) {
            i++;
        }
        if (password.matches(REG_LOWERCASE)) {
            i++;
        }
        if (password.matches(REG_UPPERCASE)) {
            i++;
        }
        if (password.matches(REG_SYMBOL)) {
            i++;
        }

        if (i < 3) {
            return "Password: Must Contain Capital Letter, Number and Symbol!";
        }

        return "";
    }

}
