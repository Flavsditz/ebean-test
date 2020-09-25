package com.example

import com.example.model.Company
import com.example.model.query.QCompany
import io.ebean.Database


class CompanyGateway(val db: Database) {

    fun getCompanySuggestionsBean(): MutableList<Company> {
        val companyPrefix = "lin"

        return QCompany()
                .name.like(companyPrefix)
                .findList();
    }
}