package com.example

import com.example.FighterProtocol._
import spray.routing.HttpService

// this trait defines our service behavior independently from the service actor
trait FighterService extends HttpService with FighterDummyDao {

  val myRoute =
    pathPrefix("fighter") {
      path("get"/Segment){name=>
        get{
          complete{
            getFighterByName(name)
          }
        }
      }~
      path("add"){
        post{
          entity(as[Fighter]){ fighter  =>
            complete{
              insertFighter(fighter)
            }
          }
        }
      }~
      path("delete"/Segment){ name =>
        delete{
          complete{
            deleteFighter(name)
          }
        }
      }
    }
}
