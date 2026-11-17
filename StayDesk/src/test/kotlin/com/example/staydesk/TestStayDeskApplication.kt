package com.example.staydesk

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<StayDeskApplication>().with(TestcontainersConfiguration::class).run(*args)
}
