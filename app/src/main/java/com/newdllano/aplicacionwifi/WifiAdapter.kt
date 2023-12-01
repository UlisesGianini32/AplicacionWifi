package com.newdllano.aplicacionwifi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WifiAdapter (private var countries: List<Wifi>): RecyclerView.Adapter<WifiAdapter.CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {

        val inflador = LayoutInflater.from(parent.context)

        val view = inflador.inflate(R.layout.item_wifi, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.render(country)

        //aquí se aplica la lógica. ej: onClickListener
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.wifi_name)
        val contraseña: TextView = view.findViewById(R.id.Wifi_pass)
        val direccion: TextView = view.findViewById(R.id.Wifi_ip)

        fun render(wifi: Wifi) {
            name.text = wifi.name
            contraseña.text = wifi.pass
            direccion.text = wifi.ip
        }
    }
}