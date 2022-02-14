package com.yuk.graphql

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.graphql.data.GraphQlRepository

@GraphQlRepository
interface ArtifactRepositories : CrudRepository<Artifact, String>

@Document
class Artifact(
    @Id var id: String,
    var name: String,
    var url: String,
    var snapshotsEnabled: Boolean
)