package com.uzmbapps.nestedscrollingjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
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
fun NestedInLazyColumn() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
           SubList1()
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        SubList2()
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            HorizontalGrid()
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            VerticalGrid()
        }
    }
}

@Composable
fun   SubList1() {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        items(10) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Cyan)
            ) {
                Text(text = "LazyRow item:$it")
            }
        }
    }
}


fun LazyListScope.SubList2() {
    items(20) {
        Text(text = "VerticalLazyColumn item:$it")
    }
}

@Composable
fun HorizontalGrid() {
    LazyHorizontalGrid(
        modifier = Modifier.height(176.dp),
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
fun VerticalGrid() {
    LazyVerticalGrid(
        modifier = Modifier.height(1000.dp), // or any other suitable value
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        columns = GridCells.Fixed(4)
    ) {
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
fun NestedInLazyColumnPreview() {
    NestedInLazyColumn()
}