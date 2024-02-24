package jp.tf.mytutorial

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MytutorialApplication {
    @Bean
    fun hiCommandLineRunner(): CommandLineRunner {
        return CommandLineRunner {
            // Correctly passing a lambda that takes a String parameter
            hello("ハロー") { hi ->
                println(hi)
            }
        }
    }
}

fun hello(h: String, cmd: (String) -> Unit) {
    cmd(h)
}


fun main(args: Array<String>) {
    runApplication<MytutorialApplication>(*args)
}
