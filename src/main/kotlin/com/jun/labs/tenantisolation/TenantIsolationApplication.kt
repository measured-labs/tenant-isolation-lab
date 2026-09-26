package com.jun.labs.tenantisolation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TenantIsolationApplication

fun main(args: Array<String>) {
    runApplication<TenantIsolationApplication>(*args)
}
