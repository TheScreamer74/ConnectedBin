package com.example.connectbin.presentation.ui.history

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.connectbin.model.bin.Bin1
import com.example.connectbin.model.history.History
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class HistoryMenuViewModel: ViewModel() {

    private lateinit var database: DatabaseReference
    lateinit var history: History

    init {
        database = Firebase.database.reference
        retrieveData()
    }


    fun retrieveData() {
        database.child("History").child("3017620422003").get().addOnSuccessListener {
            history = History(it.child("Name").value as String,
                it.child("PackagingRecycle").value as List<String>,
                it.child("PackagingWaste").value as List<String>
            )
            Log.i("database result", "Got value ${history.packagingRecycle[0]}")
        }.addOnFailureListener{
            Log.e("firebase", "Error getting data", it)
        }
    }

}