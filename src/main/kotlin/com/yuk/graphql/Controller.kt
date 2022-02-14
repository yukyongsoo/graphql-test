package com.yuk.graphql

import com.yuk.graphql.domain.Project
import com.yuk.graphql.domain.ProjectStatus
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class Controller {
    @QueryMapping
    fun queryMapping(@Argument slug: String): Project {
        return Project("a","b","c", ProjectStatus.ACTIVE)
    }

    @SchemaMapping
    fun schemaMapping(project: Project): Project {
        return Project("a","b","c", ProjectStatus.ACTIVE)
    }
}