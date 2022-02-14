package com.yuk.graphql.domain

class Release(
    var version: String, var status: ReleaseStatus, var current: Boolean
)