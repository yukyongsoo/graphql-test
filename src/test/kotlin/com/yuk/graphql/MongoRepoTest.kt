package com.yuk.graphql

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureWebGraphQlTester
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.graphql.test.tester.WebGraphQlTester

@SpringBootTest
@AutoConfigureWebGraphQlTester
class MongoRepoTest {
    @Autowired
    private lateinit var graphQlTester: WebGraphQlTester

    @Test
    fun mongoRepositorySingle() {
        graphQlTester.queryName("mongo")
            .variable("id", "spring-releases").execute()
    }

    @Test
    fun mongoRepositoryMany() {
        graphQlTester.queryName("mongoRepo").execute()
    }
}