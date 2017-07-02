package io.swagger.codegen.utils;

/**
 * Created by famecrave on 11/9/2016.
 */
public class StringUtils {
    public static String camelToSnakeCase(String input) {
        String output = "";
        if(input != null && input.length() > 0) {
            String regex = "([a-z])([A-Z]+)";
            String replacement = "$1_$2";
            output = input
                    .replaceAll(regex, replacement)
                    .toLowerCase();
        }
        return output;
    }
}
