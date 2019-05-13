package com.thadocizn.celebrityapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_celebrity.view.*
import org.jetbrains.anko.startActivity

/**
 * Created by charles on 13,May,2019
 */
class CelebrityListAdapter(private val list: ArrayList<Celebrity>) :
    RecyclerView.Adapter<CelebrityListAdapter.ViewHolder>() {

    class ViewHolder(private val containerView: View) : RecyclerView.ViewHolder(containerView) {

        fun bindCelebrity(celebrity: Celebrity) {

            with(containerView) {
                actorImage.setImageResource(celebrity.image)
                lblActorName.text = celebrity.name
                lblActorDes.text = celebrity.des
                containerView.setOnClickListener {
                    context.startActivity<DetailsActivity>(
                        DetailsActivity.ACTOR_IMAGE to celebrity.image,
                        DetailsActivity.ACTOR_NAME to celebrity.name,
                        DetailsActivity.ACTOR_DES to celebrity.des

                    )
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_celebrity, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindCelebrity(list[position])
    }


}