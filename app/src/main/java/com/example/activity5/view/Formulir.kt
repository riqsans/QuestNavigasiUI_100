@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.activity5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenisK:List<String> = listof("Laki-laki", "Perempuan"),
    OnSubmitBtnClick:() -> Unit
){
    Scaffold (modifier = Modifier,
        {
            TopAppBar(

            )
        })
}