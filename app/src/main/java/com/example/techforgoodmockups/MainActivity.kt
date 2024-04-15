package com.example.techforgoodmockups

import android.content.res.Configuration
import android.graphics.MaskFilter
import android.os.Bundle
import android.speech.ModelDownloadListener
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.techforgoodmockups.ui.theme.CustomColor1
import com.example.techforgoodmockups.ui.theme.TechForGoodMockupsTheme
import com.example.techforgoodmockups.ui.theme.dark_CustomColor1
import com.example.techforgoodmockups.ui.theme.dark_onCustomColor1
import com.example.techforgoodmockups.ui.theme.light_CustomColor1
import com.example.techforgoodmockups.ui.theme.light_CustomColor1Container
import com.example.techforgoodmockups.ui.theme.light_onCustomColor1
import com.example.techforgoodmockups.ui.theme.light_onCustomColor1Container
import com.example.techforgoodmockups.ui.theme.mediumPriority

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TechForGoodMockupsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun CouncilView() {
    Box(
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.dunelm),
            contentDescription = null
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = MaterialTheme.colorScheme.primary,
            contentDescription = null,
            modifier = Modifier
                .offset(9.dp, -400.dp)
                .size(48.dp)
        )
        OutlinedCard(
            shape = CardDefaults.elevatedShape,
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "51.751415, -0.281774",
                    style = MaterialTheme.typography.titleLarge,
//                    fontWeight = FontWeight.Bold
                )
                Text(text = "Alban Park", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Warning,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.error,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "High Priority",
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text("Mark as filled")
                }
            }
        }
    }
}

@Composable
fun MapView() {
    Box {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.stalbans),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        OutlinedCard(modifier = Modifier.padding(16.dp)) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Filters", style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.size(8.dp))
                Row {
                    Column {
                        Text(text = "Priorities", style = MaterialTheme.typography.titleSmall)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = false, onCheckedChange = {})
                            Text(text = "All")
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = true, onCheckedChange = {})
                            Text(text = "High")
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = true, onCheckedChange = {})
                            Text(text = "Medium")
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = false, onCheckedChange = {})
                            Text(text = "Low")
                        }
                    }
                    Spacer(modifier = Modifier.size(16.dp))
                    Column {
                        Text(text = "Road Types", style = MaterialTheme.typography.titleSmall)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = false, onCheckedChange = {})
                            Text(text = "All")
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = true, onCheckedChange = {})
                            Text(text = "Main")
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = false, onCheckedChange = {})
                            Text(text = "Country")
                        }
                    }
                }

            }
        }
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = MaterialTheme.colorScheme.error,
            contentDescription = null,
            modifier = Modifier
                .offset(400.dp, 185.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = MaterialTheme.colorScheme.error,
            contentDescription = null,
            modifier = Modifier
                .offset(550.dp, 390.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = MaterialTheme.colorScheme.error,
            contentDescription = null,
            modifier = Modifier
                .offset(830.dp, 290.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = mediumPriority,
            contentDescription = null,
            modifier = Modifier
                .offset(720.dp, 325.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = mediumPriority,
            contentDescription = null,
            modifier = Modifier
                .offset(700.dp, 473.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = mediumPriority,
            contentDescription = null,
            modifier = Modifier
                .offset(723.dp, 100.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = mediumPriority,
            contentDescription = null,
            modifier = Modifier
                .offset(1120.dp, 209.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = mediumPriority,
            contentDescription = null,
            modifier = Modifier
                .offset(990.dp, 580.dp)
                .size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.LocationOn,
            tint = mediumPriority,
            contentDescription = null,
            modifier = Modifier
                .offset(200.dp, 355.dp)
                .size(48.dp)
        )
    }
}

@Composable
fun DrivingMode() {
    Box {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.driving_mode),
            contentDescription = null,
        )
        Surface(
            color = light_CustomColor1Container,
            modifier = Modifier
                .padding(start = 44.dp, top = 320.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp,
                        bottomStart = 16.dp
                    )
                )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null,
                    tint = light_onCustomColor1Container,
                    modifier = Modifier
                        .size(24.dp)
                )

                Spacer(Modifier.size(12.dp))

                Text(
                    text = "Pothole",
                    style = MaterialTheme.typography.titleLarge,
                    color = light_onCustomColor1Container,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}

@Preview
@Composable
fun CouncilViewPreview() {
    TechForGoodMockupsTheme {
        CouncilView()
    }
}

@Preview(widthDp = 1280, heightDp = 720)
@Composable
fun MapViewPreview() {
    TechForGoodMockupsTheme {
        MapView()
    }
}

@Preview
@Composable
fun DrivingModePreview() {
    TechForGoodMockupsTheme {
        DrivingMode()
    }
}