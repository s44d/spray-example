package com.example


trait FighterDummyDao {

  def insertFighter(fighter : Fighter) : String = {
    "New fighter received. " + "\n Name : " + fighter.name + "\n Attack : " + fighter.attack + "\n Quote : "+ fighter.quote + "\n"
  }

  def deleteFighter(name : String) : String = {
    "Delete command received for fighter "+name  +"\n"
  }

  def getFighterByName(name : String): Fighter = name match {
    case "Ryu" => Fighter("Ryu","Hadoken !", "You must defeat my Dragon Punch to stand a chance!")
    case "Sagat" => Fighter("Sagat", "Tiger Upercut","You are not a warrior, you're a beginner!")
    case "Dhalsim" => Fighter("Dhalsim","Yoga Fire","Now you've realized the inner mysteries of yoga!")
    case _ => Fighter("None","None","None")
  }

}
