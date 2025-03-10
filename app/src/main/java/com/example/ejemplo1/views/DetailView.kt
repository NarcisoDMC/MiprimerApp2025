package com.example.ejemplo1.views

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejemplo1.components.MainButton
import com.example.ejemplo1.components.MainIconButton
import com.example.ejemplo1.components.Spacers
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(navController: NavController, id:Int){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("DETAIL VIEW") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Blue),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentView2(navController, id)
    }
}

@Composable
private fun ContentView2(navController: NavController, id:Int){
    LazyColumn {
        item {
            Text(
                text = id.toString(),
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }

        item {
            Text(
                text = id.toString(),
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }

        item {
            Text(
                text = id.toString(),
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }

        item {
            Text(
                text = id.toString(),
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }

        item {
            Text(
                text = id.toString(),
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }

        item {
            Text(
                text = id.toString(),
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}