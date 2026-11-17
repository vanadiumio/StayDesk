package com.example.staydesk

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class StayDeskApplicationTests {

    @Test
    fun contextLoads() {
    }

}
