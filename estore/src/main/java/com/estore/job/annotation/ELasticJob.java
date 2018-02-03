package com.estore.job.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhaolg on 2018/2/2
 *
 * @return
 * @throws Exception
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ELasticJob {

    @AliasFor("cron")
    String value() default "";

    @AliasFor("value")
    String cron() default "";

    String jobName() default "";

    int shardingTotalCount() default 1;

    String shardingItemParameters() default "";

    String jobParameter() default "";

    String dataSource() default "";

    String description() default "";

    boolean disabled() default false;

    boolean overwrite() default true;


}
