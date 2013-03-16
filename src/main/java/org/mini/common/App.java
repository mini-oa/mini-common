package org.mini.common;

import org.mini.common.utils.StringUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String input = "user_name";
        String fieldName = StringUtil.dbChartoFieldChar(input);
        System.out.println(fieldName);
        String className = StringUtil.firstLetterToUpper(fieldName);
        System.out.println(className);
    }
}
