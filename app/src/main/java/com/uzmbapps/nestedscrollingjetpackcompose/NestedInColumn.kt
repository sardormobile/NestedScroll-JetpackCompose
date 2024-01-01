package com.uzmbapps.nestedscrollingjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NestedInColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        ColumnSubList1()

        Spacer(modifier = Modifier.height(10.dp))
        ColumnSubList2()

        Spacer(modifier = Modifier.height(10.dp))
        ColumnSubList3()

        Spacer(modifier = Modifier.height(30.dp))
        ColumnSubList4()

    }
}

@Composable
private fun ColumnSubList1() {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        items(10) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Red)
            ) {
                Text(text = "LazyRow-1 item:$it")
            }
        }
    }
}

@Composable
private fun ColumnSubList2() {
    LazyColumn() {
        items(10) {
            Text(text = "LazyColumn item:$it")
        }
    }
}

@Composable
private fun ColumnSubList3() {
    LazyHorizontalGrid(
        modifier = Modifier
            .wrapContentSize()
            .height(200.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        rows = GridCells.Fixed(2)
    ) {
        items(10) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Yellow)
            ) {
                Text(text = "HorizontalGrid item:$it")
            }
        }
    }
}

@Composable
private fun ColumnSubList4() {
    LazyVerticalGrid(
        modifier = Modifier
            .wrapContentSize(),// or height(1000.dp)
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Fixed(4)) {
        items(90) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Green)
            ) {
                Text(text = "VerticalGrid-2 item:$it")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun NestedInColumnPreview() {
    NestedInColumn()
}