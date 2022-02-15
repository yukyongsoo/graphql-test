package com.yuk.graphql

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest
import org.springframework.graphql.test.tester.GraphQlTester


@GraphQlTest(Controller::class)
class ControllerTest {
    @Autowired
    private val graphQlTester: GraphQlTester? = null

    @Test
    fun queryMappingTest() {
        graphQlTester!!.queryName("queryMapping")
            .variable("slug", "spring-framework").execute()
    }

    @Test
    fun schemaMappingTest() {
        graphQlTester!!.queryName("schemaMapping")
            .variable("slug", "spring-framework").execute()
    }
}