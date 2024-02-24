package jp.tf.hello2

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

suspend fun main() = coroutineScope {
    simpleFlow().collect { value ->
        println(value)
    }
}

fun simpleFlow() = flow {
    for (i in 1..10) {
        delay(100)
        emit(i)  // called when collected. backpressure
    }
}

