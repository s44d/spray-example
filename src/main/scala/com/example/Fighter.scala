package com.example

import spray.httpx.SprayJsonSupport
import spray.json._

case class Fighter(name : String, attack : String, quote : String)

object FighterProtocol extends DefaultJsonProtocol with SprayJsonSupport {

  implicit val userFormat = jsonFormat3(Fighter.apply)

}

