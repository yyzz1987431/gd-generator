package io.gd.generator.api.vo;

import java.lang.annotation.*;

@Target({java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(Views.class)
public @interface View {

	String name() default "";

	Class<?> type() default Object.class;

	String[] groups() default {}; // 如果留空 则默认全

	String elementGroup() default ""; // 若为collection则是collection元素 若为map则对应value

	Class<?> keyType() default Object.class; // 若为map则是key的class

	ElementGroupType elementGroupType() default ElementGroupType.SIMPLE;

}