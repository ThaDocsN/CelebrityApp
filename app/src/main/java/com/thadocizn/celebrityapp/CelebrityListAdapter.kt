package com.thadocizn.celebrityapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_celebrity.view.*

/**
 * Created by charles on 13,May,2019
 */
class CelebrityListAdapter(private val list: ArrayList<Celebrity>) :
    RecyclerView.Adapter<CelebrityListAdapter.ViewHolder>() {
    class ViewHolder(val containerView: View) : RecyclerView.ViewHolder(containerView) {

        fun bindCelebrity(celebrity: Celebrity) {

            with(celebrity) {
                containerView.actorImage.setImageResource(celebrity.image)
                containerView.lblActorName.text = celebrity.name
                containerView.lblActorDes.text = celebrity.des

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelebrityListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_celebrity, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CelebrityListAdapter.ViewHolder, position: Int) {
        holder.bindCelebrity(list[position])
    }


}