package com.river;

import com.river.helper.AnnotationConfigHelper;
import com.river.helper.ClassPathXmlHelper;
import com.river.helper.JavaBaseConfigHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlHelper.demo();
        JavaBaseConfigHelper.demo();
        AnnotationConfigHelper.demo();
    }
}
