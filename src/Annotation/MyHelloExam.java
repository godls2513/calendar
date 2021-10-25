package Annotation;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hell");
			if(method.isAnnotationPresent(Count100.class)) {
				for(int i=0; i<100; i++) {
					hello.hell();
				}
			}else {
				hello.hell();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
