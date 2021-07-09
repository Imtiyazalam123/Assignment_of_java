import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description() default "Default vlaue";
}