#!/usr/bin/env groovy
import groovy.json.*
def call(body) {
  //on définit une map qui permet de stocke les clé/valeurs
  def mapVars = [:]
  
  //récuperer le body ensuite l'intégrer dans la map qu'on vient de définir
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = mapVars
  body()

  //on récupre les valeurs ensuite on les insère
  def name = mapVars.name
  def action = mapVars.action

  println(name + " Borom album " + action + "Yalna Ko Yalla Yerem, Barki Cheikh Ibrahima" )
}
