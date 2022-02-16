package com.yuk.graphql

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.repository.CrudRepository
import org.springframework.graphql.data.GraphQlRepository

@GraphQlRepository
@Deprecated("not work by spring")
interface MongoRepo: CrudRepository<Mongo, Long>

@Document
class Mongo(
    @Id val id: Long,
    val testColumn: String
)