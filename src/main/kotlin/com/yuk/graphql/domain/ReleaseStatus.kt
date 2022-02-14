package com.yuk.graphql.domain


enum class ReleaseStatus {
    GENERAL_AVAILABILITY, MILESTONE, SNAPSHOT

//    companion object {
//        @JsonCreator
//        fun fromName(name: String?): ReleaseStatus {
//            return Arrays.stream(values())
//                .filter { type -> type.name().equals(name) }.findFirst()
//                .orElse(GENERAL_AVAILABILITY)
//        }
//    }
}