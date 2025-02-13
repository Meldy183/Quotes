package com.example.main

import android.content.res.Resources.Theme
import android.graphics.drawable.shapes.Shape
import android.widget.ImageButton
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.main.model.Card
import com.example.main.model.data
import com.example.main.ui.theme.AppTheme
import com.example.main.ui.theme.shapes

@Composable
fun App() {
    ListOfCards(data)
}

@Composable
fun ListOfCards(items: List<Card>) {
    Surface {
        Scaffold(topBar = { TopAppBar() }) { it ->
            LazyColumn(contentPadding = it) {
                items(items) { it ->
                    DrawCard(
                        exm = it,
                        modifier = Modifier.padding( vertical = 16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun DrawCard(exm: Card, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colorScheme.primaryContainer
        else MaterialTheme.colorScheme.tertiaryContainer
    )
    Card(modifier = modifier.fillMaxWidth()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = color)

        ) {
            WriteTitle(exm.name, modifier = Modifier.padding(top = 8.dp))
            DrawImage(exm.image, { expanded = !expanded })
            if (expanded) {
                WriteInfo(exm.text, modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp))
            }
        }
    }
}

@Composable
fun DrawImage(
    @DrawableRes image: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    Box(modifier = Modifier.clickable { onClick() }) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .clip(shape = shapes.small)
        )
    }
}

@Composable
fun WriteInfo(@StringRes text: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = text),
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier
    )
}

@Composable
fun WriteTitle(@StringRes text: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = text),
        style = MaterialTheme.typography.displayLarge,
        modifier = modifier

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.dumbbell),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(shape = shapes.small)
                )
                Spacer(modifier = Modifier.padding(4.dp))
                Text(
                    text = stringResource(R.string.appBar),
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }
    )
}