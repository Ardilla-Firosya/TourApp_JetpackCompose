package com.example.jetpackcomposetourapp.ui.component

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetourapp.R
import com.example.jetpackcomposetourapp.ui.theme.JetpackComposeTheme
import com.example.jetpackcomposetourapp.ui.theme.Shapes

@Composable
fun TourItem(
    picture: Int,
    title: String,
    origin: String,
    modifier: Modifier = Modifier,
    textSize: TextUnit = 16.sp

){
    Column (
        modifier = modifier
    ){
        Image(
            painter = painterResource(picture),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(140.dp)
                .clip(Shapes.medium)
        )
        Text(
            text = title,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.ExtraBold
            )
        )
        Text(
            text = origin,
            style = MaterialTheme.typography.titleSmall.copy(
                fontSize = textSize
            ),
            color = MaterialTheme.colorScheme.secondary
        )
    }
}
@Composable
@Preview(showBackground = true)
fun TourItemPreview(){
    JetpackComposeTheme {
        TourItem(picture = R.drawable.place1, title = "Raja Ampat", origin = "Papua Barat" )
    }
}