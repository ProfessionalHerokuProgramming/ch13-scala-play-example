package models

import org.squeryl.{Schema, KeyedEntity}

case class Employee(name: Option[String]) extends KeyedEntity[Long] {
    val id: Long = 0
}

object AppDB extends Schema {
    val employeeTable = table[Employee]("employee")
}