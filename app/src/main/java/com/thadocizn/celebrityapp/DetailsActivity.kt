package com.thadocizn.celebrityapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*
import org.jetbrains.anko.AnkoLogger

class DetailsActivity : AppCompatActivity(), AnkoLogger {

    companion object{
        const val ACTOR_NAME = "name"
        const val ACTOR_DES = "des"
        const val ACTOR_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val getActor = intent.extras

        if (getActor != null){
            val actorName  = getActor.getString(ACTOR_NAME)
            val actorDes   = getActor.getString(ACTOR_DES)
            val actorImage = getActor.getInt(ACTOR_IMAGE)

            bioActorImage.setImageResource(actorImage)
            lblActorBio.text = "$actorName - $actorDes"
        }

    }
}
