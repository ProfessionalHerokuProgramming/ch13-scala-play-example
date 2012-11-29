package controllers

import play.api.mvc._

import com.codahale.jerkson.Json
import play.api.data.Form
import play.api.data.Forms.{mapping, text, optional}

import org.squeryl.PrimitiveTypeMode._
import models.{AppDB, Employee}


object Application extends Controller {

    def getEmployees = Action {
        val json = inTransaction {
            val employees = from(AppDB.employeeTable) (
                employeeTable => select(employeeTable)
            )
            Json.generate(employees)
        }
        Ok(json).as(JSON)
    }
}