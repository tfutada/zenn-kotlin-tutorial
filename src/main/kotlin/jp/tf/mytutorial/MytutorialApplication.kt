package jp.tf.mytutorial

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MytutorialApplication {
	fun commandLineRunner(): CommandLineRunner {
		return CommandLineRunner {
			println("Hello, World!")
		}
	}
	@Bean
	fun hiCommandLineRunner(): CommandLineRunner {
		return CommandLineRunner {
			println("Hi")
		}
	}
}

fun main(args: Array<String>) {
	runApplication<MytutorialApplication>(*args)
}
