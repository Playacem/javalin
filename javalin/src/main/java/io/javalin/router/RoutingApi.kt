package io.javalin.router

import io.javalin.config.JavalinConfig
import java.util.function.Consumer

interface RoutingApi<SETUP>

fun interface RoutingApiInitializer<SETUP> {
    fun initialize(cfg: JavalinConfig, internalRouter: InternalRouter, setup: Consumer<SETUP>)
}
