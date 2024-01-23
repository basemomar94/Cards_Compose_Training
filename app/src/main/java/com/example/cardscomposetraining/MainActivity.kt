package com.example.cardscomposetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cardscomposetraining.models.Card
import com.example.cardscomposetraining.ui.theme.CardsComposeTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val cardsList: MutableList<Card> = mutableListOf()
            cardsList.add(Card(name = "Bassem Omar", number = "23232323", backGround = Color.Gray))
            cardsList.add(Card(name = "Alaa Maher", number = "545488", backGround = Color.Red))

            CardsComposeTrainingTheme {
                LazyColumn {
                    items(items = cardsList, itemContent = { item: Card ->
                        CreditCard(item)

                    })

                }
            }
        }
    }

    @Composable
    private fun CreditCard(item: Card) {
        Card(backgroundColor = item.backGround, modifier = Modifier.wrapContentWidth().wrapContentHeight().fillMaxWidth()) {
            Column {
                Text(text = item.number, modifier = Modifier.size(15.dp).wrapContentHeight().fillMaxWidth())
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = item.name, modifier = Modifier.size(12.dp).wrapContentHeight())

            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CardsComposeTrainingTheme {
        Greeting("Android")
    }
}