package com.example.connectbin.presentation.ui.bin

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.connectbin.model.bin.Bin1
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class BinMenuViewModel: ViewModel() {

    private lateinit var database: DatabaseReference
    lateinit var bin: Bin1

    init {
        database = Firebase.database.reference
        retrieveData()
    }

    fun retrieveData() {
        database.child("Bin1").child("Taux").get().addOnSuccessListener {

            bin = Bin1(it.value as Double?)
            Log.i("database result", "Got value ${bin.taux}")
        }.addOnFailureListener{
            Log.e("firebase", "Error getting data", it)
        }
    }

}