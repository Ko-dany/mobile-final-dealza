package com.example.mobile_final_dealza.features

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobile_final_dealza.ui.theme.MobilefinaldealzaTheme

@Composable
fun DetailScreen(

){
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        Text("Detail Screen")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview(){
    MobilefinaldealzaTheme {
        DetailScreen()
    }
}