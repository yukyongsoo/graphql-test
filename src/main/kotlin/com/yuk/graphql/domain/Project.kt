package com.yuk.graphql.domain

class Project(
    val slug: String,
    val name: String,
    val repositoryUrl: String,
    val status: ProjectStatus
)