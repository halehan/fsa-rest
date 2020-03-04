package com.halehan.demo.rest.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity // This tells Hibernate to make a table out of this class
class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null
    var studyid: Int? = null
    var firstname: String? = null
    var lastname: String? = null
        private set
    var email: String? = null
    var status: String? = null

    fun setLastName(lastName: String?) {
        lastname = lastName
    }

}