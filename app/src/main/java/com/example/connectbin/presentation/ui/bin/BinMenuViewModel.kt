package com.example.connectbin.presentation.ui.bin

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.connectbin.model.bin.Bin1
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class BinMenuViewModel: ViewModel() {

    private var database: DatabaseReference = Firebase.database.reference

    private val _bin =  MutableLiveData<Bin1>()
    val bin: LiveData<Bin1>
        get() = _bin

    init {
        retrieveData()
    }

    private fun retrieveData() {
        database.child("Bin1").child("Taux").get().addOnSuccessListener {

            _bin.value = Bin1(((it.value as Double) * 100).toInt())

            Log.i("database result", "Got value ${bin.value?.taux}")
        }.addOnFailureListener{
            Log.e("firebase", "Error getting data", it)
        }
    }

}