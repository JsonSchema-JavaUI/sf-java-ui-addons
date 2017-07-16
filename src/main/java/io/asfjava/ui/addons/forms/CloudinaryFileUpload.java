package io.asfjava.ui.addons.forms;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface CloudinaryFileUpload {
	String title();
	
	String cloudName();
	
	String uploadPreset();

	String placeHolder() default "";

}
