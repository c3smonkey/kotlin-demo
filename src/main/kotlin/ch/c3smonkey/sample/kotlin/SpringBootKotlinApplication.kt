package ch.c3smonkey.sample.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// VM arguments : -noverify
@SpringBootApplication
class SpringBootKotlinApplication

fun main(args: Array<String>) {
	System.setProperty("spring.main.lazy-initialization", "true")
	runApplication<SpringBootKotlinApplication>(*args)
}
