package com.example

import com.example.model.Company
import io.ebean.Database
import io.jooby.annotations.GET
import io.jooby.annotations.Path

@Path("/")
class Controller(val db: Database) {

    @GET("test")
    fun test(): MutableList<Company> {
        val message = CompanyGateway(db).getCompanySuggestionsBean()
        print(message)

        return message
    }
}
