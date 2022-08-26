package com.firdous.wellnesscompose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun WellnessScreen(modifier: Modifier = Modifier, wellnessViewModel: WellnessViewModel = viewModel()){
        Column(modifier = modifier) {
                StatefulCounter(modifier)
                WellnessTaskList(taskList = wellnessViewModel.tasks, onCloseClick = { task->
                        wellnessViewModel.remove(task)
                })
        }

}

