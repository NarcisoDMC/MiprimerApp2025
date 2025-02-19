package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {
                Content()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Backimage(){
    Image(
        painter = painterResource(id = R.drawable.ic_mustang),
        contentDescription = "Mustang background",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun TextField1():TextFieldValue {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = "Valor 1") },
        placeholder = { Text(text = "Teclea el primer valor") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier.fillMaxWidth(0.8f)
    )
    return text
}

@Composable
fun TextField2():TextFieldValue{
    var text by remember { mutableStateOf(TextFieldValue(""))}
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = "Valor 1") },
        placeholder = { Text(text = "Teclea el primer valor") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier.fillMaxWidth(0.8f)
    )
    return text
}

@Composable
fun Content(){
    Column {
        Backimage()

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                ButtonCalculate()
            }
        }

    }
}

@Composable
fun ButtonCalculate(){
    var numero1 = TextField1()
    Spacer(modifier = Modifier.height(12.dp))
    var numero2 = TextField2()
    Spacer(modifier = Modifier.height(12.dp))
    var resultado by remember { mutableStateOf(0)}

    Button(
        onClick = {
            val num1 = numero1.text.toInt()
            val num2 = numero2.text.toInt()
            resultado = num1 + num2
        }){
        Text(text = "Calcular")
    }

    Text(
        text = "Resultado: $resultado",
        fontSize = 24.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(28.dp)
    )
}

