package com.firdous.wellnesscompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatefulCounter(modifier: Modifier = Modifier){

    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(modifier = modifier, count = count, onIncrement = {
        count++
    })

}

@Composable
private fun StatelessCounter(modifier: Modifier, count: Int, onIncrement:()->Unit) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text(
                text = "You've had $count glasses.", modifier = Modifier.padding(16.dp)
            )
        }
        Button(modifier = modifier.padding(top = 10.dp, start = 16.dp),
            enabled = count < 10,
            onClick = onIncrement
        )
        {
            Text(text = "Add One")
        }
    }
}