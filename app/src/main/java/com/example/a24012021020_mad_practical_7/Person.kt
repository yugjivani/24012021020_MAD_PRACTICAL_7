package com.example.a24012021020_mad_practical_7

import java.io.Serializable

class Person(
    var id:String,
    var name:String,
    var emailId:String,
    var phoneNo:String,
    var address:String,
    var latitude:Double,
    var longitude:Double
): Serializable
