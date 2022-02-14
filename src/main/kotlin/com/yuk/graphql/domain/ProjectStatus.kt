package com.yuk.graphql.domain

enum class ProjectStatus {
    ACTIVE, COMMUNITY, INCUBATING, ATTIC
//
//    companion object {
//        @JsonCreator
//        fun fromName(name: String?): ProjectStatus {
//            return Arrays.stream(values())
//                .filter { type -> type.name().equals(name) }.findFirst()
//                .orElse(ACTIVE)
//        }
//    }
}