package br.com.wellrocha.springbootcoroutinesstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootCoroutinesStudyApplication

fun main(args: Array<String>) {
	runApplication<SpringBootCoroutinesStudyApplication>(*args)
}
