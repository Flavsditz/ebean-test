package com.example.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Company {
    @Id
    val companyId: UUID? = null
    val name: String = ""
    val isPublic: Boolean = true

    override fun toString(): String {
        return "Company(companyId='$companyId', name='$name', isPublic=$isPublic)"
    }
}