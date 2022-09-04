
package br.com.vendas.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Dev
 * 2 primeiras tags obrigatórias para annotations
 */
@Target(ElementType.TYPE)  // Só pode ser inserida para class
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("dev")
public @interface Dev {
    
}
