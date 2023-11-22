package com.seeho.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.seeho.designsystem.component.RpIconToggleButton
import com.seeho.designsystem.icon.RpIcons
import com.seeho.model.data.Champion
import com.seeho.designsystem.R as designSystemR

@Preview
@Composable
fun PreviewCard(){
    ChampionCard(item = Champion("Aatrox","266","아트록스","다르킨의 검","테스트"), isBookmarked = true) {

    }
}

@Composable
fun ChampionCard(
    item: Champion,
    isBookmarked: Boolean,
    onToggleBookmark : () -> Unit
){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .size(width = 400.dp, height = 140.dp)
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(10.dp)
        ){
            AsyncImage(
                model = "https://ddragon.leagueoflegends.com/cdn/13.20.1/img/champion/${item.id}.png",
                placeholder = painterResource(id = designSystemR.drawable.ic_loading_image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp,100.dp)
            )
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = item.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp)
                )
                BookmarkButton(
                    isBookmarked = isBookmarked,
                    onClick = onToggleBookmark,
                )
            }
        }
    }
}

@Composable
fun BookmarkButton(
    isBookmarked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    RpIconToggleButton(
        checked = isBookmarked,
        onCheckedChange = { onClick() },
        modifier = modifier,
        icon = {
            Icon(
                imageVector = RpIcons.BookmarkBorder,
                contentDescription = stringResource(R.string.bookmark),
            )
        },
        checkedIcon = {
            Icon(
                imageVector = RpIcons.Bookmark,
                contentDescription = stringResource(R.string.unbookmark),
            )
        },
    )
}