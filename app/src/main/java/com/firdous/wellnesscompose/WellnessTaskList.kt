package com.firdous.wellnesscompose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun WellnessTaskList(
    taskList : List<WellnessTask>,
    onCloseClick: (WellnessTask)-> Unit,
    modifier: Modifier = Modifier,
){
    LazyColumn(
        modifier = modifier
    ){

        items(items = taskList, key = {task->task.id}){ task->
            WellnessTaskItem(taskName = task.label, onClose = { onCloseClick(task) })
        }
    }
}

