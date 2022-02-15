package com.yuk.graphql

import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.graphql.data.GraphQlRepository
import javax.persistence.Entity
import javax.persistence.Id

@GraphQlRepository
interface ArtifactRepositories : CrudRepository<Artifact, String>, QuerydslPredicateExecutor<Artifact>

@Entity
class Artifact(
    @Id var id: String,
    var name: String,
    var url: String,
    var snapshotsEnabled: Boolean
)