package jp.tf.mytutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MytutorialApplication

fun main(args: Array<String>) {
	runApplication<MytutorialApplication>(*args)
}
