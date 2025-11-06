package com.example.activity5

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.activity5.view.FormIsian

enum class Navigasi{
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController:NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(navController = navController,
            startDestination =  Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang    )){
            composable (route = Navigasi.Formulirku.name){
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable (route = Navigasi.Detail.name){
                TampilData(
                    onBlackBtnClick = {
                        cancelAndBackToFormulirku(navController)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirku(navController: NavController){
    navController.popBackStack(Navigasi.Formulirku.name, inclusive = false)
}


