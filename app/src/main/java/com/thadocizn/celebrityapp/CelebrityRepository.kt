package com.thadocizn.celebrityapp

/**
 * Created by charles on 13,May,2019
 */
class CelebrityRepository {

     val list = ArrayList<Celebrity>()

    init {
        list.add(Celebrity("Angelina Jolie", "Sister of ", R.drawable.angelina_jolie, true))
        list.add(Celebrity("Audrey Hepburn", "Sister of ", R.drawable.audrey_hepburn, false))
        list.add(Celebrity("Brad Pitt", "Sister of ", R.drawable.brad_pitt, true))
        list.add(Celebrity("Elizabeth Taylor", "Sister of ", R.drawable.elizabeth_taylor, false))
        list.add(Celebrity("Ingrid Bergman", "Sister of ", R.drawable.ingrid_bergman, false))
        list.add(Celebrity("James Stewart", "Sister of ", R.drawable.james_stewart, false))
        list.add(Celebrity("Marilyn Monroe", "Sister of ", R.drawable.marilyn_monroe, false))
    }
}