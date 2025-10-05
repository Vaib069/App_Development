package com.vaib.inheritenceapp

class Offspring : secondaryOrchild(), Archery, Singing{
    override fun Archer(){
        super.Archer()
        println("Archer skills enhanvedd by Offspring")
    }
    override fun sing(){
        super.sing()
        println("Singing skills enhanced by offspring")
    }
}