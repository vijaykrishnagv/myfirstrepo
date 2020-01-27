package com.mystuff.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> names = Arrays.asList("Veera","Vijay","Krishna");
        
        names.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String name) {
				// TODO Auto-generated method stub
				return !name.equals("Vijay");
			}
		}).forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				// TODO Auto-generated method stub
				System.out.println(name);
				
			}
			
		});;
		
		names.stream().filter(name -> !name.equals("Vijay"))
		.forEach(name -> System.out.println(name));
        
    }
}
